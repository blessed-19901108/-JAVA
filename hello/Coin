package hello;

import java.util.HashMap;
import java.util.Scanner;

public class Coin{
	private HashMap<Integer,String> coinnames = new HashMap<Integer,String>();
	
	public Coin()//构造函数
	{
		coinnames.put(1,"penny");
		coinnames.put(10,"dime");
		coinnames.put(25,"quarter");
		coinnames.put(50,"half-dolar");
		coinnames.put(50,"五毛");
		System.out.println(coinnames.keySet().size());//把所有的key放在一起 然后把key的数量告诉我们 //里边没有一个直接的方法各异告诉我们有多少给键值对
		System.out.println(coinnames);
		for(Integer k:coinnames.keySet())
		{
			String s = coinnames.get(k);
			System.out.println(s);
		}
	}												
	
	public String getName(int amount)
	{
//		switch(amount)   //过于丑陋，太多的硬代码（不可改变的）
//		{				 //本来就是一些数据,我们应该让代码和数据分开
//		case 10:return "dime";
//		}
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "NOT FOUND";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		Coin coin = new Coin();
		String name = coin.getName(amount);
		System.out.println(name);
	}

}
