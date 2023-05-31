package day04_review;

public class Makes10 {

	public static void main(String[] args) {
/* Given 2 int, a and b, return true if one of them is q0 or if their sum is 10 */
		
		int a = 9;
		int b = 12;
		
		if (a == 10 || b == 10 ||a + b == 10) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		System.out.println("end");
	}

}
