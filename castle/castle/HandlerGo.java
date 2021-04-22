package castle;

public class HandlerGo extends Handler{
	
	//无内部类时
	/*
	public HandlerGo(Game game)		//go要做的事情在game里面，是那个goroom，如果有一个指针指向game就好了-->game.goRoom(word);
	{
		super(game);//从父类继承到了game对象 super()-->会去调用父类的的构造器
	}
	
	@Override
	public void doCmd(String word) {
		game.goRoom(word);
	}
	*/
	
	//有内部类时
	public void doCmd(String word) {}
	
}
