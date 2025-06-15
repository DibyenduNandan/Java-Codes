package cg.task.driver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/Reg1")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
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
		
//		Reading inputs from HTML element
		String fname=request.getParameter("t1");
		String lname=request.getParameter("t2");
		
		//Creating object of cookie
		Cookie ck1=new Cookie("fkey", fname);
		Cookie ck2=new Cookie("lkey", lname);
		
		// setting age of Cookie in seconds
		ck1.setMaxAge(60*60*24);
		ck2.setMaxAge(60*60*24);
//		ck2.setMaxAge(-45000);
		
		// set cookie objects with response header
		// void addCookie(Cookie ck) -- HttpservletResponse
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		//we can use the request Dispatcher
		/*
		 * 
		 * RequestDispatcher is an interface which resides inside javax.servlet.RequestDispatcher
		 * ResquestDispatcher provides two methods
		 * 
		 * i) forword(HttpServletRequest request, HttpServletResponse response)
		 * ii)include(HttpServletRequest request, HttpServletResponse response)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		PrintWriter pw=response.getWriter();
		pw.print("<center><h2><font color='blue'>"+" "+fname+" "+lname+" "+"</font></h2></center>");
		
		response.setContentType("text/html");
		
		RequestDispatcher rd=request.getRequestDispatcher("SecondInput.html");
		rd.include(request, response);
	}

}
