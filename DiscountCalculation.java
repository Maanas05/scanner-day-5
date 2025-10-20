package com.codegnan.operatorexamples;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter the amount");
		
		int amount = scanner.nextInt();
		
		double discount = (amount>=1000)?  0.2 : 
			(amount >500 &&  amount < 999)? 0.1 : 0.0;
		
		double discountamount= amount*discount;
		
		double totalamount = amount-discountamount;
		
		
		
		System.out.println("discounted amount is: " +discountamount );
		System.out.println("final amount is: " +totalamount );
		
		scanner.close();
		

	}

}
