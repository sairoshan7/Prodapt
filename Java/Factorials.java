package File;

import java.util.*;

public class Factorials {

	public static void main(String[] args) throws IllegalArgumentException{
		String keepGoing = "y";
		Scanner scan=new Scanner(System.in);
		
		
		while(keepGoing.equals("y") || keepGoing.equals("Y")) {
			try {
			System.out.println("Enter an integer: ");
			int val=scan.nextInt();
			System.out.println("Factorial(" + val + ")=" + MathUtils.factorial(val));
			System.out.println("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception occured"+e);
		}
	}
		scan.close();
	}
}
