/**
 * 
 */
package Lu;
import java.util.Scanner;
/**
 * @author 323828715
 *
 */
public class Order {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int burgers;
		int fries;
		int sodas;
		int beforetax;
		int aftertax;
		int total;
		System.out.println("Enter the number of burgers");
		System.out.println("Enter the number of fries");
		System.out.println("Enter the number of sodas");
		burgers = scan.nextInt() ;
		fries = scan.nextInt() ;
		sodas = scan.nextInt() ;
		System.out.println("Enter the number of burgers: " + burgers);
		System.out.println("Enter the number of fries: " + fries);
		System.out.println("Enter the number of sodas: " + sodas);
		System.out.println("Total before tax: " +(burgers * 1.69 + fries * 1.09 + sodas * 0.99));
		System.out.println("Tax:" +((burgers * 1.69 + fries * 1.09 + sodas * 0.99)*0.065));
		System.out.println("Final total: " +((((burgers * 1.69 + fries * 1.09 + sodas * 0.99)*0.065)) + (burgers * 1.69 + fries * 1.09 + sodas * 0.99)));
	}

}
