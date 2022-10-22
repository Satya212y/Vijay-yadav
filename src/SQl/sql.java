package SQl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql {
	public static void main(String[] args) {
		
	 
	try {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_practice1", "root", "5555");
		System.out.println(con);
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery("select * from mysql3 Order By city desc");
		while(result.next()) {
			System.out.println(result.getString(1));
//			System.out.println(result.getString(2));
//		    System.out.println(result.getString(3));
//			System.out.println(result.getString(4));
//			System.out.println(result.getString(5));
		}
	} catch (Exception e) {
     e.printStackTrace();
	}
}
}


