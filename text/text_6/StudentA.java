package text_6;

public class StudentA {
	String strName;
	
	public void setName(String s)
	{
		strName = s;
	}
	
	public String getName()
	{
		return strName;
	}

	public static void main(String[] args) {
		StudentA a = new StudentA();
		a.setName("123");
		StudentA b = a;//传地址过去了
		b.setName("456");
		StudentA c = new StudentA();
		c.setName("678");
		System.out.println(a.getName()+b.getName()+c.getName());

	}

}
