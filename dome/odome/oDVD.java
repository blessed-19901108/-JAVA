package odome;

public class oDVD {
	private String title;
	private String director;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;


	public void print() {
		// TODO Auto-generated method stub
		System.out.println("DVD:"+title+":"+director);
	}

	public oDVD(String title, String director, int playingTime, String comment) {
		super();
		this.title = title;
		this.director = director;
		this.playingTime = playingTime;
		this.comment = comment;
	}

}
