import java.util.Random;

public class Dice {
	public static int roll(int rollCount, Random r){
		int randomSum = 0;
		for (int i = 0; i < rollCount; i++){
			int roll = r.nextInt(6)+1;
			randomSum += roll;
		}
		return randomSum;
	}
}
