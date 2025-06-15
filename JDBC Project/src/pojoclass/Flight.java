package pojoclass;

import java.time.LocalDate;

public class Flight {
	private long flightNumber;
	private String flightType;
	private LocalDate flyDate;
	private String sourceLocation;
	private String destinationLocation;
	private double price;
	
	
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public LocalDate getFlyDate() {
		return flyDate;
	}
	public void setFlyDate(LocalDate flyDate) {
		this.flyDate = flyDate;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Flight(long flightNumber, String flightType, LocalDate flyDate, String sourceLocation,
			String destinationLocation, double price) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.flyDate = flyDate;
		this.sourceLocation = sourceLocation;
		this.destinationLocation = destinationLocation;
		this.price = price;
	}
	
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightType=" + flightType + ", flyDate=" + flyDate
				+ ", sourceLocation=" + sourceLocation + ", destinationLocation=" + destinationLocation + ", price="
				+ price + "]";
	}
	

}
