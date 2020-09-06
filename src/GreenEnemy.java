import processing.core.PApplet;
import processing.core.PImage;

/*clase GREENnemy funciona como clase hija que hereda de la clase Enemy y sobreescribe metodos 
 * y atributos. Cuenta con metodos pintar, mover y accion de poder. Funciona para recrear
 * al enemigo GREEN del juego, que cuenta con un poder especifico
 * Autora Paula Marcela Dulcey Madronero
 * */

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
		
		if(dist(Game.character.getPosX(), Game.character.getPosY(), Game.green.getPosX(), Game.green.getPosY())<=30) {
			Game.coinCounter=40;
			Game.isGreen=false;
			//Game.character.setPosY(188); PPor alguna razon este Set modifica la manera en la que se mueve el personaje a lo largo de la matriz
		}
		
	if(Game.screen!=1) {
		this.setPosY(188);
	}
	}
	
	

}
