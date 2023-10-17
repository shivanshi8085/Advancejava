package com.rays.user;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestUser {

	public static void main(String[] args)throws Exception {
		
		//testAdd();
		testUpdate();
		//testSearch();
		
	}

	private static void testSearch()throws Exception {
		
		UserBean bean = new UserBean();
		bean.setFirstName("p");
		bean.setId(2);
		 
		UserModel model = new UserModel();
		List list = model.search(bean, 1, 4);
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

	private static void testUpdate()throws Exception {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");	
		UserModel model= new UserModel();
	UserBean bean= model.findById(13);
	
	bean.setFirstName("akrit");
	bean.setLastName("gupta");
	bean.setLoginId("an@gmail.com");
	//bean.setPassword("345");
	//bean.setDob(sdf.parse("1999-08-16"));
	//bean.setAddress("indore");
	//bean.setId(4);
	
	
	
	model.update(bean);
	
	
		
		
	}

	private static void testAdd()throws Exception {
	
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	UserBean bean= new UserBean();
	
	bean.setFirstName("nidhi");
	bean.setLastName("tiwari");
	bean.setLoginId("dine@gmail.com");
	bean.setPassword("234");
	bean.setDob(sdf.parse("1999-08-16"));
	bean.setAddress("indore");
	
	UserModel model= new UserModel();
	model.add(bean);
	}
	}