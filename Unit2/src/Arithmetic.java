import java.util.Scanner;

/**
 * 
 */

/**
 * @author 323828715
 *
 */
public class Arithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		System.out.println("Please enter 5 numbers:");
		number1 = scan.nextInt() ;
		number2 = scan.nextInt() ;
		number3= scan.nextInt() ;
		number4 = scan.nextInt() ;
		number5 = scan.nextInt() ;
		System.out.println("Your total is: " +(number1 + number2 + number3 + number4 + number5));
		System.out.println("Second number - Third number is: "+(number2 - number3));
		System.out.println("First number * Fifth number is: "+(number1 * number5));
		System.out.println("Fourth number / Second number is: "+(number4 / number2));
		System.out.println("Fourth number % Second number is: "+(number4 % number2));
	}

}