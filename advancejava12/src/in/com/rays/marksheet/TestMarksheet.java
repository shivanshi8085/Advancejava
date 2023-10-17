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
	
	MarksheetBean bean= new MarksheetBean();
	
	bean.setName("a");
	bean.setRollNo(102);
	
	
	MarksheetModel model= new MarksheetModel();
	
	List list= model.search(null ,1,6);
	
	Iterator it= list.iterator();
	
	while(it.hasNext()) {
		bean=(MarksheetBean)it.next();
		
		System.out.print(bean.getId());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getRollNo());
		System.out.print("\t"+bean.getPhysics());
		System.out.print("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
	}
	
	
	
}

private static void testFindById()throws Exception {
	
	MarksheetModel model= new MarksheetModel();
	
	MarksheetBean bean= model.findById(8);
	
	if(bean!=null) {
		System.out.println(bean.getId());
		System.out.println("\t"+bean.getName());
		System.out.println("\t"+bean.getRollNo());
		System.out.println("\t"+bean.getPhysics());
		System.out.println("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
		
	}else {
		System.out.println("ID does not exist");
	}
	
}

private static void testDelete()throws Exception {
	
	MarksheetModel model= new MarksheetModel();
	
	model.delete(7);
	
}

private static void testUpdate() throws Exception{
	
	MarksheetBean bean= new MarksheetBean();
	bean.setId(1);
	bean.setName("sachin");
	bean.setRollNo(101);
	bean.setPhysics(67);
	bean.setChemistry(34);
	bean.setMaths(87);
	
	MarksheetModel model= new MarksheetModel();
	
	model.update(bean);
	
}

private static void testAdd()throws Exception{
	MarksheetBean bean= new MarksheetBean();
	
	bean.setName("sachin");
	bean.setRollNo(115);
	bean.setPhysics(67);
	bean.setChemistry(34);
	bean.setMaths(87);
	
	MarksheetModel model= new MarksheetModel();
	
	model.add(bean);
	
	
}	
	

}
