package clock;

public class Display {
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit) //构造函数，创建对象时要传入参数
	{
		this.limit = limit;
	}
	
	public void increase() 
	{
		value++;
		if(value == limit) 
		{
			value = 0;
		}
	}
	
	public int getValue() 
	{
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display(24);
		for(;;) 
		{
			d.increase();
			System.out.println(d.getValue());
		}
	}

}
