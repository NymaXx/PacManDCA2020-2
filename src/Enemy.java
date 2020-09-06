import processing.core.PApplet;


/*La clase ENEMY es  la clase padre de PinkEnemy, BlueEnemy, VioletEnemy y GreenEnemy, y extiende de PApplet
 * es una clase abstracta que no sufrira cambio algunno y su unica funcion es heredar metodos
 * y atributos que seran sobreescritos en cada clase hija segun la necesidad especifica
 * 
 * Autora: Paula Marcela DUlcey Madronero
 * */
abstract class Enemy extends PApplet{
	
	protected int posX;
	protected int posY;
	protected int speed;
	protected int h;
	protected int w;
	protected PApplet app;
	
	
	
	Enemy(int posX, int posY, int speed, int h, int w, PApplet app ){
		this.app=app;
		this.posX=posX;
		this.posY=posY;
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

