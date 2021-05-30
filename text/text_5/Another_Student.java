
public class Another_Student {
	String name;
	int age;
	int Chinese;
	int math;
	int english;
	
	
	public Another_Student(String name, int age, int chinese, int math, int english) {
		super();
		this.name = name;
		this.age = age;
		this.Chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public int total()
	{
		return Chinese+math+english;
	}
	
	public double average()
	{
		return (Chinese+math+english)/3.0;
	}
	
	public int compare(int x,int y)
	{
		int max=y;
		if(x>y)
			max=x;
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Another_Student s1 = new Another_Student("张三", 13, 99,100, 100);
		System.out.println("My name:"+s1.name);
		System.out.println("My total:"+s1.total());
		System.out.println("My average:"+s1.average());
		
	}

}
