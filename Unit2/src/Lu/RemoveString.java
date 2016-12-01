/**
 * 
 */
package Lu;
import java.util.Scanner;

/**
 * @author 323828715
 *
 */
public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int indexStringEnding;
		String sentence1;
		String string;
		
		System.out.print("Enter a sentence: ");
		sentence1=scan.nextLine();
		
		System.out.print("Enter a string: ");
		string=scan.nextLine();
		
		int index=(sentence1.indexOf(string));
		
		indexStringEnding=(string.length());
		
		System.out.println(sentence1.substring(0,index)+sentence1.substring(indexStringEnding+index));
	}

}
