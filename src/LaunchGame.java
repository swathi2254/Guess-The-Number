public class LaunchGame {
	static int numOfPlayers;

	public static void main(String[] args) {
		
		/*
		 Guess the Number Game
		 One Guesser will guess the number and share it with Umpire
		 Now Players turn to guess the number and share it with Umpire
		 Now Umpire will check if the  player Number matches with the Guesser Number and declare the results.		 
		 */
		
		
		
		 Umpire u = new Umpire();
		  u.getGuesserNum(); 
		///  numOfPlayers();
		  u.getPlayerNum(); 
		  u.result();
		 
		
	}
	/*
	 * public static int numOfPlayers() { 
	 * Scanner sc = new Scanner(System.in);
	 * System.out.println("Please Enter Number of players"); numOfPlayers =
	 * sc.nextInt(); return numOfPlayers; 
	 * }
	 */
}
