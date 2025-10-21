package com.codegnan.operatorexamples;

import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the income");
		
		double income=scanner.nextDouble();
		
		double taxrate=(income<300000)? 0.05: (income>300000 && income <1000000)?0.10:
			(income>1000000 && income <2000000)?0.15:0.15;
		
		double tax = income*taxrate;
		
		tax = (income>2000000)?tax+(tax*0.01):tax;
		
		double salary = income -tax;
		
		System.out.println("income  " +income);
		
		System.out.println("taxrate  " +taxrate);
		
		System.out.println("tax    " +tax);
		
		System.out.println("net salary after tax  "+salary);
		
		scanner.close();
		
		
		

	}

}
