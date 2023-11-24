package in.co.rays.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	
	public static void main(String[] args) throws Exception {
		
		//testAdd();
		//testUpdate();
		//testDelete();
		//testAuthenticate();
		testSearch();
		
	}

	private static void testSearch() throws Exception{
		UserBean bean = new UserBean();
		bean.setFirstName("p");
		bean.setId(2);
		 
		UserModel model = new UserModel();
		List list= model.search(null, 1, 4);
		Iterator it = list.iterator();
		while (it.hasNext()) {  
			
			bean = (UserBean)it.next();
			System.out.print("\t"+bean.getId());
			System.out.print("\t"+bean.getFirstName());
			System.out.print("\t"+bean.getLastName());
			System.out.print("\t"+bean.getLoginId());
			System.out.print("\t"+bean.getPassword());
			System.out.print("\t"+bean.getDob());
			System.out.println("\t"+bean.getAddress());

			
		}
		
	}
		
		
		
	

	private static void testAuthenticate() throws Exception  {
		 
		UserModel model= new UserModel();
		UserBean bean = model.authenticate("shiv@gmail.com","234");
		
		if(bean!=null) {
			
		System.out.println(bean.getId());
		System.out.println(bean.getFirstName());
		System.out.println(bean.getLastName());
		System.out.println(bean.getLoginId());
		System.out.println(bean.getPassword());
		System.out.println(bean.getDob());
		System.out.println(bean.getAddress());
		
		}else {
			System.out.println("User does not exist....");
		}
		
		
		
		
	}

	private static void testDelete() throws Exception {
		UserBean bean = new UserBean();
		
		bean.setId(12);
		
		UserModel model = new UserModel();
		model.delete(3);
		
	}

	private static void testUpdate() throws Exception {
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean= new UserBean();
		
		bean.setFirstName("bhumi");
		bean.setLastName("patel");
		bean.setLoginId("bhu@gmail.com");
		bean.setPassword("564");
		bean.setDob(sdf.parse("2001-04-13"));	
		bean.setAddress("satna");
		bean.setId(9);
		
		UserModel model= new UserModel();
		model.update(bean);
	}

	private static void testAdd() throws Exception {
	
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");	
		
	UserBean bean = new UserBean();
	bean.setId(21);
	bean.setFirstName("komal");
	bean.setLastName("goswami");
	bean.setLoginId("k@gmail.com");
	bean.setPassword("246");
	bean.setDob(sdf.parse("2005-05-12"));
	bean.setAddress("rewa");
	
	UserModel model= new UserModel();
	model.add(bean);
	
}
	

}
