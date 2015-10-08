import java.util.Random;

public class Dice {
	/*public int random;
	
	// Constructor
	public Dice(){
		Random rnd = new Random();
		int random = rnd.nextInt(6)+1;
	}
	
	// Accessor
	public int getRoll(){
		return random;
	}*/
	
	public static int roll(int rollCount, Random r){
		int randomSum = 0;
		for (int i = 0; i < rollCount; i++){
			int roll = r.nextInt(6)+1;
			randomSum += roll;
		}
		return randomSum;
	}
}
