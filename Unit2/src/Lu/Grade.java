/**
 * 
 */
package Lu;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int number;
		
		System.out.println("Enter the percentage:");
		number = scan.nextInt() ;
		
		if (number >=90){ 
			System.out.println("The corresponding letter grade is:A");
		}
		else if (number >= 80){ 
			System.out.println("The corresponding letter grade is:B");
		}
		else if (number >= 70){ 
			System.out.println("The corresponding letter grade is:C");
		}
		else if (number >= 60){ 
			System.out.println("The corresponding letter grade is:D");
		}
		else { 
			System.out.println("The corresponding letter grade is:F");
		}
	}

}
