/**
 * 
 */
package Lu;
import java.util.Scanner;
/**
 * @author 323828715
 *
 */
public class exerciserandom1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("name:");
		String name=scan.nextLine();
		
		int x = (int) ((Math.random()*100)+1);
		
		if (x<=29)
			System.out.println(name +" is not your favourite name");
		
		else if (x>=30)
		System.out.println(name + " is your favourite name");
	}

}
