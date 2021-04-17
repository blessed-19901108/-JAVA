package cellmachine;

import javax.swing.JFrame;

import cell.Cell;
import field.Field;
import field.View;

public class CellMachine {

	//实现了业务逻辑
	public static void main(String[] args) {
		
		//准备数据-->准备一个file，放细胞
		Field field = new Field(30,30);
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				Cell cell = field.get(row, col);
				/*Math.random()是令系统随机选取大于等于0.0 且小于1.0 的伪随机double 值，是Java语言常用代码。 
				例如：double a=Math.random()*(3-1)+1，设置一个随机1到3的变量*/
				if ( Math.random() < 0.2 ) { 
					cell.reborn();
				}
			}
		}
		
		//准备一个view，画出一个静态的窗口
		View view = new View(field);
		JFrame frame = new JFrame();//看到的一个图形的窗口：JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置一个默认的关闭的操作-->保证将来去按那个“叉叉”可以顺利的关闭
		frame.setResizable(false);//不可以改变大小
		frame.setTitle("Cells");//设置窗口的名字
		frame.add(view);//在这个frame里面把刚才那个view加进去
		frame.pack();//让frame自己决定一下大小
		frame.setVisible(true);//画出frame（使之可见）
		
		
		//把view与field联系起来 每一轮取出相应的格子，用field的方法去得到所有的邻居，根据邻居活着的数量判断我自己应该怎么办
		for ( int i=0; i<1000; i++ ) {//做了一千步
			//遍历整个field，取出来file中的每一个单元
			for ( int row = 0; row<field.getHeight(); row++ ) {
				for ( int col = 0; col<field.getWidth(); col++ ) {
					Cell cell = field.get(row, col);
					//让field找到每个格子的邻居
					//遍历所有的邻居，如果邻居是活着，活着的邻居数量++
					Cell[] neighbour = field.getNeighbour(row, col);
					int numOfLive = 0;
					for ( Cell c : neighbour ) {
						if ( c.isAlive() ) {
							numOfLive++;
						}
					}
					System.out.print("["+row+"]["+col+"]:");
					System.out.print(cell.isAlive()?"live":"dead");
					System.out.print(":"+numOfLive+"-->");
					//核心代码，根据邻居的数量判断我自己是否应该活着
					if ( cell.isAlive() ) {
						if ( numOfLive <2 || numOfLive >3 ) {
							cell.die();
							System.out.print("die");
						}
					} else if ( numOfLive == 3 ) {
						cell.reborn();
						System.out.print("reborn");
					}
					
					System.out.println();
				}
			}
			System.out.println("UPDATE");
			frame.repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
