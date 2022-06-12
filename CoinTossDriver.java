import java.util.Scanner;

public class CoinTossDriver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int noOfFlips;
		int headsCount = 0;
		int tailsCount = 0;
		
		System.out.println("Hi! Welcome to the coin toss simulator. Your coin will now be flipped. How many times do you want the coin to be flipped?");
		
		noOfFlips = scnr.nextInt();
		
		for (int i = 1; i < noOfFlips + 1; ++i) {
			Flip flip = new Flip();
			flip.setResult();
			System.out.println("The result of flip " + i + " is "+ flip.getResult() + ".");   //Display result for this instance of the flip.
			if (flip.getResult() == "Heads") {
				++headsCount;
			}
			else {
				++tailsCount;
			}
		}
		
		System.out.println("\nYou flipped heads " + headsCount + " times and tails " + tailsCount + " times.");   //Display the number of times each result was flipped.
		
	}
}
