package com.rays.shiv;

public class TestDept {
	
	public static void main(String[] args)throws Exception {
		
		
		testAdd();
	}

	private static void testAdd()throws Exception {
		
		DeptBean bean = new DeptBean();
		
	bean.setId(1);
	bean.setName("shivani");
	//bean.setSubject("hindi");
	
	DeptModel model= new DeptModel();
	model.Add(bean);
		
	}

}
