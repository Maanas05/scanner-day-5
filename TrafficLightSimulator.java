package codegnan.controlstatements.com;

import java.util.Scanner;

public class TrafficLightSimulator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the light state (Green, Yellow, Red):");
		String light = scanner.next().toLowerCase();
		
		System.out.println("Enter the hour (0-23):");
		int hour = scanner.nextInt();
		
		if(light.equals("green")) {
			System.out.println("Go");
		}
		else if(light.equals("red")) {
			System.out.println("Stop");
		}
		else if(light.equals("yellow")) {
			if(hour >= 6 && hour < 18) {
				System.out.println("Slow");
			}
			else {
				System.out.println("Stop");
			}
		}
		else {
			System.out.println("Invalid light state");
		}
		
		scanner.close();
	}
}
