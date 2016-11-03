/**
 * 
 */
package Lu;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class Printing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				DecimalFormat df = new DecimalFormat ("0.00");
				
				int number;
				
				System.out.println("Enter the number of copy's:");
				number = scan.nextInt() ;
				
				if (number > 1000){ 
					System.out.println("price per copy is: $0.25");
				System.out.println("your total is: " +(df.format(0.25*number)));
				}
				else if (number >= 750){ 
					System.out.println("price per copy is: $0.26");
				System.out.println("your total is: " +(df.format(0.26*number)));
				}
				else if (number >= 500){ 
					System.out.println("price per copy is: $0.27");
				System.out.println("your total is: " +(df.format(0.27*number)));
				}
				else if (number >= 100){ 
					System.out.println("price per copy is: $0.28");
				System.out.println("your total is: " +(df.format(0.28*number)));
				}
				else { 
					System.out.println("price per copy is: $0.30");
					System.out.println("your total is: " +(df.format(0.30*number)));
				}

			}

}
