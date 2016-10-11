/**
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author 323828715
 *
 */
public class Quadratics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		int a;
		int b;
		int c;
		
		System.out.println("Please enter 3 numbers:");
		a = scan.nextInt() ;
		b = scan.nextInt() ;
		c = scan.nextInt() ;
		
		System.out.println(df.format((-b + Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a)));
		System.out.println(df.format((-b - Math.sqrt((Math.pow(b, 2)-4*a*c)))/(2*a)));

	}

}
