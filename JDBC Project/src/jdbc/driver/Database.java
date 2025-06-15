package jdbc.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public static Connection getConnect() {
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FlightDb","root","Dib@1234");
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			System.out.println("Connetion not established "+e.getMessage());
		}
		return con;
	}
	public static void main(String[] args) {
		getConnect();
	}
}
