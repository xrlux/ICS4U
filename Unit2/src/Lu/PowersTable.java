/**
 * 
 */
package Lu;

/**
 * @author 323828715
 *
 */
public class PowersTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.format("%5s %5s %5s %5s %6s","x^1", "x^2", "x^3", "x^4", "x^5\n");
		for(int x=1;x<=6;x++)

		System.out.format("%5s %5s %5s %5s %5s\n" , (int)(Math.pow(x,1)) , (int)(Math.pow(x,2)) , (int)(Math.pow(x,3)) , (int)(Math.pow(x,4)) , (int)(Math.pow(x,5)));
			
	}

}
