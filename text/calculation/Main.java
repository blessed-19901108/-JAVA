package calculation;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculation c1 = new Calculation();
		int j = 1;
		do {
			System.out.println("请输入两个数确定两个随机操作数的所属范围");
			//a,b表示随机数的范围
			int a = in.nextInt();
			int b = in.nextInt();
			c1.Random(a,b);
			//提示选择运算
			c1.Tips();
			int c = in.nextInt();
			
			try {
				c1.Select(c);
			}catch(ArithmeticException e)
			{
				System.out.println("程序运行出错了哦，被除数不能为零！！！");
				System.exit(1);
			}	
			System.out.println("请选择是否结束算数运算并统计题目的数量");
			c1.Tips2();
			j = in.nextInt();
		}while(j!=0);
		c1.Sum();
	}

}
