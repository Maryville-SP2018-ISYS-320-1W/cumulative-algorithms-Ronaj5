import java.util.Scanner;
/*
	ISYS 320
	Name(s): Rona Davis	
	Date: April 8, 2018
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int count = console.nextInt();
		int product = 1;
		for (int i = 1; i <= 3; i++) {
		    System.out.print("Next number:");
		    int num = console.nextInt();
		    product *= num;
		}
		System.out.println("Product = " + product);
		
	}

}
