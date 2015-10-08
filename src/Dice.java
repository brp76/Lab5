import java.util.Random;

public class Dice {
	private int random;
	
	// Constructor
	public Dice(){
		Random rnd = new Random();
		int random = rnd.nextInt(6)+1;
	}
	
	// Accessor
	public int getRoll(){
		return random;
	}
}
