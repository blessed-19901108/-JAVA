package hello;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Scanner in = new Scanner(System.in);
		int number;
		int count = 0;
		int sum = 0;
		number = in.nextInt();
//		while(number!=-1) //while可能一次都没进去过，count=0
//		{
//			sum = sum + number;
//			count = count + 1;
//			number = in.nextInt();
//		}
		do
		{
			number = in.nextInt();
			if(number!=-1)
			{
				sum = sum + number;
				count = count + 1;
			}
		}while(number!=-1);
		if(count>0)  
		{
			System.out.println(sum*1.0/count);
		}
*/
/*		
		Scanner in = new Scanner(System.in);
		int x;
		int[] numbers = new int [100];//定义一个int数组型的变量numbers，初始化该数组，使其存放100个int型的值，这个值为0
		int count = 0;                //（创建一个数组，里面放100个int型的数字,为0）
		int sum = 0;
		x = in.nextInt();
		while(x!=-1) //while可能一次都没进去过，count=0
		{
			numbers[count] = x;//往数组中存入数字
			sum = sum + x;
			count = count + 1;
			x = in.nextInt();
		}
		if(count>0)  
		{
			double average = sum/count;			
			for(int i=0;i<count;i++) //此时的count表示数的个数
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(sum*1.0/count);
*/
		Scanner in = new Scanner(System.in);
		int cnt ;              
		int sum = 0;
		cnt = in.nextInt();  //让用户告诉我们要读入多少个数字
		if(cnt>0) //while可能一次都没进去过，count=0
		{
			int[] numbers = new int [cnt];
			for(int i=0;i<cnt;i++)
			{
				numbers[i] = in.nextInt();//往数组中存入数字
				sum += numbers[i];
			}	
			double average = sum/cnt;	
			for(int i=0;i<cnt;i++) //此时的count表示数的个数
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(average);
		}
	}

}
