package cg.task.driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegServlet3
 */
@WebServlet("/Reg3")
public class RegServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet3() {
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
		
		// Reading all inputs from HTML element
		String pan=request.getParameter("p1");
		String aadh=request.getParameter("aad");
		
		// getting the object of PrintWriter
		PrintWriter writer=response.getWriter();
		
		
		// reading cookie info
		// Cookie[] getCookies() is the method of HttpServletRequest interface
		Cookie[] cks=request.getCookies();
		String fname=null;
		String lastName=null;
		for(Cookie ck: cks) {
			String keyName=ck.getName();
			if(keyName.equals("fkey")) {
				fname=ck.getValue();
			}
			else {
				lastName=ck.getValue();
			}
		}
		
		writer.print(fname+" "+lastName+"<br>");
		response.setContentType("text/html");
		HttpSession oldSession=request.getSession(false);
		ArrayList<String> list=(ArrayList<String>)oldSession.getAttribute("sessionKey");
		
		String phone=list.get(0);
		String addr=list.get(1);
		writer.print(phone+" "+addr+"<br>");
		response.setContentType("text/html");
		writer.print(pan+" "+aadh+"<br>");
	}

}
