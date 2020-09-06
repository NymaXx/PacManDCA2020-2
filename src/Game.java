
import processing.core.PApplet;
import processing.core.PImage;

public class Game extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Game.class.getName());
	}

	public Player player;
	public static Character character;
	public static VioletEnemy violet;
	public static GreenEnemy green;
	public static BlueEnemy blue;
	public static PinkEnemy pink;
	public static Coin coin;
	
	static boolean isPink=true;
	static boolean isViolet=true;
	static boolean pinkPower=true;
	static boolean violetPower=true;
	static boolean isGreen=true;
	static boolean greenPower=true;
	
	
	
	static int timeCounter;
	static int coinCounter;
	
	
	PImage principalScreen;
	PImage gameScreen, resumeScreen;
	static int screen=1;
	//16 13
	static int colu=2;
	static int fili=2;
	static int matrixMap [][]= {{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
								{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
								{2,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,2},
								{2,1,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0,1,2},
								{2,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,2},
								{2,1,0,1,0,1,0,1,1,0,1,1,0,1,0,1,0,1,2},
								{2,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,2},
								{2,0,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,0,2},
								{2,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,2},
								{2,1,0,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1,2},
								{2,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,2},
								{2,1,0,1,1,0,1,0,1,1,1,0,1,0,1,1,0,1,2},
								{2,1,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,2},
								{2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
								{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}
							};
	
	public void setup() {
		principalScreen= loadImage ("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERMAPSIN.png");
		gameScreen= loadImage ("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/ERMAPAREAL.png");
		resumeScreen= loadImage ("C:\\Users\\WINDOWS 10\\eclipse-workspace\\PACMAN DCA\\recursos/REC.png");
	
		pink = new PinkEnemy(183, 260, 3, 34 ,39, this);
		blue = new BlueEnemy(105, 540, 3, 34, 39, this);
		violet = new VioletEnemy(573, 476, 3, 34 ,39, this);
		green = new GreenEnemy(651, 188, 3, 34, 39, this);
		
		character = new Character(66+39 ,152+36,36,39,36,this);
		
		coin = new Coin(66+50 , 152+47, 19, 19, this);
		
		
		
		timeCounter= 121;
		coinCounter=0;
		frameRate(27);
		
	}
	public void settings() {
		size(800,700);
	}
	
	
	public void draw() {
		
		background(255);
		
		switch(screen) {
		case 0:
			coinCounter=0;
			image (principalScreen,0,0,800,700);
			break;
			
		case 1:
			image (gameScreen,0,0,800,700);
			//Pintado y recorrido de la matriz, por debajo de la interfaz grafica real del mapa
			for (int i = 0; i < matrixMap.length; i++)	
				for (int j = 0; j < matrixMap[i].length; j++){
					if(matrixMap[i][j] == 1){
						fill(127,200,251);
						noStroke();
						rect(27 + (39*j), 116+ (36*i), 39,36);
					}
					if(matrixMap[i][j] == 2) {
						fill(0);
						noStroke();
						rect(27+ 39*j, 116 + 36*i, 39, 36);
					}
					
					if(matrixMap[i][j]==0) {
						coin.paint();
						
					}
				}
			//Fin pintado y recorrido de la matriz
			
			if(isPink==true) {
			pink.paint();
			pink.move();
			}
			
			if(isViolet==true) {
				violet.paint();
				violet.move();
			}
			
			if(isGreen==true) {
				green.paint();
				green.move();
			}
		
			blue.paint();
			blue.move();
			
			character.paint();
			
			blue.power(); //matar
			green.power(); // perder bonificacion
			
			
			
			if(pinkPower==true) {
				pink.power(); // velocidad reducida
			}
			
			if(violetPower==true) {
				violet.power(); //restar 4 puntos al score
			}

			
			
			
		//Cuenta regresiva	y reinicio del contador cada vez que se reinicia el Juego
			if(frameCount% 27 == 0) {
				timeCounter --;
				if(timeCounter == 0) {
					screen = 2;
				}
			}
			if(screen != 1) {
				timeCounter=121;
			}
			fill(0);
			textSize(32);
			text(timeCounter +"", 146,106);
			text(coinCounter + "" ,77,106);
		//Fin codigo de la cuenta regresiva
			
			break;
			
		case 2:
			image (resumeScreen,0,0,800,700);
			violet.setSpeed(3);
			blue.setSpeed(3);
			green.setSpeed(3);
			pink.setSpeed(3);
			
			violetPower=true;
			pinkPower=true;
			isPink=true;
			isViolet=true;
			isGreen=true;
			
			
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
		
		/*ensayo del KEYCODE movimiento del personaje que si funciono
		 if (keyCode  == RIGHT) {
			if(matrixMap[fili][colu+1]!=1 || matrixMap[fili][colu+1]!= 2) {
				character.setPosX(character.getPosX()+ character.getSpeed()+3);
				colu++;
			
		}
		}*/
	
		
	// switch que no funciono en el metodo mover del personaje sabra dios porque
		if(screen==1) {
			
		
		switch(keyCode) {
		case RIGHT:
			if(matrixMap[fili][colu+1]!=1 && matrixMap[fili][colu+1]!= 2) {
				character.setPosX(character.getPosX()+ character.getW());
				colu++;
			}
			break;
			
		case LEFT:
			if(matrixMap[fili][colu-1]!=1 && matrixMap[fili][colu-1]!= 2) {
				character.setPosX(character.getPosX()- character.getW());
				colu--;
			}
			break;
			
		case UP:
			if(matrixMap[fili-1][colu]!=1 && matrixMap[fili-1][colu]!= 2) {
				character.setPosY(character.getPosY()- character.getSpeed());
				fili--;
			}
			break;
			
		case DOWN:
			if(matrixMap[fili+1][colu]!=1 && matrixMap[fili+1][colu]!= 2) {
				character.setPosY(character.getPosY()+ character.getSpeed());
				fili++;
			}
			break;
			
		default:
			break;
		}
		
		}
		
		
		
	}
}
