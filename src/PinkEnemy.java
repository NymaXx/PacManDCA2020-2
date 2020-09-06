import processing.core.PApplet;
import processing.core.PImage;

public class PinkEnemy extends Enemy{
	
	private PImage ghost;
	PinkEnemy(int posX, int posY, int speed, int h, int w, PApplet app) {
		super(posX, posY, speed, h, w, app);
		this.ghost= app.loadImage("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERpink.png");
		// TODO Auto-generated constructor stub
	}
	
	
	void paint() {
		app.image (this.ghost, this.posX, this.posY,this.w, this.h);
	
	}
	
	void move() {
		this.posX= this.posX+this.speed;
		
		if(this.posX<= 185 || this.posX>570) {
			this.speed= this.speed*-1;
		}
	}
	
	void power() {
		
	}

}
