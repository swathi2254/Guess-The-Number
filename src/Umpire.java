
public class Umpire {
	int guessNum;
	int upperLimit;
	int lowerLimit;
	int playerNum1;
	int playerNum2;
	int[] playerNum;
	int num;

	public void getGuesserNum() {
		Guesser guess = new Guesser();
		lowerLimit = guess.getLowerLimit();
		upperLimit = guess.getUpperLimit();
		guessNum = guess.guessNum();

	}

	public void getPlayerNum() {
		  Player player = new Player();
		  playerNum1 = player.guessNum();
		  if(playerNum1 > upperLimit || playerNum1 < lowerLimit) {
		  System.out.println("Invalid Number");
		  System.out.println("Enter Number Between "+lowerLimit +" to "+upperLimit);
		  playerNum1 = player.guessNum(); } playerNum2 = player.guessNum();
		  if(playerNum2 > upperLimit || playerNum2 < lowerLimit) {
		  System.out.println("Invalid Number");
		 System.out.println("Enter Number Between "+lowerLimit +" to "+upperLimit);
		  playerNum2 = player.guessNum(); }
		
	}

	public void result() {
		if (guessNum == playerNum1 && guessNum == playerNum2)
			System.out.println("Both are Winners");
		else if (guessNum == playerNum1)
			System.out.println("Player 1 won the game!!!!");
		else if (guessNum == playerNum2)
			System.out.println("Player 2 won the game!!!!");

		else
			System.out.println("Lost the match Try again!!!");
	}

}
