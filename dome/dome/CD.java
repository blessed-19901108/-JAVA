package dome;

public class CD extends Item{
	private String artist;
	private int numofTracks;

	//父类又被叫做超类或者基类，如果子类要继承父类的私有成员变量就要在构造方法这里在super()里面填入要用到的父类的私有成员变量
	//super()-->会去调用父类的一个没有参数的构造器
	public CD(String title, int playingTime, String comment, String artist, int numofTracks) {
		super(title, playingTime, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}


}
