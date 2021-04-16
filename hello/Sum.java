package hello;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		int sign = 1;
		for(int i = 1;i<=n;i++)
		{
//			sum += 1.0/i; //全正
			
//			sum += sign*1.0/i; //一正一负（符号变化）
//			sign = -sign;  //这个可以放在for里面
			               //for里面是我们唯一可以用逗号将几个表达式拼起来变成一个大表达式的地方
//			if(i%2==1)    //一正一负（位置变化）
//			{
//				sum += sign*1.0/i;
//			}
//			else
//			{
//				sum -= sign*1.0/i;
//			}
		}
		System.out.println(sum);
		System.out.printf("%.2f",sum); //printf格式控制(会四舍五入)
	}

}
