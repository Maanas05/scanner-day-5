package com.codegnan.operatorexamples;

import java.util.Scanner;
public class BankAccountStatusCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the amount");
		
		int amount = scanner.nextInt();
		
		String status=(amount>=1000)? "Good Standing" :(amount >500 && amount <999)? "Low Balance":"Account overdrawn";
		
		System.out.println("your bank account balance is " +amount + "\n status " +status);
		
		scanner.close();
	}

}
