

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MockServlet
 */
public class MockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String answer=request.getParameter("a1");
		String answer1=request.getParameter("a2");
		String answer2=request.getParameter("a3");
		int count=0;
		
		
         
	
		if(answer.equals("java database connectivity") )
			
		{
			out.print("<br>");
			out.println("Correct answer:" +answer);
			out.print(count++);
			out.print("<br>");
			
	
			 
			
		}
		else
		{
			out.println("not "+answer);
		}
    	
		if(answer1.equals("false") )
		{
			out.print("Correct answer" +answer1);
			count++;
			out.print("<br>");
	
			 
			
		}
		else
		{
			out.println("not "+answer1);
		}
		
		if(answer2.equals("10") )
		{
			out.print("Correct answer" +answer2);
			count++;
			out.print("<br>");
	
			 
			
		}
		else
		{
			out.println("not "+answer2);
		}
		
		
		
    	
    	

		
		
		out.print("Total Marks : "+count );
		
    	
    	out.print("<br>");    	   //out.print("<a href='MockServlet'>visit</a>"); send on result page
        //out.print("<a href='servlet2'>visit</a>"); 
		out.print("Please ADD Your Marks Here  ");	
		
		out.print("<form action='Marks.html'> ");
	    out.print("<input type='submit' value ='Send'>" );
	    out.print("</form>");
	}

}
