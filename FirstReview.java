package day04_review;

public class FirstReview {
	public static void main(String args[]) {
		// CamelCase
		// Pascal case
		
		System.out.println("Hello World");
		System.out.println(1000);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		//Primitive
		//Whole Number = byte, short, int, long
		//Float Number = float, double
		//Single Character = char, in single quote 'x'
		// True/False = boolean
		
		byte dayOfTheWeek = 7;
		short dayOfTheYear = 375;
		int housePrice = 1_000_000;
		long viewCount = 20_000_000L; //lower or upper case will work
		float milkPrice = 2.95F; //lower or upper case will work
		double accountBalance = 4_000_200_000.54; //***
		char letterB = 'B'; //can only store 1 character
		boolean canSwim = true;
		
		//Variable Name
		// -descriptive
		//cannot use Java reserved keywords
		//can prefix with _ or $
		//cannot start with number
		//camel case
		
		//can declare variable without assigning variable
		
		byte myAge; //declare variable
		
		myAge = 25; //assign variable
		System.out.println("First");
		System.out.println(myAge);
		myAge = 27; //reassign variable
		System.out.println("Second");
		System.out.println(myAge);
		//          <== 27 is assigned 
		byte hisAge = myAge; //initialize variable with another variable
		System.out.println("His age: ");
		System.out.println(hisAge);
				     
		int theirAge = hisAge + myAge;
		System.out.println("Their age: ");
		System.out.println(theirAge);
	}
}
