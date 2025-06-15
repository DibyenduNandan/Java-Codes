package crud;
import java.time.LocalDate;
import java.util.*;
import java.sql.*;
import java.sql.Date;

import jdbc.driver.Database;
import model.FlightService;
import pojoclass.*;

public class FlightServiceImpl implements FlightService {

	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Flight flightObj=new Flight();
		 * flightObj.setFlightNumber(10007);
		 * flightObj.setFlightType("Indigo");
		 * flightObj.setFlyDate(LocalDate);
		 * flightObj.setFlightSource("kol");
		 * flightObj.setFlightDestination("Pune");
		 * flightObj.setFlightPriec(5555);
		 * 
		 * addFlight(flightObj)
		 * 
		 * 
		 * 
		 */

		Connection con= Database.getConnect();
		int insertStatus=0;
		try {
			/*
			 *  PreparedStatement  prepareStatement(String sql)throws SqlException
			 * 
			 * 
			 */
			String insertQuery="insert into FlightInfo values(?,?,?,?,?,?)";
			PreparedStatement ps=	  con.prepareStatement(insertQuery);
			//void setLong(int paremeteIndex, Object)
			ps.setLong(1,flight.getFlightNumber());
			ps.setString(2, flight.getFlightType());

			LocalDate ld=flight.getFlyDate();
			Date dt= Date.valueOf(ld);
			ps.setDate(3,dt);
			ps.setString(4, flight.getSourceLocation());
			ps.setString(5, flight.getDestinationLocation());
			ps.setDouble(6, flight.getPrice());
			insertStatus=		ps.executeUpdate();


			//	Statement stmt=		con.createStatement();
			//	long num=109;
			//	String flihgtName="Indigo";
			//	
			//			stmt.executeUpdate("insert into FlightInfo values("+num+",'"+flihgtName+"'");



		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		if(insertStatus>0)
		{
			return flight;
		}


		return null;
	}

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		Connection con= Database.getConnect();
		List<Flight> ans= new ArrayList<>();
		try {
			PreparedStatement p= con.prepareStatement("Select * from FlightInfo");
			ResultSet rs=p.executeQuery();
			while(rs.next()){
				ans.add(new Flight(rs.getLong("id"),rs.getString("flightType"),rs.getDate(3).toLocalDate(),rs.getString(4),rs.getString(5),rs.getDouble(6)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Cannot Fetch data");
			}

			return ans;
	}

	@Override
	public Flight getFlightByNumber(long fno) {
		// TODO Auto-generated method stub
		Flight ans=null;
		PreparedStatement p;
		try {
			Connection  con=Database.getConnect();
			String query= "Select * from FlightInfo f where f.id=?";
			p = con.prepareStatement(query);
			p.setLong(1, fno);
			ResultSet rs= p.executeQuery();
			ans=new Flight(rs.getLong("id"),rs.getString("flightType"),rs.getDate(3).toLocalDate(),rs.getString(4),rs.getString(5),rs.getDouble(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot find most costly flight");
		}

		return ans;
	}

	@Override
	public int deleteFlight(long fno) {
		// TODO Auto-generated method stub
		int delStatus=0;
		try {
			Connection con=Database.getConnect();
			PreparedStatement ps=con.prepareStatement("delete from FlightInfo where id=?");
			ps.setLong(1, fno);
			delStatus= ps.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Delete not successful");
		}
		return delStatus;
	}

	@Override
	public int updateFlight(long fno,Flight f) {
		
		
		int upStatus=0;
		try {
			Connection con=Database.getConnect();
			PreparedStatement ps=con.prepareStatement("update FlightInfo set sourceLocation=?, destinationLocation-? , price=? where id=?");
			ps.setLong(1, fno);
			upStatus= ps.executeUpdate();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Delete not successful");
		}
		return upStatus;
		
		
	}

	@Override
	public Flight getMostCostlyFlight() {
		// TODO Auto-generated method stub
		Flight ans=null;
		PreparedStatement p;
		try {
			Connection  con=Database.getConnect();
			String query= "Select * from FlightInfo f where f.price=(Select max(price) from FlightInfo";
			p = con.prepareStatement(query);
			ResultSet rs= p.executeQuery();
			ans=new Flight(rs.getLong("id"),rs.getString("flightType"),rs.getDate(3).toLocalDate(),rs.getString(4),rs.getString(5),rs.getDouble(6));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot find most costly flight");
		}

		return ans;
	}

	@Override
	public Set<Flight> serachFlight(String source, String destination) {
		// TODO Auto-generated method stub
		Connection con=Database.getConnect();
		Set<Flight> ans=new HashSet<>();
		String search="select * from FlightInfo f where f.sourceLocation="+"'"+source+"'"+" and "+"destinationLocation="+"'"+destination+"'";
		System.out.println(search);
		try {
			PreparedStatement p= con.prepareStatement(search);
			ResultSet rs= p.executeQuery();
			while(rs.next()) {
				ans.add(new Flight(rs.getLong("id"),rs.getString("flightType"),rs.getDate(3).toLocalDate(),rs.getString(4),rs.getString(5),rs.getDouble(6)));
			}
			return ans;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Data not updated");
		}
		return null;
	}

}

