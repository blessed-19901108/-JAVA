package hello;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*      //找到是第几个
		Scanner in = new Scanner(System.in);
		int [] data= {1,2,3,5};
		int x = in.nextInt();
		int loc = -1;
		for(int i = 0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc = i;
				break;
			}
		}
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System .out.println(x+"不在其中");
		}
*/
		//不需要找到是第几个
		Scanner in = new Scanner(System.in);
		int [] data= {1,2,3,5};
		int x = in.nextInt();
		int loc = -1;
		boolean found = false;
		for(int k:data)//for-each循环，对于data这个数组当中的每一个元素(没有位置，不能赋值)
		{              //循环具的每一轮将它拿出来作为k，有点像python的for i in range[0,4]
			if(k==x)
			{
				found = true;
				break;
			}
		}
		if(loc>-1)
		{
			System.out.println(x+"是第"+(loc+1)+"个");
		}
		else
		{
			System .out.println(x+"不在其中");
		}
	}

}
