package hello;

import java.util.Scanner;

public class DecomposeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int result = 0;
		number = in.nextInt();
//		do
//		{
//			int digit = number % 10;
//			result = result*10+digit; //有点取巧（原：253-->2*100+5*10+3*1 后：[2*10+5]*10+3）(700-->7)
//			System.out.print(digit);//一个一个输出的，有3个数字
//			number = number/10;
//		}while (number>0);
		while (number>0)  //如果是0的话会输出0
		{
			int digit = number % 10;
			result = result*10+digit; //有点取巧（原：253-->2*100+5*10+3*1 后：[2*10+5]*10+3）(700-->7)
			System.out.print(digit);//一个一个输出的，有3个数字
			number = number/10;
		}
		System.out.println();  //输出一个空行
		System.out.println(result); //输出一个整数
	}

}
