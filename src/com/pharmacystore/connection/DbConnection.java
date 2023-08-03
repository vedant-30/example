package com.pharmacystore.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDatabaseConnection()
	{
		try {
			Class.forName(DbDetails.DBDRIVER);
			
	Connection	con = DriverManager.getConnection(
					DbDetails.CONSTR,
					DbDetails.USERNAME,
					DbDetails.PASSWORD);
			return con;
			
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace(); // Jo bhi exception aaega, uski detail mil jaegi 
			return null;
		}
		catch (NullPointerException exc) {
			exc.printStackTrace();
			return null;
		}
	}
}
