package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/QueryStringCtl")
public class QueryStringCtl extends HttpServlet {
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	System.out.println("in QueryStringCtl do get....");
	String name = req.getParameter("name");
	
	
	
	
	System.out.println("name ="+ name);
}	

}
