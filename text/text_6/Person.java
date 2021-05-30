package text_6;

public class Person {
	String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public boolean setAge(int newAge)
	{
		if(newAge>=5&&newAge<=20) /**&&:前面那个错了，就不会再比较后面的值了;&:前面那个错了，仍然会比较后面的值了*/
		{
			age = newAge;
			return true;
		}
		return false;
	}
	
	public int getAge()
	{
		return age;
	}

	public static void main(String[] args) {
		Person s1 = new Person();
		s1.name ="123";
		if(s1.setAge(20))
		{
			System.out.println(s1.toString());
		}else System.out.println("年龄错误！");
		
	}

}
