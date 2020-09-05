import processing.core.PApplet;
import processing.core.PImage;

public class GreenEnemy extends Enemy{

		PImage ghost;
	GreenEnemy(int posX, int posY, int speed, int h, int w, PApplet app) {
		super(posX, posY, speed, h, w, app);
		// TODO Auto-generated constructor stub
		this.ghost= app.loadImage("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERgreen.png");
	}
	
	void paint() {
		app.image(this.ghost, this.posX, this.posY, this.w, this.h);
	}
	
	void move() {
		this.posY= this.posY+this.speed;
		
		if(this.posY<= 187 || this.posY>546) {
			this.speed= this.speed*-1;
		}
	}
	
	void power() {
		
	}
	
	

}
