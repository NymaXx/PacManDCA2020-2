import processing.core.PApplet;
import processing.core.PImage;

public class Enemy extends PApplet{
	
	private PImage ghost;
	private int posX;
	private int posY;
	private int speed;
	private int h;
	private int w;
	
	
	
	Enemy(PImage ghost, int posX, int posY, int speed, int h, int w ){
		this.posX=posX;
		this.posY=posY;
		this.ghost=ghost;
		this.h=h;
		this.w=w;
		this.speed=speed;
		
	
	}
	
	
	void paint(){
		
	}
	
	void power() {
		
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

