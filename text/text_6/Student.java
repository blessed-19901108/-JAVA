package text_6;

public class Student {
	String name;
	int age;
	public Student()
	{
		System.out.println("构造方法被调用");
	}
	
	public Student(String newName)
	{
		name = newName;
		System.out.println("Student(String newName)构造方法被调用");
	}
	
	public Student(String newName,int newAge)
	{
		name = newName;
		age = newAge;
		System.out.println("Student(String newName,int newAge)构造方法被调用");
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("张三");
		Student s3 = new Student("李四", 15);
		System.out.println(s1.toString()+s2.toString()+s3.toString());
	}

}
