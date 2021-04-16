package hello;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		//判断素数
 		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime = 0;  //建立一个flag
				System.out.println(n+"不是素数,i="+i);
				break;
			}
		}
		if(isPrime == 1)
		{
			System.out.println(n+"是素数");
		}
		else
		{
			System.out.println(n+"不是素数");
		}
*/
		//输出100以内的素数
/*		Scanner in = new Scanner(System.in);
		for(int n = 2;n<100;n++)
		{
			int isPrime = 1;  //每判断一次就要重新赋值
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime = 0;  //建立一个flag
					break;
				}
			}
			if(isPrime == 1)
			{
				System.out.print(n+" ");
			}
		}
*/
/*		//输出前50个素数
		Scanner in = new Scanner(System.in);
		int count = 0;
		int n=2;
		for(count = 0;count<50;)
		{
			int isPrime = 1;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime = 0;
					break;
				}
			}
			if(isPrime==1)
			{
				count++;
				System.out.print(count);
				System.out.print("("+n+")"+" ");
			}
			n++;
		}
*/
/*		//构造素数表（50个）
		Scanner in = new Scanner(System.in);
		int[] primes = new int[50];
		primes[0] = 2;
		int cnt = 1;//记录有多少个数以及以判断是素数之后要放的位置
		MAIN_LOOP:
			for(int x = 3;cnt<50;x++)
			{
				for(int i = 0;i<cnt;i++)
				{
					if(x%primes[i]==0)
					{
						continue MAIN_LOOP;
					}
				}
				primes[cnt++]=x;
			}
		for(int k:primes)
		{
			System.out.print(k+" ");
		}
*/
		//构造素数表
		Scanner in = new Scanner(System.in);
		boolean[] isPrime = new boolean[100];//初始化仍未0
		for(int i =0;i<isPrime.length;i++)
		{
			isPrime[i] = true;
		}
		for(int i = 2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				for(int k = 2;i*k<isPrime.length;k++)
				{
					isPrime[i*k] = false;
				}
			}
		}
		for(int i = 2;i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
	}
}

		
