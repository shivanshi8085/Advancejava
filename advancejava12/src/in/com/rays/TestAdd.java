package in.com.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[]args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
		Statement stmt= conn.createStatement();
		
		int i=stmt.executeUpdate("insert into emp values(1,'shivanshi',1000)");
		stmt.executeUpdate("insert into emp values(2,'pranshu',2000)");
		stmt.executeUpdate("insert into emp values(3,'shivali',3000)");
		stmt.executeUpdate("insert into emp values(4,'aryan',3500)");
		
		
		System.out.println("Data inserted"+i);
		
	}
	private static void add(int id,String name,int salary)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
		Statement stmt= conn.createStatement();
		
		int i=stmt.executeUpdate("insert into emp values("+id+","+name+","+salary+")");
	
		
		System.out.println("Data inserted"+i);
		
		
		
	}

}
