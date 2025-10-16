package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundInterest {
	
	

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the principal: ");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter the rate of interest (%) : ");
		double interest = scanner.nextDouble();
		
		System.out.println("Enter the time : ");
		double time=scanner.nextDouble();
		
		double amount = principal*Math.pow((1+interest/100),time);
		double compoundamount = amount-principal;
		
		
		System.out.println("coumpound interest : "+compoundamount+ "\nTotal amount : "+amount);
		
		//System.out.printf("compound interest : %.2f \nTotal amount : %2f ",compoundamount,amount);

		
		scanner.close();
		
		
		
		

	}

}
