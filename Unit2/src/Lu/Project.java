/**
 * 
 */
package Lu;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double designing;
		double coding;
		double debugging;
		double testing;
		System.out.println("How long do you take to design?");
		System.out.println("How long do you take to code?");
		System.out.println("How long do you take to debug?");
		System.out.println("How long do you take to test?");
		designing = scan.nextInt() ;
		coding = scan.nextInt() ;
		debugging = scan.nextInt() ;
		testing = scan.nextInt() ;
		System.out.println("Designing: " + designing);
		System.out.println("Coding: " + coding);
		System.out.println("Debugging: " + debugging);
		System.out.println("Testing: " + testing);		

	}

}
