

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ResumeServlet
 */
public class ResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		String skill1=request.getParameter("skill1");
		String skill2=request.getParameter("skill2");
		String skill3=request.getParameter("skill3");
		
		String skillLanguage1=request.getParameter("skillLanguage1");
		String skillLanguage2=request.getParameter("skillLanguage2");
		String skillLanguage13=request.getParameter("skillLanguage3");
		
		String LanguagesKnown1=request.getParameter("LanguagesKnown1");
		String LanguagesKnown2=request.getParameter("LanguagesKnown2");
		String LanguagesKnown3=request.getParameter("LanguagesKnown3");
		
		String Strength1 = request.getParameter("Strength1");
		String Strength2 = request.getParameter("Strength2");
		String Strength3 = request.getParameter("Strength3");
		
		
		String Weakness1 = request.getParameter("Weakness1");
		String Weakness2 = request.getParameter("Weakness2");
		String Weakness3 = request.getParameter("Weakness3");
		
		String LongTermGoal1 = request.getParameter("LongTermGoal1");
		String LongTermGoal2 = request.getParameter("LongTermGoal2");
		
		String ShortTermGoal1 = request.getParameter("ShortTermGoal1");
		String ShortTermGoal2 = request.getParameter("ShortTermGoal2");
		
		
		String Certification1 = request.getParameter("Certification1");
		String Certification2 = request.getParameter("Certification2");
		
		
		
		String edu =request.getParameter("edu");
		String edu1 =request.getParameter("edu1");
		String project1 =request.getParameter("project1");
		String project2 =request.getParameter("project2");
		String project3 =request.getParameter("project3");
		String Summary =request.getParameter("Summary");
		
		
		
		
		
		
		
		out.print("<html><head><style>.container {\r\n"
				+ "  display: flex;\r\n"
				+"font-size:20px;\r\n"
				+"margin-top:50px;\r\n"
				+"margin-left:100px;\r\n"
				+ "}.item {\r\n"
				+ "  background: skyblue;\r\n"
				+ "  flex-basis: 1000px;\r\n"
				+ "  height: 1000px;\r\n"
				+ "  margin: 5px;\r\n"
				+ "}</style></head><body>");
		out.print("<h1 style='text-align:center ;font-size:70px'> Resume </h1>");
		
		out.print("<div class=\"container\">");
		out.print("<div class='item'> <ul><li><b>Name:</b>"+Name+"</li><li><b>Email:</b>"+email+"</li><li><b>Phone:</b>"+phone+"</li> <hr><li><b>skill1:</b>"+skill1+"</li> <li><b>skill2:</b>"+skill2+"</li> <li><b>skill3:</b>"+skill3+"</li> <br><br><hr><li><b>skillLanguage1:</b>"+skillLanguage1+"</li> <li><b>skillLanguage2:</b>"+skillLanguage2+"</li> <br><br><hr> <li><b>LanguagesKnown:</b>"+LanguagesKnown1+"</li>  <li><b>LanguagesKnown2:</b>"+LanguagesKnown2+"</li>  <li><b>LanguagesKnown3:</b>"+LanguagesKnown3+"</li><br><br><hr> <li><b>Sumary:</b>"+Summary+"</li><li><br><hr></div>");
		out.print("<div class='item'><li><b>Eduction:</b>"+edu+"<br>"+"<li >"+edu1+"</li><br><br><hr></li><li><b>project1:</b>"+project1+"<br>"+"<li >"+project2+" <br>"+"<li >"+project3+"</li></li> <br><br><hr> <li><b>Strength:</b>"+Strength1+"<br>"+"<li >"+Strength2+"</li></li>  <br><br><hr>  <li><b> Weakness:</b>"+Weakness1+"<br>"+"<li >"+Weakness2+"</li></li>   <br><br><hr>   <li><b>LongTermGoal:</b>"+LongTermGoal1+"<br>"+"<li >"+LongTermGoal2+"</li></li>   <br><br><hr>  <li><b>ShortTermGoal:</b>"+ShortTermGoal1+"<br>"+"<li >"+ShortTermGoal2+"</li><br><br><hr></li>     <li><b>Certification:</b>"+Certification1+"<br>"+"<li >"+Certification2+"</li></li></div>");
		out.print("</div>");
		
	}

}
