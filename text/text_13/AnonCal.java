package text_13;
//13.4

interface Calculable
{
	int calInt(int a,int b);
}

public class AnonCal {
	public static Calculable cal(char opr)
	{
		Calculable result = null;
		if(opr =='+')
		{
			/**匿名内部类通常作为参数传递，用圆括号把整个匿名内部类括起来
			 * 匿名内部类的写法：new一个父类的对象的同时覆写父类中的函数，这样写的结果是new了一个父类的对象
			 */
			result = (new Calculable() {
				
				@Override
				public int calInt(int a, int b) {
					return a+b;
				}
			});
		}else {
			result = new Calculable() {
				@Override
				public int calInt(int a, int b) {
					return a-b;
				}
			};
					
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10,n2 = 5;
		Calculable f1 = cal('+');
		/**返回了一个Calculable类型的对象 也就是说f1也管着result的对象
		 * 赋值后，就不管内部类的事了，现在对f1来操作，f1是个接口类，不能有对象，
		 * 但匿名内部类是这个接口的子类，实现了接口中的方法，f1是一个父类变量，管着
		 * 它的子类的实例化对象，实际在使用f1时，是在调用子类的方法（如果子类重写了父类的方法）；
		 * 所以我们在使用f1时要看内部类如何重写方法的。
		 */
		System.out.println(f1.calInt(n1, n2));
		Calculable f2 = cal('-');
		System.out.println(f2.calInt(n1, n2));
	}

}
