package fox_and_rabbit;
import java.util.ArrayList;

import javax.swing.JFrame;

import animal.*;
import cell.Cell;
import field.*;

public class FoxAndRabbit {
  private Field theField;
  private View theView;

  public FoxAndRabbit(int size) {
	//准备狐狸和兔子的数据
    theField = new Field(size, size);
    for (int row = 0; row < theField.getHeight(); row++) {
      for (int col = 0; col < theField.getWidth(); col++) {
        double probability = Math.random();
        if (probability < 0.05) {
          theField.place(row, col, new Fox());
        } else if (probability < 0.15) {
          theField.place(row, col, new Rabbit());
        }
      }
    }
    //准备一个窗口
    theView = new View(theField);
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setTitle("Cells");
    frame.add(theView);
    frame.pack();
    frame.setVisible(true);
  }
  
  public void start(int steps) {
    for (int i = 0; i < steps; i++) {
      step();
      theView.repaint();
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  /**1：Java中try catch 就是为了异常的抛出来使用
   * 2：try {用来判断这个大括号里面的代码是否有错，有错的话就会执行catch里面的代码} 
   * 3：catch{相反来说}
   * try catch的作用：当程序发生错误时，能够保证程序继续执行下去。
   * Catch 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，try 后面的 catch 块就会被检查。
   * 如果发生的异常包含在 catch 块中，异常会被传递到该 catch 块，这和传递一个参数到方法是一样。*/
  
  /**System.Threading.Thread.Sleep(2000)意思是将当前线程休眠2秒。
   * Thread.Sleep()方法用于将当前线程暂停一定时间，时间单位是毫秒，1000毫秒= 1秒*/
  
	  /**e.printStackTrace();是打印异常的堆栈信息，指明错误原因，其实当发生异常时，
   * 通常要处理异常，这是编程的好习惯，所以e.printStackTrace()可以方便你调试程序*/

  public void step() {
    for (int row = 0; row < theField.getHeight(); row++) {
      for (int col = 0; col < theField.getWidth(); col++) {
        Cell cell = (Cell) theField.get(row, col);
        if (cell != null) {
          Animal animal = (Animal) cell;
          animal.grow();
          if (animal.isAlive()) {
            // *move
            Location loc = animal.move(theField.getFreeNeighbor(row, col));
            if (loc != null)
              theField.move(row, col, loc);
            // *eat
            Cell[] neighbor = (Cell[]) theField.getNeighbor(row, col);
            ArrayList<Animal> listRabbit = new ArrayList<Animal>();
            for (Cell an : neighbor) {
              if (an instanceof Rabbit) {
                listRabbit.add((Rabbit) an);
              }
            }
            if (!listRabbit.isEmpty()) {
              Animal fed = animal.feed(listRabbit);
              if (fed != null)
                theField.remove((Cell) fed);
            }
            // *breed
            Animal baby = animal.breed();
            if (baby != null) {
              theField.placeRandomAdj(row, col, (Cell) baby);
            }
          } else {
            theField.remove(row, col);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    FoxAndRabbit fnr = new FoxAndRabbit(50);
    fnr.start(100);
  }
}
