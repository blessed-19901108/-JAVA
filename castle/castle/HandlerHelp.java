package castle;

public class HandlerHelp extends Handler{
	
	//无内部类时
	/*
	public HandlerHelp(Game game)
	{
		super(game);
	}
	*/
	
	//有内部类时
	/**不用重新构建方法*/
	@Override
	public void doCmd(String word) {
		System.out.println("迷路了吗？你可以做的命令有：");
		System.out.println(game.getcmd());
        System.out.println("如：\tgo east");
	}

}
