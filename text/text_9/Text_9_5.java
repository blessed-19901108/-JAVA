package text_9;

import java.util.Scanner;

//自定义异常类不是用来定义对象的，而是用来手动throw new 一个自定义一个异常类的，然后在try catch掉
class aaa extends Exception{}

class bbb extends Exception{}

public class Text_9_5 {

	public static void main(String[] args) throws aaa,bbb {
		Scanner in = new Scanner(System.in);
		int x = 0;
		x = in.nextInt();
		try {
			if(x>0)
				throw new aaa();
			else
				throw new bbb();
		}catch(aaa e) {
			System.out.println("aaa");
		}catch(bbb e) {
			System.out.println("bbb");
		}

	}

}
