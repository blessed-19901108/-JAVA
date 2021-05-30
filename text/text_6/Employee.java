package text_6;

public class Employee {
	private static double newSalasy;
	private String name;
	private int age;
	private double salasy;
	

	public Employee(String newName, int newAge, double newSalasy) {
		this(newAge,newSalasy);/**newAge,newSalasy是实参,是由Employee传过来的*/
		System.out.println("三个参数的构造方法被调用。");
		name = newName;
	}
	
	public Employee(int newAge, double newSalasy) {
		this(newSalasy);
		System.out.println("两个参数的构造方法被调用。");
		age = newAge;
	}


	public Employee(double newSalasy) {
		this();
		System.out.println("一个参数的构造方法被调用。");
		salasy = newSalasy;
	}
	
	public Employee() {
		System.out.println("没有参数的构造方法被调用。");
	}

	void setAge(int newAge)
	{
		int age = 0;
	}
	
	int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		Employee s1 = new Employee("李四",30,80000);
		s1.setAge(31);
		System.out.println("年龄是"+s1.getAge());
	}

}
