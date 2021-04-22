package castle;

public class HandlerBye extends Handler {
	
	//无内部类时
	/*
	public HandlerBye(Game game)
	{
		super(game);
	}
	*/
	
	//有内部类时
	public void doCmd(String word) {}
	}
	
	@Override
	public boolean isBye()
	{
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
