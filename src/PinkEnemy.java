import processing.core.PApplet;
import processing.core.PImage;

/*clase PINKEnemy funciona como clase hija que hereda de la clase Enemy y sobreescribe metodos 
 * y atributos. Cuenta con metodos pintar, mover y accion de poder. Funciona para recrear
 * al enemigo PINK del juego que cuenta con un poder especifico
 * Autora Paula Marcela Dulcey Madronero
 * */
 
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
		if(dist(Game.character.getPosX(), Game.character.getPosY(), Game.pink.getPosX(), Game.pink.getPosY())<=30) {
			Game.violet.setSpeed(9);
			Game.blue.setSpeed(9);
			Game.green.setSpeed(9);
			Game.pink.setSpeed(9);
			Game.isPink=false;
			Game.pinkPower=false;
		}
	}

}
