import processing.core.PApplet;
import processing.core.PImage;



public class Coin extends PApplet {
	private PImage coine;
	private int posX;
	private int posY;
	private int h;
	private int w;
	PApplet app;
	
	
	Coin(int posX, int posY, int w, int h, PApplet app){
		this.coine= app.loadImage("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERveluBonus.png");
		this.posX=posX;
		this.posY=posY;
		this.h=h;
		this.w=w;
		this.app=app;
		
	}
	
	 void paint() {
		 app.image(this.coine, this.posX, this.posY, this.w, this.h);
	 }
	 
	 void erase() {
		 if(dist(Game.character.getPosX(), Game.character.getPosY(), Game.coin.getPosX(), Game.coin.getPosY())<=13){
				Game.coinCounter+=2;
				Game.violet.setSpeed(1);
				Game.blue.setSpeed(1);
				Game.green.setSpeed(1);
				Game.pink.setSpeed(1);
			}
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
