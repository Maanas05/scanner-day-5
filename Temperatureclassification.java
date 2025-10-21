package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Temperatureclassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the temperature");
		
		int temp=scanner.nextInt();
		
		String tem = (temp>=30)?"Hot":(temp>15 && temp<30 )?"Moderate":"Cold";
		
		System.out.println(tem);
		
		scanner.close();

	}

}
