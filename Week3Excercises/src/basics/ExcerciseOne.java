package basics;
import java.util.Scanner;
import java.lang.Math;

// Got stuck on allowing a user to enter multiple numbers, glanced at solution 
// after some time to understand the logic and syntax needed.

public class ExcerciseOne {
	//scanner
	private static Scanner scanner = new Scanner(System.in);
	
	//main program
	public static void main(String[] args) {
		
		//generate a number 0 - 9
		float rand = (float) Math.random();
		rand *= 10;
		int rand_number = (int) Math.floor(rand);
		
		//check if they guessed right
		while(checkGuess(getGuess(0,9),rand_number)) {}
		scanner.close(); 
	
	}
	
	private static int getGuess(int min, int max) {
		System.out.println("Guess a number between " + min + " and " + max);
		
		//Checks to see if their is a valid number, if not continue to run
		while(!scanner.hasNextInt()) {
			scanner.nextLine(); 
			System.out.println("Please enter a valid number.");
		}
		
		return scanner.nextInt();  
	}
	
	
	private static boolean checkGuess(int guess, int actual) {
		
		if(guess < actual) {
			System.out.println("Close, But Too Low");
			return true; 
		}
		else if(guess > actual) {
			System.out.println("Close, But Too High");
			return true;
		}
		else {
			System.out.println("You got it!");
			return false; 
		}
	}
}