/**
 * 
 */
package Lu;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				int number;
				int random= (int)(Math.random()*20)+1;
				
				do{
				System.out.print("Choose a number between 1-20: ");
				number=scan.nextInt();

					if (number == random){
						System.out.println("You Won!!!");
					}
					else if (number!= random)
						System.out.println("Better Luck Next Time!!!");

				}while (number != random);

			}

		}