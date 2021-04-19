package animal;

import java.awt.Graphics;

import java.awt.Color;
import java.util.ArrayList;

import cell.Cell;

/**
 * *Fox实现接口Cell,使Fox对象能间接传给Field
 */
public class Fox extends Animal implements Cell {
  public Fox() {
    super(20, 4);
  }

  
  /**用颜色的深浅来表明animal衰老的程度*/
  @Override // 实现接口Cell中的draw()
  public void draw(Graphics g, int x, int y, int size) {
    int alpha = (int) ((1 - getAgePercent()) * 255);
    g.setColor(new Color(0, 0, 0, alpha));
    g.fillRect(x, y, size, size);
  }
  /**Color(0, 0, 0, alpha):
   * 前三个分量RGB颜色模式中的参数，第四个alpha分量指透明的程度。当alpha分量为255时，
   * 表示完全不透明，正常显示；当alpha分量为0时，表示完全透明，前三个分量不起作用，
   * 而介于0——255之间的值可以制造出颜色不同的层次效果。*/
  /**fillRect(int x, int y, int width, int height)填充一个矩形（实心）*/
   

  /**只是生成一个新的狐狸，并没有安排位置*/
  @Override
  public Animal breed() {
    Animal ret = null;
    if (isBreedable() && Math.random() < 0.05) {
      ret = new Fox();
    }
    return ret;
  }

  @Override
  public String toString() {
    return ("Fox:" + super.toString());
  }

  /**随机吃一个兔子加两岁*/
  @Override
  public Animal feed(ArrayList<Animal> neighbor) {
    Animal ret = null;
    if (Math.random() < 0.2) {
    	/**ArrayList<>动态数组,.get可以通过下标索引到容器中的一个对象,.size则是得到动态数组中的个数*/
      ret = neighbor.get((int) (Math.random() * neighbor.size()));
      longerLife(2);
    }
    return ret;
  }
}
