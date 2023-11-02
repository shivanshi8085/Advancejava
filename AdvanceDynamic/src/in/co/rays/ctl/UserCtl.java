package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/UserCtl")
public class UserCtl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id =req.getParameter("id");
		if(id!=null) {
			UserModel model= new UserModel();
			
			try {
				UserBean bean = model.findById(Integer.parseInt(id));
				req.setAttribute("bean",bean);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		RequestDispatcher rd= req.getRequestDispatcher("UserView.jsp");
		rd.forward(req, resp);
		//System.out.println("in first servlet do post");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		
	   System.out.println("in first servlet do post");
	   
	   String op= req.getParameter("operation");
	   

		String id = req.getParameter("id");
		String firstname = req.getParameter("firstName");
		String lastname = req.getParameter("lastName");
		String loginId = req.getParameter("loginId");
		String password = req.getParameter("password");
		String dob = req.getParameter("dob");
		String address = req.getParameter("address");
		
		UserBean bean = new UserBean();
		if(id !=null) {
			bean.setId(Integer.parseInt(id));
		}
		bean.setFirstName(firstname);
		bean.setLastName(lastname);
		bean.setLoginId(loginId);
		bean.setPassword(password);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		bean.setAddress(address);
		
		
		UserModel model= new UserModel();
		if(op.equals("add")) {
		try {
			model.add(bean);
		} catch (Exception e) {

			e.printStackTrace();
		}
		}
		
		if(op.equals("update")) {
			
			try {
				model.update(bean);
			bean =	model.findById(Integer.parseInt(id));
			req.setAttribute("msg","user update success....");
			req.setAttribute("bean",bean);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		//resp.setContentType("text/html");
		
		//PrintWriter out = resp.getWriter();
		
		//out.write("<h1>Hello shivanshi....how are you???</h1>");
		
		//out.close();
		}
		
		RequestDispatcher rd= req.getRequestDispatcher("UserView.jsp");
		rd.forward(req, resp);
	}

}
