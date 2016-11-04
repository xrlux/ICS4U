import java.util.Scanner;

public class crosscountry {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		String answer =scan.nextLine();
		if (answer.equals("MG")) {	
			System.out.println("midget girls");} 
		else if (answer.equals("MB")) {	
			System.out.println("midget boys");} 
		else if (answer.equals("JG")) {	
			System.out.println("junior girls");} 
		else if (answer.equals("JB")) {	
			System.out.println("junior boys");} 
		else if (answer.equals("SG")) {	
			System.out.println("senior girls");} 
		else if (answer.equals("SB")) {	
			System.out.println("senior boys");} 
		else {
			System.out.println("invalid code");}
	}

}
