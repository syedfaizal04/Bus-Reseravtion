package bus_Resv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusReservationSystem {

	public static void main(String[] args) {

		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,45));
		buses.add(new Bus(3,true,45));
		
		
		int userOpt = 1;

		Scanner scan = new Scanner(System.in);
		
		for(Bus b : buses)
		{
			b.displayBusInfo();
			
		}
		
		while(userOpt == 1)
		{
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOpt = scan.nextInt();

			if(userOpt == 1)
			{
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses))
				{
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");;
				}
				else
				{
					System.out.println("Sorry ! Bus Bokking is full . Try On Another Bus or Date");
				}
				
			}	

		}

	}

}

