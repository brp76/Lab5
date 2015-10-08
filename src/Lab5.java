import java.util.Random;
import java.util.Scanner;

public class Lab5 {
	public static int dice1 = 0, dice2 = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = new int[12];

		/*for (int i=0; i <100; i++){
			int random = rnd.nextInt(6)+1;
			System.out.println(val);
		}*/
		
		/*
		System.out.println("Number of rolls (100 or 1000)");
		int rolls = sc.nextInt();

		rollDice(rolls);*/
		
		
		/**
		 *New method
		 */
		
		Random r = new Random();
		Dice.roll(2,r);
		System.out.println(Dice.roll(2, r));

	}
	//rollDice(int n)
	//Dice _dice1 = new Dice();
	//Dice _dice2 = new Dice();
	//System.out.println(_dice1.getRoll());

}
