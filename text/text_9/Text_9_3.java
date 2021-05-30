package text_9;

public class Text_9_3 {

	public static void main(String[] args) {
		int i = 0;
		int[] a = {1,2,3,4,};
		for(i = 0;i<5;i++) {
			try {
				System.out.println("a["+i+"]/"+i+"="+(a[i]/i));
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("下标越界");
			}catch(ArithmeticException e) {
				System.out.println("算数");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			//finally每捕获一个异常都会做一遍
			finally {
				System.out.println(i);
			}
		}
		System.out.println("继续");

	}

}
