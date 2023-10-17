package com.rays.shiv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeptModel {
	
public void Add(DeptBean bean)throws Exception{
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sunrays","root","root");
	PreparedStatement ps= conn.prepareStatement("insert into emp  values(?,?,?)");
	
	int i=ps.executeUpdate();
	
	ps.setInt(1,bean.getId());
	ps.setString(2,bean.getName());
	ps.setString(3,bean.getSubject());
	
	
	System.out.println("Data Inserted" +i);
}
	

}
