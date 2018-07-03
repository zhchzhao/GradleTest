package main.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GradleTest extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GradleTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Story 1700864
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// ((HttpServletRequest)
		// request).getRequestDispatcher("/software/ram/akamai/sureroute-test-object.html").forward(((HttpServletRequest)
		// request), ((HttpServletResponse) response));

		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("*****************test servlet by Gradle build******************");
		out.println("<p/>**********  "+request.getParameter("userName")+"    "+request.getParameter("passWord")+"  ***********");
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("*****************:doPost");
		doGet(request, response);
	}

	public static void main(String[] args) {
		System.out.println("111111111111111111111111111111111111111");
	}
}
