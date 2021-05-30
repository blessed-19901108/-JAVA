package text_6;

public class MyPlus {
	public int plus(int a,int b)
	{
		return a+b;
	}
	
	public int plus(int a,int b,int c)
	{
		int s;
		s=plus(a,b)+c;
		return s;
	}
	
	

	public static void main(String[] args) {
		MyPlus p = new MyPlus();
		System.out.println(p.plus(1,2));
		System.out.println(p.plus(1,2,3));

	}

}
