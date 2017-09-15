package HW1_520;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddApplicant")
public class AddApplicant extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	int idSeed=100;
	
    public AddApplicant() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 request.getRequestDispatcher( "/WEB-INF/AddApplicant.jsp" ).forward(
		            request, response );
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ArrayList<AM> entries=(ArrayList<AM>) getServletContext().getAttribute("entries");
		ArrayList<APM> entries1=(ArrayList<APM>) getServletContext().getAttribute("entries1");
		String job=request.getParameter("job");
		String name=request.getParameter("name");
		String degree=request.getParameter("degree");
		String uni=request.getParameter("uni");
		Integer year = Integer.valueOf( request.getParameter( "year" ) );
		//int year=Integer.parseInt(request.getParameter("year"));
		
	}

}
