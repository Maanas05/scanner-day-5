package codegnan.controlstatements.com;

import java.util.Scanner;

public class TrafficSimulater {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
	System.out.println("Enter Light state  (Green/Yellow/Red)");
	
	String lightState=scanner.next();
	
	System.out.println("Enter current hour (0–23):"); 
	
	int hour = scanner.nextInt();
	
	boolean isDaytime =(hour >=6 && hour<=18);
	
	String action;
	
	if (lightState.equalsIgnoreCase("Green")) {
		action= "Go";
	}
	
	else {
		
		if(lightState.equalsIgnoreCase("Red")) {
			
			action ="Stop";
		}
		
		else {
			if(lightState.equalsIgnoreCase("Yellow")) {
				if (isDaytime) {
					action = "slow";
				}
				else {
					action = "stop";
				}
				
			}
			else {
				action = "Invalid light state";
			}
		}
	}
	
	System.out.println(action);
	scanner.close();
	
	

	}

}
