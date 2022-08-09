import java.util.Scanner;

public class Guesser {

	int guessNum;
	int temp;
	int lowerLimit;
	int upperLimit;
	Scanner sc = new Scanner(System.in);
	public int guessNum() {
	guessNum= getNum();	

	if(guessNum ==-1) {
		
		System.exit(0);
	}
	return guessNum;
	
}
	public int getLowerLimit() {
		System.out.println("Enter Lower Limit Range of the  number ");
		lowerLimit=sc.nextInt();
		return lowerLimit;
	}
	
	public int getUpperLimit() {
		System.out.println("Enter Upper Limit Range of the  number ");
		upperLimit=sc.nextInt();
		return upperLimit;
	}
	
	public int getNum() {
		System.out.println("Please Enter the number B/w "+lowerLimit +" to " +upperLimit);
		temp = sc.nextInt();
		if(temp >upperLimit || temp < lowerLimit) {
			System.out.println("Invalid Number");
			temp =getNum();
		}
		return temp;
	}
}
