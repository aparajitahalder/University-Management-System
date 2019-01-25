

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/one")
public class one extends HttpServlet {
	String u,p;
	private static final long serialVersionUID = 1L;
       
    /**
     * @return 
     * @see HttpServlet#HttpServlet()
     */
    public  one() {
        super();
        // TODO Auto-generated constructor stub
    }

		/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname,pass;
		 int flag = 0;
		try
		{
			
			
		    Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eod","root","root"); //database name: eod
			Statement stmt=con.createStatement();
			uname=request.getParameter("uname"); //getting username from Login JSP page
			pass=request.getParameter("password"); //getting password from Login JSP page
			String s="select username,password from register"; // retrieving username and password from table register
			ResultSet rs=(ResultSet) stmt.executeQuery(s);
            while(rs.next())
			{
				u=rs.getString(1);
				p=rs.getString(2);
				if(u.equals(uname)&& p.equals(pass)) //if password is correct, going to flag==1
				{
					
					flag=1;
					break;

					
				}
				else
				{
					flag=0;		
					}
				}
				
			
			if(flag==1)
			{
				
				RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");   // If username and password are correct, redirect to second page
				rd.forward(request, response); 
				
				
				}
			else
			{
				
RequestDispatcher rd=request.getRequestDispatcher("/management.jsp");  // if username and password are wrong, it will be in same page
				
				rd.include(request, response);
				out.println("<font color='red'>Invalid username or password</font>");
			}
		}
			catch(SQLException e1)
			{
				e1.printStackTrace();
				
			} 
		
		    catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}

}

