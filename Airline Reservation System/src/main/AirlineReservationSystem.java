package main;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineReservationSystem {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<AirlineOrderLine> flights = new ArrayList<>();
		AirlineOrderLine a1 = new AirlineOrderLine("Delta", "DL20345", "ATL", "HND", 1232);
		AirlineOrderLine a2 = new AirlineOrderLine("Delta", "DL23443", "HND", "ATL", 1200);
		AirlineOrderLine a3 = new AirlineOrderLine("Continental", "CT23435", "CAE", "ATL", 222);
		AirlineOrderLine a4 = new AirlineOrderLine("Continental", "CT34345", "ATL", "DME", 890);
		AirlineOrderLine a5 = new AirlineOrderLine("Continental", "CT35323", "DME", "ORD", 878);
		AirlineOrderLine a6 = new AirlineOrderLine("JAL", "JL20365", "NRT", "ORD", 455);
		AirlineOrderLine a7 = new AirlineOrderLine("JAL", "JL24900", "NRT", "MDW", 465);
		AirlineOrderLine a8 = new AirlineOrderLine("ANA", "AN34324", "HND", "LAX", 990);
		AirlineOrderLine a9 = new AirlineOrderLine("ANA", "AN34303", "LAX", "NRT", 995);
		flights.add(a1);
		flights.add(a2);
		flights.add(a3);
		flights.add(a4);
		flights.add(a5);
		flights.add(a6);
		flights.add(a7);
		flights.add(a8);
		flights.add(a9);
		int userInput = 0;
		
		do
		{
			System.out.println("1 - View Available Tickets");
			System.out.println("2 - Purchase Ticket");
			userInput = console.nextInt();
			if(userInput == 1)
			{
				for(AirlineOrderLine a : flights)
				{
					System.out.println(a);
				}
			}
			else
			{
				System.out.println("Which flight do you want to purchase?");
				int i = 0;
				for(AirlineOrderLine a : flights)
				{
					System.out.println(a + " - " + i);
				}
				userInput = console.nextInt();
				AirlineOrderLine ticket = flights.get(userInput);
				System.out.println("You have purchased the following: " + ticket);
			}
			System.out.println("Enter another option? 1 - Yes, 2 - No");
			userInput = console.nextInt();
		}
		while(userInput == 1);
	}
}