package in.co.rays.util;

import java.sql.Connection;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	
	private static JdbcDataSource jds=null;
	private ComboPooledDataSource cpds=null;
ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.system");
	
	private JdbcDataSource() {
		try {
			cpds= new ComboPooledDataSource();
			
			
			cpds.setDriverClass(rb.getString("driver"));
			cpds.setJdbcUrl(rb.getString("url"));
			cpds.setUser(rb.getString("username"));
			cpds.setPassword(rb.getString("password"));
			cpds.setInitialPoolSize(Integer.parseInt(rb.getString("initialpoolsize")));
			cpds.setAcquireIncrement(Integer.parseInt(rb.getString("acquireincrement")));
			cpds.setMaxPoolSize(Integer.parseInt(rb.getString("maxpoolsize")));
			
		} catch (Exception e) {
			
		}
	}
	public static JdbcDataSource getInstance() {
		if(jds==null) {
			jds= new JdbcDataSource();
		}
		return jds;
	}
	public static Connection getConnection() {
		try {
			return getInstance().cpds.getConnection();
			
		} catch (Exception e) {
			
		}
		return null;
	}
	

	
}


