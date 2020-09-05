import processing.core.PApplet;
import processing.core.PImage;



public class Coin extends PApplet {
	private PImage coinn;
	private int posX;
	private int posY;
	private int h;
	private int w;
	
	Coin( PImage coinn, int posX, int posY, int h, int w ){
		this.coinn=coinn;
		this.posX=posX;
		this.posY=posY;
		this.h=h;
		this.w=w;
		
	}
	
	 void paint() {
		 
	 }
	 
	 void erase() {
		 
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
