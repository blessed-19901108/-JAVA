package castle;

public class Handler {
	protected Game game;
	
	//无内部类时
	/*
	public Handler(Game game)//构造函数构造对象时就记下game，是handlergo要用到的
	{
		this.game = game;
	}
	public void doCmd(String word) {}//接受一个字符串输入，提供一个基础
	*/
	
	//有内部类时-->首先,将Handler中doCmd改成抽象方法,而且无需传递game对象进入
	public abstract class Handler {
	//构造抽象方法
	public abstract void doCmd(String word);
	public boolean isBye() {
		return false;
		};
	}
	
	
	public boolean isBye() { return false;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
