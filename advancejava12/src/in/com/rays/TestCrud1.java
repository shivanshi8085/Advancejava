package in.com.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestCrud1 {
	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
		PreparedStatement ps= conn.prepareStatement("insert into emp values(12,'deepika',4980)");
		
		int i=ps.executeUpdate();
		System.out.println("Data inserted+i");
	}
	
	

}

