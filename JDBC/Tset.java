package wolk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tset {
	public static void main(String []args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","1128");
			s = c.createStatement();
			ResultSet set = s.executeQuery("Select * from details");
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String usn = set.getString(3);
				System.out.println(id + " " + name + " " + usn);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		}
		finally { 
			try {
				s.close();
				c.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
