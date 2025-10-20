package com.codegnan.operatorexamples;

import java.util.Scanner;

public class agegroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter age" );
		
		int age=scanner.nextInt();
		
		String result = (age<12)? "Child" :
		(age >=12 && age<19)? "Teenager" : 
		(age >=20 && age<64)? "Adult" :
		(age>=65 )? "Older":"invalid";
		
		System.out.println("you are " +result);
		
		scanner.close();
		
		

	}

}
