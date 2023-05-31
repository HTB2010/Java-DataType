package day04_review;

import java.util.Scanner;

/*public class TernaryOpReview {
  public static void main(String[] args) {
    // Ternary Operator

    // var = (boolean_express) ? true_value : false_value

 /*   Scanner scan = new Scanner(System.in);
    System.out.println("What is your annual income?");

    int income = scan.nextInt();
    boolean highIncome = income > 80_000; // return boolean

    String className =
        (highIncome) ? "first class" : "economy";

    System.out.println("You will be on " + className);

    scan.close();
  }
}*/
	  import java.util.Scanner;

	  public class TernaryOpReview {
	    public static void main(String[] args) {
	      // Ternary Operator

	      // var = (boolean_express) ? true_value : false_value

	      Scanner scan = new Scanner(System.in);
	      System.out.println("What is your annual income?");

	      int income = scan.nextInt();
	      boolean highIncome = income > 80_000; // return boolean

	      String className =
	          (highIncome) ? "first class" : "economy";

	      System.out.println("You will be on " + className);

	      scan.close();
	    }
	  }