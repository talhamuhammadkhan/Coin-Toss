import java.util.Random;

public class Flip {
	private String result;
	Random randGen = new Random();
	
	//set the value of the result to either Heads or Tails.
	public void setResult() {
		if (randGen.nextInt(2) + 1 == 1) {
			result = "Heads";
		}
		else {
			result = "Tails";
		}
	}
	
	//extract result
	public String getResult() {
		return result;
	}

}
