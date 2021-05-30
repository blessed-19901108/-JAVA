package text_5_student;

import java.util.*;

public class Main_Class {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		Student[] s= new Student[a];
		Creat_Student cs=new Creat_Student();
		cs.creat_students(s);
		cs.getStudent(s);
	}

}
