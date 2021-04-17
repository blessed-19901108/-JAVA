package cell;

import java.awt.Graphics;
 
public class Cell {
	private boolean alive = false;
	
	public void die() { alive = false; }
	public void reborn() { alive = true; }
	public boolean isAlive() { return alive; }
	
	public void draw(Graphics g, int x, int y, int size) {
		g.drawRect(x, y, size, size);//画个方框
		if ( alive ) {//如果是活着的，那这个方框就要被填起来
			g.fillRect(x, y, size, size);
		}
	}
}
