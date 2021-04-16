package hello;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = (int)Math.random()*100+1; //[0,1)-->[0,100)-->[1,101)
		int a;                                 //产生一个[0，1)之间的小数
		int count = 0;
		a = in.nextInt();
		do
		{
			count = count + 1;
			if(a>number)
			{
				System.out.println("偏大");
			}
			if(a<number)
			{
				System.out.println("偏小");
			}

		}while(a!=number);
		System.out.println("恭喜你猜对了。你猜了"+count+"次");
	}

}
