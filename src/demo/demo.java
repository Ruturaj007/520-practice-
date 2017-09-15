package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public demo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println("	<title>Counter</title>");
		out.println("	<meta charset=\"UTF-8\">");
		out.println("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">");
		//out.println("<link href='https://bootswatch.com/sandstone/bootstrap.min.css' rel='stylesheet' type='text/css' >");
		response.setIntHeader("Refresh",5);

		 
		        /*//System.out.println("2"); // 2 is the first prime number
		        int i = 1;
				
		        //long startTime = System.currentTimeMillis();
		        while(i < NTH_PRIME) {
		            bi = bi.add(TWO);
		            if (bi.isProbablePrime(80)) {
		                i++;
		                
		            }
		        }*/
				
		     // out.println("The " + NTH_PRIME + "th prime number is: " + bi);
		        

		        BigInteger randomOne = new BigInteger(1023, 80, new Random());
		        BigInteger randomTwo = new BigInteger(1026, 80, new Random());
		        System.out.println("randomOne= " + randomOne);
		        System.out.println("\nrandomTwo= " + randomTwo);
				
		        BigInteger product = randomOne.multiply(randomTwo);
		        System.out.println("\nproduct= " + product);
		        System.out.println(product.bitLength());
		        System.out.println(product.isProbablePrime(10));
		    
		
		out.println("		<h1>Refresh <small>header</small></h1>");
		out.println("<p>"+new java.util.Date()+"</p>");
		
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"container\">");
		
		out.println("	<div class=\"page-header\">");
		
		out.println("	</div>");
		   out.println("<table class='table table-bordered table-striped table-hover'>");
		    out.println("<tr><th>Index</th><th>Prime number</th></tr>");
		    
		  
		   /* while(!n.isProbablePrime(7))
		{
			idseed++;
			n=n.add(one);
			getServletContext().setAttribute("nn",n.toString(10));
			ArrayList<Random> nn=(ArrayList<Random>) getServletContext().getAttribute("nn");
			//int ii=Integer.parseInt((String) request.getAttribute("nn"));
			out.println("<tr><td>"+idseed+"</td><td>"+nn+"</td></tr>");
			//out.println(n.toString(10));
		}*/
		out.println("</table>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
