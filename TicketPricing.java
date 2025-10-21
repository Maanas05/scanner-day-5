package codegnan.controlstatements.com;

public class TicketPricing {
	
	

	public static void main(String[] args) {
		
		String PassengerType="adult";
		String  bookingTime="early";
		
		
		boolean isMember=true;
		double baseprice=5000;
		
		if(PassengerType.equalsIgnoreCase("child")) {
			baseprice*=0.5;
		}
		else {
			if(PassengerType.equalsIgnoreCase("senior")) {
				baseprice  *=0.8;
			}
			else {
				if (PassengerType.equalsIgnoreCase("adult")) {
					
				}
				else {
					System.out.println("Invalid passenger type");
					return;
				}
			}
		}
		
		
		//booking time adjustment
		
		if(bookingTime.equalsIgnoreCase("early")) {
			baseprice*=0.9;
		}
		
		else {
			if(bookingTime.equalsIgnoreCase("normal")) {
				
			} else {
				if(bookingTime.equalsIgnoreCase("last-minute")) {
					baseprice*=1.2;
				}
				else {
					System.out.println("invalid bookingtime");
					return;
				}
			}
		}
		
		if(isMember)  {
			baseprice *=0.95;
		}
		
		System.out.println("Final tickety price : " + baseprice);

	}

}
