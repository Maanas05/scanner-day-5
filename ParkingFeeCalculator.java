package codegnan.controlstatements.com;

import java.util.Scanner;

public class ParkingFeeCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the vehicle type (Car, Bike, Truck):");
		String type = scanner.next().toLowerCase();
		
		System.out.println("Enter the arrival time (24-hour format):");
		int arrival = scanner.nextInt();
		
		System.out.println("Enter the departure time (24-hour format):");
		int departure = scanner.nextInt();
		
		int hours;
		if(departure >= arrival) {
			hours = departure - arrival;
		} else {
			hours = (24 - arrival) + departure;
		}
		
		double rate = 0;
		if(type.equals("car")) {
			rate = 50;
		}
		else if(type.equals("bike")) {
			rate = 30;
		}
		else if(type.equals("truck")) {
			rate = 100;
		}
		else {
			System.out.println("Invalid vehicle type!");
			scanner.close();
			return;
		}
		
		double fee = hours * rate;
		
		if(hours > 5) {
			fee = fee - (fee * 0.20);
		}
		
		if((arrival >= 18 && arrival <= 23) || (arrival >= 0 && arrival < 8)) {
			fee = fee + (fee * 0.50);
		}
		
		System.out.println("Total parking fee:  " + fee);
		
		scanner.close();
	}
}
