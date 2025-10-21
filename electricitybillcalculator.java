package codegnan.controlstatements.com;

import java.util.Scanner;

public class electricitybillcalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the units");
		
		int units=scanner.nextInt();
		
		System.out.println("enter your age");
		
		int age=scanner.nextInt();
		
		double bill =0.0;
		
		if (units <= 100) {
            bill = units * 1.50;
		}
		else if(units<=200) {
			bill = (100*1.50)+((units-100)*2.00);
		}
		else if(units<=300) {
			bill = (100*1.50)+(100*2.00)+((units-200)*3.00);
		}
		else {
			bill = (100*1.50)+(100*2.00)+(100*3.00)+((units-300)*5.00);
		}
        
       
        bill = (bill > 1000) ? bill + (bill * 0.10) : bill;
        
        
        bill = (age >= 60) ? bill - (bill * 0.05) : bill;
        
        
        System.out.println("Electricity Bill Summary");
        System.out.println("Units Consumed: " + units);
        System.out.println("Base Amount: " + String.format("%.2f", bill));
        
        
        scanner.close();


			
			
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
