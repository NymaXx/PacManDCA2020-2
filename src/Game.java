import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Game.class.getName());
	}

	public Player player;
	public Character character;
	public VioletEnemy violet;
	public GreenEnemy green;
	public BlueEnemy blue;
	public PinkEnemy pink;
	public Coin coin;
	public int timeCounter;
	public int coinCounter;
	PImage principalScreen;
	PImage gameScreen, resumeScreen;
	int screen=1;
	
	public void setup() {
		principalScreen= loadImage ("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERMAPSIN.png");
		gameScreen= loadImage ("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERMAP.png");
		resumeScreen= loadImage ("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/REC.png");
	
		pink = new PinkEnemy(177, 265, 5, 40 ,40, this);
		blue = new BlueEnemy(100, 546, 5, 40, 40, this);
		violet = new VioletEnemy(576, 469, 5, 40 ,40, this);
		green = new GreenEnemy(659, 184, 5, 40, 40, this);
		
	}
	public void settings() {
		size(800,700);
	}
	
	
	public void draw() {
		
		background(255);
		
		switch(screen) {
		case 0:
			image (principalScreen,0,0,800,700);
			break;
			
		case 1:
			image (gameScreen,0,0,800,700);
			pink.paint();
			pink.move();
			blue.paint();
			blue.move();
			violet.paint();
			violet.move();
			green.paint();
			green.move();
			
			break;
			
		case 2:
			image (resumeScreen,0,0,800,700);
			break;
		}
		
		
		
		//Linea de codigo para saber la posicion actual del mouse, uso solo durante la fase de codificacion
		//no tiene utilidad real dentro de la ejecucion del programa
		fill(0);
		textSize(20);
		text("X" + mouseX + "Y" + mouseY, mouseX, mouseY);
		
	}
	
	public void mousePressed() {
		switch(screen) {
		case 0:
			if(mouseX> 348 && mouseX < 435 && mouseY > 357 && mouseY < 452) {
				screen=1;
			}
			break;
			
		case 1: 
			
			break;
			
		case 2:
			if( mouseX > 672 && mouseX < 736 && mouseY > 590 && mouseY < 645) {
				screen=0;
			}
			break;
		}
		
		
	}
	
	public void keyPressed() {
		switch(keyCode) {
		case UP:
			break;
			
		case DOWN:
			break;
		
		case LEFT:
			break;
		
		case RIGHT:
			break;
		}
		
	}
}
