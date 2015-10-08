import java.util.Random;
import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int runAgain = 0;
		
		do{
			System.out.println("Number of rolls (100 or 1000)");
			int rolls = sc.nextInt();
			
			Random r = new Random();
			rollDice(rolls,r);
			
			System.out.println("Continue? (0=NO|1=YES)");
			runAgain = sc.nextInt();
			
		} while (runAgain == 1);

	}
	
	public static void rollDice(int n, Random r){
		int [] a = new int[12];
		for (int i=0; i < n; i++){
			int roll = Dice.roll(2,r);
			//System.out.println(roll);
			if (roll == 2) {
	    	    a[0] ++;
	    	} else if (roll == 3) {
	    		a[1] ++;
	    	} else if (roll == 4) {
	    		a[2] ++;
	    	} else if (roll == 5) {
	    		a[3] ++;
	    	} else if (roll == 6) {
	    		a[4] ++;
	    	} else if (roll == 7) {
	    		a[5] ++;
	    	} else if (roll == 8) {
	    		a[6] ++;
	    	} else if (roll == 9) {
	    		a[7] ++;
	    	} else if (roll == 10) {
	    		a[8] ++;
	    	} else if (roll == 11) {
	    		a[9] ++;
	    	} else if (roll == 12) {
	    		a[10] ++;
	    	}
		}
		for (int j = 0; j <= 10; j++){
			System.out.printf("%d was rolled %d out of %d times\n",j+2, a[j], n);
		}
	}

}
