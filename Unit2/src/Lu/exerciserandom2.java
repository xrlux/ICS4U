/**
 * 
 */
package Lu;
import java.util.Scanner;
/**
 * @author 323828715
 *
 */
public class exerciserandom2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int play1;
		do{
		int dice1= (int)(Math.random()*11)+2;
		int dice2= (int)(Math.random()*11)+2;
		
		if (dice1>dice2)
			System.out.println("User won!!!");
		
		else if (dice2>dice1)
			System.out.println("Computer won!!!");
		
		else if (dice1==dice2)
			System.out.println("It's a tie!!!");

		System.out.println("Would you like to play again, press 1");
		play1=scan.nextInt();
		}while(play1==1);
	}

}
