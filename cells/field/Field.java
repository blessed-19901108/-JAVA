package field;

import java.util.ArrayList;

import cell.Cell;

public class Field {
	private int width;
	private int height;
	private Cell[][] field; //维持好一个二维数组
	
	public Field(int width, int height) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	//放细胞 public Cell place:Cell是返回值
	public Cell place(int row, int col, Cell o) {
		Cell ret = field[row][col];//细胞类的对象ret = field二维数组中第row行第col列的细胞类的对象  //全部都是引用变量，直接赋值地址
		field[row][col] = o;
		return ret;
	}
	
	//拿细胞
	public Cell get(int row, int col) {
		return field[row][col];
	}
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				int r = row+i;
				int c = col+j;
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
	
	public void clear() {
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}
}
