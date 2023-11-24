import java.util.ResourceBundle;

public class TestBundle {
	public static void main(String[] args) {
		
		ResourceBundle rs= ResourceBundle.getBundle("in.co.rays.bundle.system");
		String driver= rb.getString("com.mysql.cj.jdbc.Driver");
		String url= rb.getString(jdbc:mysql://localhost:3306/sunrays);
		String username= rb.getString("root");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
	}

}
