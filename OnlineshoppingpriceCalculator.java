package codegnan.controlstatements.com;

import java.util.Scanner;

public class OnlineshoppingpriceCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the total amount:");
		double amount = scanner.nextDouble();
		
		System.out.println("Is it festival season? (true/false):");
		boolean festival = scanner.nextBoolean();
		
		System.out.println("Do you have prime membership? (true/false):");
		boolean member = scanner.nextBoolean();
		
		double bill = amount;
		
		if(amount >= 10000) {
			bill = amount - (amount * 0.20);
		}
		else if(amount >= 5000) {
			bill = amount - (amount * 0.10);
		}
		
		if(festival) {
			bill = bill - (amount * 0.05);
		}
		
		if(member) {
			bill = bill - 200;
		}
		
		System.out.println("Final Payable Amount: " + bill);
		
		scanner.close();
	}
}
