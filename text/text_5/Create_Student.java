package text_5_student;

import java.util.*;

public class Creat_Student {
	
	public void creat_students(Student[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Please input student's name age score.");
			s[i] = new Student(in.nextLine(), in.nextInt(), in.nextInt());
		}
	}
	
	public void getStudent(Student[] s)
	{
		for(int i=0;i<s.length;i++)
			System.out.println(s[i].toString());
		}

}
