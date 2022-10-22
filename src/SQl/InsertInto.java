package SQl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertInto{
	


public static void main(String[] args) {
		
	
	try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice1", "root", "5555");
		System.out.println(con);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("ALTER TABLE mysql3 ADD Gender Boolean ");
	} catch (Exception e) {
     e.printStackTrace();
	}
}
}
