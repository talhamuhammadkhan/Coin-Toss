import java.util.Scanner;

public class CoinTossDriver {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		System.out.println("Hi! Welcome to the coin toss simulator. Your coin will now be flipped.");
		
		Flip flip = new Flip();
		flip.setResult();
		System.out.println("The result is " + flip.getResult() + ".");   //Display result for this instance of the flip.
	
		
	}
}
