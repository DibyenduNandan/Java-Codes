package model;


import java.util.*;
import pojoclass.*;

public interface FlightService {
	
	
	public Flight addFlight(Flight flight);
	public List<Flight> getAllFlight();
	public Flight getFlightByNumber(long fno);
	public int deleteFlight(long fno);
	public int updateFlight(long fno, Flight newFlight);
	public Flight getMostCostlyFlight();
	public Set<Flight> serachFlight(String source,String destination);
	

}
