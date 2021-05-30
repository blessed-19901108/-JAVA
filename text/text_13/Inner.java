package text_13;
//13.3

public class Inner {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("通过外部类访问内部成员");
		School a = new School();
		a.output();
		System.out.println("直接访问内部成员");
		School.Student b = a.new Student("景荣学院", "李四", 23);
		b.output();

	}

}

class School{
	String name;
	//内部类
	public class Student{
		String name;
		int age;
		public Student(String sname,String name, int age) {
			super();
			//从内部类访问外部成员：类名.this.
			School.this.name = sname;
			this.name = name;
			this.age = age;
			}
		public void output()
		{
			System.out.println("学校："+School.this.name);
			System.out.println("姓名："+this.name);
			System.out.println("年龄："+this.age);
		}
	}
	public void output()
	{
		Student stu = new Student("景荣学院", "张三", 24);
		stu.output();
	}
}
	

