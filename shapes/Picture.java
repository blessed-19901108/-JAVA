package shapes;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


/*JFrame:在java中，JFrame是官方提供的一个类，这个类的主要功能是使用该类可以快速的开发出Java界面应用程序（c/s架构），
 * 属于java.swing知识体系；它是屏幕上window的对象，能够最大化、最小化、关闭。*/

/*JPanel:JPanel 是Java图形用户界面(GUI)工具包swing中的面板容器类，包含在javax.swing 包中，是一种轻量级容器，
 * 可以加入到JFrame窗体中。*/
 
public class Picture extends JFrame {
	private static final long serialVersionUID = 1L;//笔记本里有解释
	private int width;
	private int height;
	
	private ArrayList<Shape> listShape = new ArrayList<Shape>();
	
	private class ShapesPanel extends JPanel {
		private static final long serialVersionUID = 1L;

		//容器之所以可以被for-each遍历是因为大多数容器的的父类都继承了iterable接口	
		/*Iterator提供了一种统一遍历集合元素的方式，使用Iterator对象可以不用关心具体的集合对象的具体类型和内部实现，统一使用Iterator对象方法就可以实现；
		Iterable接口是为了foreach循环设计的，Iterable接口表示可以返回Iterator对象，最终还是使用Iterator遍历；*/

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			for ( Shape s : listShape )
			{
				s.draw(g);
			}			
		}
		
	}
	
	public void add(Shape s)
	{
		listShape.add(s);
	}

	public Picture(int width, int height)
	{
		add(new ShapesPanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//笔记本里有，EXIT_ON_CLOSE（在 JFrame 中定义）:使用 System exit 方法退出应用程序
		this.width = width;
		this.height = height;
	}
	
	public void draw()
	{
		setLocationRelativeTo(null);
		setSize(width, height);
		setVisible(true);
	}
}
