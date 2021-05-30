package text;

import java.util.*;

public class Txet_3_4 {//goto语句！！！！！！！

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入一个数");	
		int a = read.nextInt();
		boolean flag = true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag = false;
				System.out.println("不是素数");	
				break;
			}
			System.out.println("是素数");	
		}*/
		
		/*System.out.println("请投币");
		int balance = 0;
		
		while(true)
		{
			int amount = in.nextInt();
			balance =  balance+amount;
			if(balance>=10)
			{
				System.out.println("******************");
				System.out.println("*******车站票*******");
				System.out.println("******************");
				System.out.println("找您"+(balance-10)+"元");
				break;
			}else 
			{
				System.out.println("投币金额不足，按1选择继续投币，按2选择取走投入的金额");
				int a = in.nextInt();
				switch(a)
				{
					case 1:
						System.out.println("请继续投币");
						break;
					case 2:
						System.out.println("返还给您"+amount+"元");
						break;		
				}
			}
		}

	}*/

	
//P32 4.1 数组元素的访问与数组长度的属性
/*public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i=0;
		int[]a=new int[10];
		for(i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]+"");
		}
		System.out.println();
		for(i=a.length-1;i>=0;i--)
		{
			a[i]=i;
			System.out.println("a["+i+"]="+a[i]+"");
		}

	}*/
//P33 4.2 从键盘输入数据给数组元素
/*public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i,min,max;
		int[] a=new int[5];
		System.out.println("请输入5个整数");
		for(i=0;i<a.length;i++)
		{
			a[i] = in.nextInt();
		}
		max = Integer.MIN_VALUE;//这是给max最小的值
		min = Integer.MAX_VALUE;//这是给min最大的值
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("最大的数是："+max);
		System.out.println("最小的数是："+min);


	}*/
	
//P35 3.4 定义一个2行3列的整形二维数组 对其赋随机值，分别对第一行和第二行的元素排列
/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int[][]a = new int[2][3];
		for(i=0;i<a.length;i++)  //i<a[0].length 这是错的，这句表示第一行有多少个数字，并不是有几行
		{						 //表示几行的是a.length
			for(j=0;j<a[1].length;j++)
			{
				a[i][j] = (int)(Math.random()*100)+1;
				System.out.println("a["+i+"]["+j+"]="+a[i][j]+"");
				System.out.println();
			}
		}
		Arrays.sort(a[0]);//对数组的第一行进行从小到大的排序  在二维数组中a[0]表示第一行
		Arrays.sort(a[1]);
		for(i=0;i<a.length;i++)
		{
			if(i==0)
			{
				System.out.println("排序后，第一行元素从小到大是：");
			}
			if(i==1)
			{
				System.out.println("排序后，第二行元素从小到大是：");
			}
			for(j=0;j<a[1].length;j++)
			{
				System.out.println("a["+i+"]["+j+"]="+a[i][j]+"");
				System.out.println();
			}
		}

	}*/
	
//P36 4.4字符串的比较
/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	String s1 = "wby";
	String s2 = "wby";
	String s3 = new String("wby");
	String s4 = new String("wby");
	System.out.println("用运算符==比较的结果如下");
	if(s1==s2)
		System.out.println("s1==s2");
	else
		System.out.println("s1!=s2");
	if(s3==s4)
		System.out.println("s3==s4");
	else
		System.out.println("s3!=s4");
	if(s2==s3)
		System.out.println("s2==s3");
	else
		System.out.println("s2!=s3");
	System.out.println("用equals()方法比较的结果如下");
	if(s1.equals(s2))
		System.out.println("s1==s2");
	else
		System.out.println("s1!=s2");
	if(s3.equals(s4))
		System.out.println("s3==s4");
	else
		System.out.println("s3!=s4");
	if(s2.equals(s3))
		System.out.println("s2==s3");
	else
		System.out.println("s2!=s3");
	}*/
	
//P38 4.5 字符串方法的调用
/*public static void main(String[] args) {
	// TODO Auto-generated method stub
		String str1 = "wby";
		String str2 = "Hello";
		String str = str1+str2;
		System.out.println("str="+str);
		System.out.println(str.length());
		System.out.println(str.charAt(6));//显示第8个位置的字符  //注意不要越界
		System.out.println(str.indexOf("wb"));//显示字符串“wb”第一次出现的位置   //错误：str.indexOf(wb) 没加双引号
		System.out.println(str.toLowerCase());//全部转换为小写
		System.out.println("str="+str);
		System.out.println(str.toUpperCase());
		System.out.println("str="+str);
	}*/
	
//P39 4.6 命令行参数的使用
/*public static void main(String[] args) {
	// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("没有输入参数");
		}
		else
		{
			System.out.println(args.length);
			for(int i=0;i<args.length;i++)
			{
				System.out.println(args[i]);
			}
		}
	}*/
	
}
