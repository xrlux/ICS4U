/**
 * 
 */
package Lu;
import java.util.Scanner;
import java.util.Random;
import java.lang.String;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.File;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;


import hsa_new.Console;      
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Black Jack
 * You're trying to beat the "dealer" in a game of blackjack where your goal is reach 21 or as close as you can before the dealer
 * 01/23/2017
 * @author 323828715 Richard Lu
 *
 */
public class BlackJack {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		
		Random r=new Random ();
		
		      	int high=11;
		        int low=1;
		        int res1;
		        int res2;
		        int reshalf;
		        int total;
		        int total2;
		        int res3;
		        int res4;
		        String mark;
		        int total3;
		        String answer;
		        
				Console c = new Console();
				
				BufferedImage background = ImageIO.read(new File ("src/Lu/tableBackground.png"));
		        c.drawImage(background, 0, 0,500,500, null);
		        res1=r.nextInt(high-low +1) +low;
		        res2=r.nextInt(high-low +1) +low;
		        
		        c.println("Hello, and welcome to BlackJack where your goal is reach the total 21 or as close as you can while trying to beat the dealer, the only problem is.. "
		        		+ "you can only hit once"); 
		      c.println("Your cards are " +res1+ " and " +res2);
		        total=res1+res2;
		        c.println("Your total is: " +total);
		        
		        c.println("If anything is wrong please enter answers in the console area and after getting your third card type in n to see the dealer's cards to see if you have lost or    won!");
		       c.println("Do you want another card? (y or n)");
		        mark=input.next();
		        if (mark.equalsIgnoreCase ("n"));{ 
		            reshalf=r.nextInt(high-low) +low;
		           c.println("Third card is:" +reshalf);
		       total3=res1+res2+reshalf; 
		      c.println("Total: " +total3);
		      answer = c.readLine();
		   
		        }
		        
		        
		        res3=r.nextInt(high-low +1) +low;
		        res4=r.nextInt(high-low +1) +low;

		      c.println("Dealer's cards are " +res3+ " and " +res4);

		        total2=res3+res4;

		       c.println("Dealer's total is: " +total2);
		                if (total3 > 21 || total>21){
		        c.println("You busted");
		        }
		        if (total < total2 || total3 < total2){
		          c.println("You lost");
		        }
		           if (total3 > total2 && total3 < 21){
		             c.println("You win!");
		        }



	}

}
