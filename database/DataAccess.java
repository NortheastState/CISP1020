package database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAccess
{
	public static void main(String[] args)
	{
		//String connectionString = "jdbc:mariadb://localhost/plowboy_mfgParts?user=plowboy_NE1&password=NE_Plow_!1";
		//String connectionString = "jdbc:mariadb://mysql1208.ixwebhosting.com:3306/plowboy_mfgParts?user=plowboy_NE1&password=NE_Plow_!1";
		String connectionString = "jdbc:mysql://mysql1208.ixwebhosting.com:3306/plowboy_mfgParts?user=plowboy_NE1&password=NE_Plow_!1";
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try
		{
			connection = DriverManager.getConnection(connectionString);
			statement = connection.createStatement();	
			
			String query = "SELECT * FROM AssemblyParts";

			rs = statement.executeQuery(query);
			while (rs.next())
			{
				System.out.println(rs.getString("PartNumber") 
						+ " :: " + rs.getString("PartDescription") 
						+ " :: " + rs.getInt("PressID")
						+ " :: " + rs.getDouble("MaxInjPressure") 
						+ " :: " + rs.getDouble("MinInjPressure")
						+ " :: " + rs.getDouble("Xdiminsion") 
						+ " :: " + rs.getDouble("Ydiminsion")
						+ " :: " + rs.getBoolean("TopCoat"));
				
			}
			
			connection.close();
			
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
