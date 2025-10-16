package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*int a=10,b=20,c=30;
		String d="codegnan";
		System.out.println(a+b+c+d);  //60codegnan
		System.out.println(a+b+d+c); //30codegnan30
		System.out.println(a+d+b+c);
		System.out.println(d+a+b+c);
		*/
		
		
		int i,k;
		i=10;
		k=i<0?-i :i;//10
		System.out.println("absolute value of "+i+"is"+k);
		i = -10;
		k=i<0? -i :i;
		System.out.println("absolute value of " +i + "is" +k);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = scanner.nextInt();
		
		String result=(age>18)?"Eligible to vote ": "not eligible to vote";
		System.out.println(result);
		scanner.close();
		

	}

	
	
}


//even or odd
//leap year or not leap year
//number is positive or not
//number is divisible by 5 or not
