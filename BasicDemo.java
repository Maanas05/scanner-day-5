package codegnan.controlstatements.com;

import java.util.Scanner;

public class BasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = scanner.nextInt();
		
		if(number>0) {
			System.out.println("The number "+number+"is positive");
		}
		
		else {
			System.out.println("the number "+number+"is negative");
			
		}
		
		System.out.println("this statement always execute");
		
		scanner.close();

	}

}
