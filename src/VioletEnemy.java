import processing.core.PApplet;
import processing.core.PImage;

public class VioletEnemy extends Enemy{
	PImage ghost;

	VioletEnemy(int posX, int posY, int speed, int h, int w, PApplet app) {
		super(posX, posY, speed, h, w, app);
		this.ghost= app.loadImage("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERviolet.png");
		// TODO Auto-generated constructor stub
	}

		void paint() {
			app.image (this.ghost, this.posX, this.posY,this.w, this.h);
		}
		
		void move() {
			this.posX= this.posX+this.speed;
			
			if(this.posX<= 183 || this.posX>573) {
				this.speed= this.speed*-1;
			}
		}
		
		void power() {
			if(dist(Game.character.getPosX(), Game.character.getPosY(), Game.violet.getPosX(), Game.violet.getPosY())<=30){
				Game.coinCounter-=4;
				Game.violetPower=false;
				Game.isViolet=false;
			}
		}
}
