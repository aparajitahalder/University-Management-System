

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class data
 */
@WebServlet("/data")
public class data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
				String n1;
				String n2;
				String n3;
				String n4;
				String n5;
				String n6;
				String n7;
				String n8;
				String n9;
			    n9=request.getParameter("id");
				n1=request.getParameter("fname");
				n2=request.getParameter("lname");
				n3=request.getParameter("ftname");
				n4=request.getParameter("dob");
				n5=request.getParameter("gender");
				n6=request.getParameter("course");
				n7=request.getParameter("mail");
				n8=request.getParameter("phno");
				//out.println("Driver Connected ");
				try
				{
					
					
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver Connected ");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mu","root","root");
					
System.out.println("database Connected ");
					Statement stmt=con.createStatement();
					
					String sql="insert into name(regid,fname,lname,ftname,dob,gender,course,mail,phno)values('"+n9+"','"+n1+"','"+n2+"','"+n3+"','"+n4+"','"+n5+"','"+n6+"','"+n7+"','"+n8+"')";
					stmt.executeUpdate(sql);
					out.println("data inserted Connected ");
					out.println("<br><br>&nbsp; &nbsp; &nbsp;<h1>"+"Registration done"+" </h1>");
					
					}
				
				catch(SQLException e)
				{
					e.printStackTrace();
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}

