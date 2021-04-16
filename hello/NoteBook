package hello;

import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes = new ArrayList<String>();
	
	
	public void  add(String s)  //往后按顺序增加字符		//要不断的加入，不能有上限-->不能用数组，要用容器
	{
		notes.add(s);
		//size++; 不需要再新建一个变量进行计数，ArrayList中有方法
	}
	
	public void add(String s,int lacation)  //通过下标增加字符
	{
		notes.add(lacation, s);
	}
	
	public int getSize()	//得到记事本字符的多少
	{
		return notes.size();
	}
	
	public String getNote(int index) 	//通过下标访问记事本中的字符串
	{
		return notes.get(index);
	}
	
	public void removeNote(int index)   //删除字符串
	{
		notes.remove(index);
		//size--;
	}
	
//	public void list() //下一个方法为改进
//	{
//		System.out.println();
//	}
	
	public String[] list()		//输出所有字符串	//返回一个数组，不要去做输出，输出的方式是是上一层要决定怎么输出
	{
		String[] a = new String[notes.size()];
		for(int i=0;i<notes.size();i++)
		{
			a[i] = notes.get(i);
		}
//		notes.toArray(a); 	
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("third");
//		System.out.println("输出所有字符串"+nb.list());  //list是个字符串数组，等同于二维数组 单单这一句是不够的
		System.out.println("输出所有字符串");
		String [] a = nb.list();
		for(String s:a)
		{
			System.out.println(s);
		}
		
//		nb.removeNote(0);
//		System.out.println("输出所有字符串"+nb.list());
//		
//		nb.add("1234", 0);
//		System.out.println("输出所有字符串");
//		String [] a = nb.list();
//		for(String s:a)
//		{
//			System.out.println(s);
//		}
//		
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		System.out.println("输出所有字符串");
		String [] a1 = nb.list();
		for(String s:a1)
		{
			System.out.println(s);
		}
		
//		错误：
//		System.out.println("输出所有字符串"+nb.list());
//		[Ljava.lang.String;@4e25154f
//		“[” 表示这是一维数组
//		"[["表示这是二维数组
//		"L"表示这是一个对象
//		"java.lang.String"表示该对象的类型
//		"@"后面的字符串表示该对象的HashCode
//		散列码是由对象导出的一个整型值。散列码是没有规律的。类的hashCode()方法继承自Object类
//		因此每个对象都有一个默认的散列码，他的值为对象的存储地址（由对象的物理存储地址通过散列转换来的）。
//		解决方案：
//		使用Arrays.toString(obj)

	}

}
