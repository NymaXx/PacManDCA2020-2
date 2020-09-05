import processing.core.PApplet;

public class Player extends PApplet{
	
	private String nickName;
	private int Score;
	private int timeCounter;
	
	Player(String nickName, int Score, int timeCounter){
		this.nickName=nickName;
		this.Score=Score;
		this.timeCounter=timeCounter;
		
	}
	
	void putName() {
		text("Player", 100,100,50,50);
	}

}
