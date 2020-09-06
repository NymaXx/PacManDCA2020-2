import processing.core.PApplet;
import processing.core.PImage;

public class Character extends PApplet{
	
	private PImage pac;
	private int posX;
	private int posY;
	private int speed;
	private int h;
	private int w;
	PApplet app;
	
	Character(int posX, int posY, int speed, int h, int w, PApplet app){
		this.pac= app.loadImage("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERpac.png");
		this.posX=posX;
		this.posY=posY;
		this.speed=speed;
		this.h=h;
		this.w=w;
		this.app=app;
		
		
	}
	
	void paint() {
		app.image(this.pac, this.posX, this.posY, this.w, this.h);
	}
	
	void move() {
		
	}
	
	void eat() {
		
	}
	
	void die() {
		
	}
	
	void losePoints() {
		
	}
	
	void speedPlus() {
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
	
	

	
}
