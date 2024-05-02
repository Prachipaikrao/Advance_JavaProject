

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head></head><body>");
		out.print("<lable> Enter Name to Delete </lable> <br> ");
		out.print("<form  action ='DeleteServlet' > <input type=\"text \" name=\"user\">");
		out.print("<input type='submit' value='go' > ");
		
		
		    out.print("</form>");
		    String user=request.getParameter("user");
		
	
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
			PreparedStatement stmt=con.prepareStatement("delete from registration where UserName=? ");
			
			
			
			stmt.setString(1,user);
			
			
			
			int i=stmt.executeUpdate();
			out.println(i+"records Deleted");
			
			out.print("successfull");
			
			
			
			
			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		

		
		out.close();
	}

}
