/**
 * 
 */
package Lu;
import java.util.Scanner;
/**
 * @author 323828715
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number");
		int userInput = scan.nextInt();
				
		int counter=2;
		
		while (counter <= userInput)
			if (userInput % counter == 0)
			{
			System.out.println(counter);
			userInput=(userInput/counter);
			}
	
			else{
				counter = counter +1;
			}
		

	}

}
