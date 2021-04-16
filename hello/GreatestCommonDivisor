package hello;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
/*      //枚举
		int gcd = 1; //如果两个数没有最大公约数，那么默认值就是1 gcd为最大公约数英文的缩写
		for(int i = 2;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd = i;
			}
		}
		System.out.println(gcd);
*/
		//辗转相除法
		int oa = a; //original a原来的a
		int ob = b;
		while(b!=0)
		{
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println(oa+"和"+ob+"最大公约数是"+a);
	}

}
