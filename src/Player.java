import processing.core.PApplet;

/*La clase PLAYER funciona como una clase que guarda la informacion de un jugador que sera
 * instanciado e inicializado en GAME,la clase principal. Cuenta con getters y setters para 
 * acceder a la informacion que se recopila en Game (Main)
 * Autora: Paula Marcela Dulcey Madronero
 * */
public class Player extends PApplet{
	
	private String nickName;
	private int coinCounter;
	
	Player(String nickName, int coinCounter){
		this.nickName=nickName;
		this.coinCounter=coinCounter;
		
	}

	void putName() {
		text("Player", 100,100,50,50);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getCoinCounter() {
		return coinCounter;
	}

	public void setCoinCounter(int coinCounter) {
		this.coinCounter = coinCounter;
	}
	
	

}
