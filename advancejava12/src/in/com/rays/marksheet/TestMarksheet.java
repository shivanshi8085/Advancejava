package in.com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args)throws Exception {
		
		//testAdd();
		//testUpdate();
		//testDelete();
		//testFindById();
		testSearch();
		
	}

	private static void testSearch()throws Exception {
		
		MarksheetModel model= new MarksheetModel();
		
		List list= model.search();
		Iterator it =list.iterator();
		while(it.hasNext()) {
			
			MarksheetBean bean=(MarksheetBean)it.next();
			System.out.println("\t"+bean.getId());
			System.out.println("\t"+bean.getName());
			System.out.println("\t"+bean.getRollNo());
			System.out.println("\t"+bean.getPhysics());
			System.out.println("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
		}
		
		
	}

	private static void testFindById() throws Exception{
		
		
		MarksheetModel model= new MarksheetModel();
		MarksheetBean bean= model.findById(7);
		
		if(bean!=null) {
			System.out.println(bean.getId());
			System.out.println("\t"+bean.getName());
			System.out.println("\t"+bean.getRollNo());
			System.out.println("\t"+bean.getPhysics());
			System.out.println("\t"+bean.getChemistry());
			System.out.println("\t"+bean.getMaths());
			
		}else {
			System.out.println("ID does not exist...!!!");
		}
		
		
	}

	private static void testDelete() throws Exception {
		MarksheetModel model= new MarksheetModel();
		
		model.delete(11);
		
	}

	private static void testUpdate()throws Exception {
		
		MarksheetBean bean= new MarksheetBean();
		bean.setId(6);
		bean.setName("mona");
		bean.setRollNo(112);
		bean.setPhysics(65);
		bean.setChemistry(59);
		bean.setMaths(63);
		
		MarksheetModel model= new MarksheetModel();
		
		model.update(bean);
		
		
	}

	private static void testAdd()throws Exception {
		
		MarksheetBean bean= new MarksheetBean();
	
		bean.setId(13);
		bean.setName("preksha");
		bean.setRollNo(111);
		bean.setPhysics(56);
		bean.setChemistry(45);
		bean.setMaths(98);
		
		
		MarksheetModel model= new MarksheetModel();
		model.add(bean);
	}
		
	

}
