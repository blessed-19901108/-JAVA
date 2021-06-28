package calculation;
/**12． 用面向对象的知识编写一个能进行加、减、乘、除运算的Java程序。要求：
*操作数随机生成:int num = min + (int)(Math.random() * (max-min+1));
*能统计题目的数量、使用异常处理机制。
*/

public class Calculation {
	public int a;
	public int b;
	public int d;
	public int sum = 0;
	
	//生成在一定范围的两个随机操作数
	public void Random(int a,int b) {
		this.a = a+(int)(Math.random()*(b-a+1));
		this.b = a+(int)(Math.random()*(b-a+1));
	}
	
	//加减乘除运算
	public void Add() {
		System.out.println("a="+a+";"+"b="+b);
		System.out.println("a+"+"b="+(a+b));
	}
	public void Subtract() {
		System.out.println("a="+a+";"+"b="+b);
		System.out.println("a-"+"b="+(a-b));
	}	
	public void Multiply() {
		System.out.println("a="+a+";"+"b="+b);
		System.out.println("a*"+"b="+(a*b));
	}	
	public void Divide(){
		System.out.println("a="+a+";"+"b="+b);
		System.out.println("a/"+"b="+(a/b));
	}
	
	//输出提示文字
	public void Tips() {
		System.out.println("请选择接下来要做的算数操作：");
		System.out.println("按“1”表示选择加法");
		System.out.println("按“2”表示选择减法");
		System.out.println("按“3”表示选择乘法");
		System.out.println("按“4”表示选择除法");
	}
	public void Tips2() {
		System.out.println("按“0”表示不做算数运算并统计题目的数量");
		System.out.println("按非零的数字键表示继续做算数运算");
	}
	
	//选择运算
	public void Select(int a) {
		switch(a) {
			case 1:
				Add();
				break;
			case 2:
				Subtract();
				break;
			case 3:
				Multiply();
				break;
			case 4:
				Divide();
				break;
		}
		sum++;
	}

	
	//统计题目的数目
	public void Sum() {
		System.out.println("总共做的题目数量："+sum+"题");
	}
	
	

}
