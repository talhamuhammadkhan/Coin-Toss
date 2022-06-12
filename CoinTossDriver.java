import java.util.Scanner;

public class CoinTossDriver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int noOfFlips;
		
		System.out.println("Hi! Welcome to the coin toss simulator. Your coin will now be flipped. How many times do you want the coin to be flipped?");
		
		noOfFlips = scnr.nextInt();
		
		for (int i = 1; i < noOfFlips + 1; ++i) {
			Flip flip = new Flip();
			flip.setResult();
			System.out.println("The result of flip " + i + " is "+ flip.getResult() + ".");   //Display result for this instance of the flip.
		}
		
	}
}
