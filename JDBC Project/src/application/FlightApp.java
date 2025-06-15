package application;

import java.time.LocalDate;
import java.util.Set;

import crud.FlightServiceImpl;
import pojoclass.Flight;

public class FlightApp {
	public static void main(String[] args) {
//		Flight flight = new Flight(1008,"Indigo",LocalDate.now(),"Kolkata","Delhi",4567.00);
		Flight flight1 = new Flight(1015,"Indigo",LocalDate.now(),"Kolkata","Pune",4567.00);
//		Flight flight2 = new Flight(1009,"Indigo",LocalDate.now(),"Mumbai","Kolkata",4567.00);
//		Flight flight3 = new Flight(1011,"Indigo",LocalDate.now(),"Chennai","Delhi",4567.00);
//		Flight flight4 = new Flight(1012,"Indigo",LocalDate.now(),"Kolkata","Chennai",4567.00);
		FlightServiceImpl service=new FlightServiceImpl();
		Flight fobj= service.addFlight(flight1);
//		Flight fobj1= service.addFlight(flight2);
//		Flight fobj2= service.addFlight(flight3);
//		Flight fobj3= service.addFlight(flight4);
		if(fobj!=null)
		{
			Set<Flight> ans= service.serachFlight("Kolkata", "Delhi");
			System.out.println(ans);
			System.out.println("flight saved");
		}else
		{
			System.out.println("not saved");
		}
Flight f1=new Flight();
f1.setPrice(1334);
f1.setSourceLocation("Bangalore");
f1.setDestinationLocation("pune");
          service.updateFlight(1015, f1);
	}


}
