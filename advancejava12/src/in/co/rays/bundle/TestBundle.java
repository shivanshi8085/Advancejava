package in.co.rays.bundle;

import java.util.ResourceBundle;

public class TestBundle {
	
	public static void main(String[] args) {
		
		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app");
		
		String driver = rb.getString("greet");
		System.out.println(driver);
		
	}

}
