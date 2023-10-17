package com.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestTransaction {
	
	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
		
		
		try {
			conn.setAutoCommit(false);
			
			Statement stmt= conn.createStatement();
			int i= stmt.executeUpdate("insert into emp values(11,'rohit',1200)");
			
			 i= stmt.executeUpdate("insert into emp values(16,'arnav',1100)");
			 i= stmt.executeUpdate("insert into emp values(17,'bharti',1200)");
			 
			 conn.commit();
			 conn.close();
			 System.out.println("Data inserted" +i);
			 
		}catch(Exception e) {
			//conn.rollback();
				
		}
		
	}
}



