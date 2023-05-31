package day04_review;

//if it's not in java.lang then we must import it
import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		//DataType variableName = value (same data type);
		Scanner scanner = new Scanner(System.in);
		//String input = scanner.nextLine(); // accept input for the whole line ==> string
		
		
		String input = scanner.next(); //accept input for the first word ==> string
		System.out.println("You typed: " + input);
		//These are rarely used
		//int inputAsInt = scanner.nextInt();
		//boolean inputAsBoolean = scanner.nextBoolean();
		//double inputAsDouble = scanner.nextDouble();
		
		scanner.close(); // scanner must close every time to prevent memory leak
	}

}
