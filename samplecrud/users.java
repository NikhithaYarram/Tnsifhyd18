package samplecrud;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class users {
public static void main(String[] args) {
	String dburl="jdbc:mysql://localhost:3306/sampledb";
	String name="root";
	String pass="root";
	
	try {
		Connection conn=DriverManager.getConnection(dburl,name,pass);
		if(conn!=null) {
			System.out.println("Connected to database");
			conn.close();
		}
	
	}
	catch(SQLException ex) {
		ex.printStackTrace();
	}
}
}
