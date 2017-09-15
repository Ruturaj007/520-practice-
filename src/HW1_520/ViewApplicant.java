package HW1_520;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewApplicant")
public class ViewApplicant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewApplicant() {
        super();
    }
    public void init(ServletConfig config) throws ServletException 
  	{
  		super.init(config);
  		ArrayList<APM> entries1=new ArrayList<APM>();
  		entries1.add(new APM("JOHN DOE","PHD in computer science","UCLA",2014));
  		entries1.add(new APM("JOHN DOE","MS in computer science","UCLA",2014));
  		entries1.add(new APM("JOHN DOE","BS in computer science","CSULA",2014));
  		entries1.add(new APM("JANE DOE","MS in computer science","UCLA",2014));
  		//Collections.sort(entries);
  		getServletContext().setAttribute("entries1",entries1);
  	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*int id=-1;*/
		int id=-1;
		try {
			id=Integer.parseInt(request.getParameter("id"));
		}
		catch(Exception e) {
			response.sendRedirect("ViewApplicant");
			return;
		}
		ArrayList<AM> entries =  (ArrayList<AM>) getServletContext().getAttribute("entries");
		ArrayList<APM> entries1 =  (ArrayList<APM>) getServletContext().getAttribute("entries1");
		for(APM entry:entries1)
		{
			if(entry.getId() == id)
			{
				request.setAttribute("entry1", entry);
				break;
			}
		}
		request
		.getRequestDispatcher("/WEB-INF/ViewApplicant.jsp")
		.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
