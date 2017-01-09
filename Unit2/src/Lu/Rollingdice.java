/**
 * 
 */
package Lu;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class Rollingdice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] diceNumbers = {0,0,0,0,0,0,0,0,0,0,0,0};
		
		for (int x=1; x<10000; x++)
		{
		int dice1 = (int)(Math.random()*6)+1;
		int dice2= (int)(Math.random()*6)+1;
		
		int totalDice= dice1+dice2;
		
		diceNumbers[totalDice-2]=diceNumbers[totalDice-2]+1;
		
		}
		
		System.out.format("%2s %8s %8s","2", diceNumbers[0],"\n");
		System.out.format("%2s %8s %8s","3", diceNumbers[1],"\n");
		System.out.format("%2s %8s %8s","4", diceNumbers[2],"\n");
		System.out.format("%2s %8s %8s","5", diceNumbers[3],"\n");
		System.out.format("%2s %8s %8s","6", diceNumbers[4],"\n");
		System.out.format("%2s %8s %8s","7", diceNumbers[5],"\n");
		System.out.format("%2s %8s %8s","8", diceNumbers[6],"\n");
		System.out.format("%2s %8s %8s","9", diceNumbers[7],"\n");
		System.out.format("%2s %8s %8s","10", diceNumbers[8],"\n");
		System.out.format("%2s %8s %8s","11", diceNumbers[9],"\n");
		System.out.format("%2s %8s %8s","12", diceNumbers[10],"\n");
		
		
	}

}
