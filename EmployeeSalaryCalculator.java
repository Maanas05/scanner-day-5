package codegnan.controlstatements.com;

import java.util.Scanner;

public class EmployeeSalaryCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter years of experience:");
		int experience = scanner.nextInt();
		
		System.out.println("Enter performance score (0-10):");
		int performance = scanner.nextInt();
		
		double salary = 0;
		
		if(experience < 2) {
			salary = 30000;
		}
		else if(experience <= 5) {
			salary = 50000;
		}
		else {
			salary = 70000;
		}
		
		if(performance >= 8) {
			salary = salary + (salary * 0.10);
		}
		
		System.out.println("Total Salary:  " + salary);
		
		scanner.close();
	}
}
