package com.codegnan.operatorexamples;

import java.util.Scanner;

public class greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the hour(0-23): ");
		
		int hour=scanner.nextInt();

		String greeting=(hour >=5 && hour<12 )? "Good Morning" : 
			(hour >=12 && hour <17 )? "Good Afternoon":
			(hour>=17 && hour <22)? "Good Evening":(hour>=22 && hour<5)?"Good Night":"invlalid";

		
		System.out.println(greeting);
		
		scanner.close();
		

	}

}
