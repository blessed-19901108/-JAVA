package text_13;
//13.5

interface Calculable1
{
	int calInt(int a,int b);
}

public class Lambda {
	public static Calculable1 cal(char opr)
	{
		Calculable1 result = null;
		if(opr == '+') {
			result = ((int a,int b)->{return (a+b);});
		}else 
		{
			result = ((int a,int b)->{return (a-b);});
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10,n2 = 5;
		Calculable1 f1 = cal('+');
		System.out.println(f1.calInt(n1, n2));
		Calculable1 f2 = cal('-');
		System.out.println(f2.calInt(n1, n2));
	}

}
