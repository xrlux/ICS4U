/**
 * 
 */
package Lu;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class Divisible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter number:");
			number = scan.nextInt() ;
			
			if (number < 1) {
				System.out.println("Your number is a negative number: " + number);} 
			else {
			System.out.println("your number is positive: " + number);}
			
			
			if (number%7 == 0) {
				System.out.println("Your number is a divisible by 7");} 
			else {
			System.out.println("your number is not divisible by 7");}
	}

}
