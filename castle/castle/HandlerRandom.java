package castle;

public class HandlerRandom extends Handler{
	public HandlerRandom(Game game)
	{
		super(game);
	}

	@Override
	public void doCmd(String dir) {
		game.goRandom();
	}
	
	

}
