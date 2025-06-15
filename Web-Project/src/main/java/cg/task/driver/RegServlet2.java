package cg.task.driver;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegServlet2
 */
@WebServlet("/Reg2")
public class RegServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet2() {
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
		
		
		String ph=request.getParameter("ph");
		String addr=request.getParameter("addr");
		
		// How to get a HtttpSession object
		//HttpSession getSession(boolean value)
		//HttpSession getSession()
		
		
		HttpSession session =request.getSession(true);
		
		// Binding data with session object
		ArrayList<String> a1=new ArrayList<>();
		a1.add(ph);
		a1.add(addr);
		
		//binding Arraylist object with session object
		// by the key name called sessionKey
		session.setAttribute("sessionKey", a1);
		
		RequestDispatcher rd=request.getRequestDispatcher("ThirdInput.html");
		rd.forward(request, response);
		
		
	}

}
