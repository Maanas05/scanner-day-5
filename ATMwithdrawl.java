package codegnan.controlstatements.com;

import java.util.Scanner;

public class ATMwithdrawl {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		
		double amount= scanner.nextDouble();
		
		if (amount<=1000) {
			System.out.print( "withdrawl successfull  \nwithdrawl  "+amount+"\n remaining amount  " +(1000-amount) );
			
			
		}
		
		else
		{
			System.out.println("amount is not sufficient");
			
		}
		
		scanner.close();
		
		
		

	}

}
