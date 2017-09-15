package HW1_520;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import HW1_520.AM;


@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Admin() 
    {
        super();
    }
    public void init(ServletConfig config) throws ServletException 
	{
		super.init(config);
		ArrayList<AM> entries=new ArrayList<AM>();
		entries.add(new AM("Instructor for CS320 in Fall 2015"));
		entries.add(new AM("Fulltime Tenure Track Position"));
		//Collections.sort(entries);
		
		getServletContext().setAttribute("entries",entries);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		 request.getRequestDispatcher( "/WEB-INF/Admin.jsp" ).forward(
		            request, response );
		//ArrayList<AM> entries = (ArrayList<AM>) this.getServletContext().getAttribute("entries");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
