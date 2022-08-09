import java.util.Scanner;

public class Player {

	int playerGuessNum;
	
	public int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player please Enter the guessed Number: ");
		playerGuessNum = sc.nextInt();
		return playerGuessNum;
		
	}
}
