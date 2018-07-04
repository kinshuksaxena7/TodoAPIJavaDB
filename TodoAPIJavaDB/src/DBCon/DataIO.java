package DBCon;

import java.sql.*;

public class DataIO {

	Connection conn = null;
	private String url = "jdbc:mysql://localhost:3306/JavaAPI?user=root&password=Root1234&serverTimezone=UTC";

	public DataIO() {
		try

		{
			conn = DriverManager.getConnection(url);
			if (conn != null) {
				System.out.println("Connected to the database JavaAPI");
			}

		} catch (SQLException ex) {
			System.out.println("An error occurred, No database connection!");
			ex.printStackTrace();
		}
	}

	
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
