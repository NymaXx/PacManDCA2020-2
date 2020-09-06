import processing.core.PApplet;
import processing.core.PImage;



public class Coin extends PApplet {
	private PImage coinn;
	private int posX;
	private int posY;
	private int h;
	private int w;
	PApplet app;
	
	
	Coin(int posX, int posY, int w, int h, PApplet app){
		this.coinn= app.loadImage("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERCOIN.png");
		this.posX=posX;
		this.posY=posY;
		this.h=h;
		this.w=w;
		
	}
	
	 void paint() {
		 app.image(this.coinn, this.posX, this.posY, this.w, this.h);
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
