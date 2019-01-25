import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class disp
 */
@WebServlet("/disp")
public class disp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public disp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
				
		ResultSet rs;
		try{
			Class.forName("com.mysql.jdbc.Driver");
						Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mu","root","root");
						Statement stmt=(Statement) con.createStatement();
		rs = (ResultSet) stmt.executeQuery("Select * from name");
		out.print("<table width=25% border=1><center>");
		out.println("<tr>");
		out.println("&nbsp; &nbsp; &nbsp; <td>REGID </td>" +" <td>First Name </td>" +"<td> Last Name</td>" +"<td> Father's Name</td>" +"<td>DOB </td>" +"<td> Gender</td>" +"<td> Course</td>" +"<td> Mail</td>" +"<td> Phone No.</td>" +"<br>");
		out.println("</tr>");
		while(rs.next())
		{
			out.println("&nbsp; &nbsp; &nbsp;<tr>");
		out.println("<td>"+ rs.getString(9)+"</td><td> "+rs.getString(1)+" </td><td>"+rs.getString(2) + "</td><td> " + rs.getString(3)+"</td><td> " + rs.getString(4)+"</td><td> " + rs.getString(5)+"</td><td> " + rs.getString(6)+"</td><td> " + rs.getString(7)+"</td><td> " + rs.getString(8)+"</td><td> " +   "<br>");
		out.println("</tr>");
		}
		out.println("</table>");
		}
		catch (Exception e){
		out.println(e);
		}
		}
		}