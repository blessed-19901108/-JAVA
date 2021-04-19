package field;

import java.util.ArrayList;

import cell.Cell;

public class Field {
  private int width;
  private int height;
  private Cell[][] field;// 声明有这么个数组变量,但未承接任何对象
  private static final Location[] adjacent = { //adjacent:邻近的
    new Location(-1, -1), new Location(-1, 0), new Location(-1, 1),
    new Location(0, -1), new Location(0, 0), new Location(0, 1),
    new Location(1, -1), new Location(1, 0),new Location(1, 1),
  };

  public Field(int width, int height) {
    this.width = width;
    this.height = height;
    field = new Cell[height][width];
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public Cell place(int row, int col, Cell cell) {
    // !这里的Cell o并非Cell类的对象,而是实现了Cell接口的对象
    field[row][col] = cell;
    Cell ret = field[row][col];
    return ret;
  }

  public Cell get(int row, int col) {
    return field[row][col];
  }

  /**和下面getFreeNeighbor一样，只不过if()的条件不一样*/
  public Cell[] getNeighbor(int row, int col) {
    ArrayList<Cell> list = new ArrayList<Cell>();
    for (int i = -1; i < 2; i++) {
      for (int j = -1; j < 2; j++) {
        int r = row + i;
        int c = col + j;
        if (r > -1 && r < height && c > -1 && c < width && !(r == row && c == col)) {
          list.add(field[r][c]);
        }
      }
    }
    return list.toArray(new Cell[list.size()]);
  }

  public Location[] getFreeNeighbor(int row, int col) {
    ArrayList<Location> list = new ArrayList<Location>();
    /**下面这个for循环，首先本方法传入一个坐标，以该坐标为原点，向周边移动就可得到邻近得到坐标（+1或者-1）
     * 再将空的临近的坐标加到list中，再将容器类的list转化为数组类的list。*/
    for (Location loc : adjacent) {
      int r = row + loc.getRow();
      int c = col + loc.getCol();
      if (r > -1 && r < height && c > -1 && c < width && field[r][c] == null) {
        list.add(new Location(r, c));
      }
    }
    // !学着点
    return list.toArray(new Location[list.size()]);
  }
  /**ArrayList的toArray,ArrayList提供了一个将List转为数组的一个非常方便的方法toArray。
   * toArray有两个重载的方法：1.list.toArray();2.list.toArray(T[]  a);
   * 对于第一个重载方法，是将list直接转为Object[] 数组；
   * 第二种方法是将list转化为你所需要类型的数组，当然我们用的时候会转化为与list内容相同的类型。*/

  /**安排一个随机的空的位置*/
  public boolean placeRandomAdj(int row, int col, Cell cell) {
    boolean ret = false;
    Location[] freeAdj = getFreeNeighbor(row, col);
    if (freeAdj.length > 0) {
      int idx = (int) (Math.random() * freeAdj.length);
      field[freeAdj[idx].getRow()][freeAdj[idx].getCol()] = cell;
      ret = true;
    }
    return ret;
  }

  public void clear() {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        field[i][j] = null;
      }
    }
  }

  /**如果被吃了就被清除*/
  public void remove(Cell fed) {
    for (int row = 0; row < height; row++) {
      for (int col = 0; col < width; col++) {
        if (field[row][col] == fed) {
          field[row][col] = null;
          break;
        }
      }
    }
  }

  /**删除原来在格子里的生物，同时让一个Cell类的变量指向那个格子，即使Cell的对象还没有被创建出来*/
  public Cell remove(int row, int col) { // *函数重构
    field[row][col] = null;
    Cell ret = field[row][col];
    return ret;
  }

  /**让field[loc.getRow()][loc.getCol()]这个变量指向field[row][col]*/
  public void move(int row, int col, Location loc) {
    field[loc.getRow()][loc.getCol()] = field[row][col];
    remove(row, col);
  }
}
