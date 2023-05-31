package day04_review;

public class StringConcatDemo {

	public static void main(String[] args) {

		String myName = "Khang" + " is a java student";
		System.out.println(myName);
		//method is always followed by a semicolon;
		myName = myName.concat("!!");
		System.out.println(myName);
		myName = myName.concat("!!").concat("??").concat("===");
		System.out.println(myName);
	}

}
