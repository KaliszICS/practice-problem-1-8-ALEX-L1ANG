/**
 * File Name: Errors and Exceptions
 * Author: Alex Liang
 * Date Created: Feb 24, 2026
 * Date Last Edited: Feb 25, 2026
 */


class PracticeProblem {

	static Scanner s = new Scanner();
  	public static void main(String[] args) {
		
		q1();
		q2();
		q3();
		q4();
  	}
  	public static void q1() {
		// From input, recieve two integers from the user and add them together.  Output the result.
	Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num1 = s.nextInt;
		System.out.println("Input a number: ");
		int num2 = s.nextInt;

		System.out.println(num + num2);
  	}

	public static void q2() {
		// From input recieve two integers.  Output the quotient rounded down.
	Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num1 = s.nextInt();
		s.nextLine();
		System.out.println("Input a number: ");
		int num2 = s.nextInt();
		s.nextLine();
		
		system.out.println(num1/num2);
	}

	public static void q3() {
		// Output the phrase "hello "Mr. Kalisz" have you seen my work yet?"
		
		System.out.println("hello Mr. Kalisz have you seen my work yet?");
	}

	public static void q4() {
		// From input recieve two numbers (can be decimal fractions).  
		// Output the first number plus two, then multiplied by the second number.
	Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");
		double num1 = s.nextDouble();
		s.nextLine();
		System.out.println("Input a number: ");
		double num2 = s.nextDouble();
		s.nextLine();
		
		System.out.println(num1 + 2 * num2);
	}
}