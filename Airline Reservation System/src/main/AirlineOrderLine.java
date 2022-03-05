package main;

public class AirlineOrderLine {

	private String airline;
	private String flightNumber;
	private String origin;
	private String destination;
	private String customerFirstName;
	private String customerLastName;
	private double price;
	
	public AirlineOrderLine(String airline, String flightNumber, String origin, String destination, double price) 
	{
		this.airline = airline;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "AirlineOrderLine [airline=" + airline + ", flightNumber=" + flightNumber + ", origin=" + origin
				+ ", destination=" + destination + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", price=" + price + "]";
	}

	public String getAirline() 
	{
		return airline;
	}

	public void setAirline(String airline) 
	{
		this.airline = airline;
	}

	public String getFlightNumber() 
	{
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) 
	{
		this.flightNumber = flightNumber;
	}

	public String getOrigin() 
	{
		return origin;
	}

	public void setOrigin(String origin) 
	{
		this.origin = origin;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination) 
	{
		this.destination = destination;
	}

	public String getCustomerFirstName() 
	{
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) 
	{
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() 
	{
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) 
	{
		this.customerLastName = customerLastName;
	}
}