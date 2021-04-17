package field;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import cell.Cell;

public class View extends JPanel { //JPanel-->JAVA的图形库中的用来表达一块画面的东西
	private static final long serialVersionUID = -5258995676212660595L;
	private static final int GRID_SIZE = 16; //GRID_SIZE：网格大小
	private Field theField;
	
	public View(Field field) {
		theField = field;
	}

	
	//显示一个窗口，得到一个Graphics g的对象，是要画的东西
	@Override
	public void paint(Graphics g) {
		//paint(g)函数会重绘图像，要加上super.paint(g)，表示在原来图像的基础上，再画图。
		super.paint(g);
		for ( int row = 0; row<theField.getHeight(); row++ ) {
			for ( int col = 0; col<theField.getWidth(); col++ ) {
				Cell cell = theField.get(row, col);//从field中得到每一个cell(格子)
				if ( cell != null ) {//如果这个cell是有的，就让cell去draw
					cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
				}
			}
		}
	}

	/*Dimension 类封装单个对象中组件的宽度和高度（精确到整数）。该类与组件的某个属性关联。由 Component 类和
	 * LayoutManager 接口定义的一些方法将返回 Dimension 对象。通常，width 和 height 的值是非负整数。
	 * 允许创建 dimension 的构造方法不会阻止您为这些属性设置负值。如果width 或 height 的值为负，则由其他
	 * 对象定义的一些方法的行为是不明确的。*/
	
	/*Dimension指的是表示组建宽和高的一个类，好像可以Dimension d = new Dimension(300,200)，
	 * 这样来实例化这个类，进而可以初始化组建的宽高属性。getPreferredSize()，好像是获取组建的预定义尺寸吧*/
	
	/*Dimension:尺寸 getPreferredSize():得到首选的尺寸（）*/
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
	}

	public static void main(String[] args) {
		Field field = new Field(10,10);
		for ( int row = 0; row<field.getHeight(); row++ ) {
			for ( int col = 0; col<field.getWidth(); col++ ) {
				field.place(row, col, new Cell());
			}
		}
		View view = new View(field);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Cells");
		frame.add(view);
		frame.pack(); //JFrame.pack() 是 根据窗口里面的布局及组件的preferedSize来确定frame的最佳大小
		frame.setVisible(true);
	}

}
