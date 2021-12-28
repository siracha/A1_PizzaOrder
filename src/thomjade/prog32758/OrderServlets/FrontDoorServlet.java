package thomjade.prog32758.OrderServlets;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import thomjade.prog32758.Pizza.Customer;

/**
 * Servlet implementation class FrontDoorServlet
 */
@WebServlet("/FrontDoorServlet")
public class FrontDoorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontDoorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errors = "";
		String fname = request.getParameter("first");
		if(fname == null){errors += "please enter first name\n";}
		String lname = request.getParameter("last");
		if(lname == null){errors += "please enter last name\n";}
		String email = request.getParameter("email");
		if(email == null){errors += "please enter a valid email address\n";}
		String phone = request.getParameter("phone");
		if(phone == null){errors += "please enter a valid phone number\n";}
		String address = request.getParameter("address");
		if(address == null){errors += "please enter a valid address\n";}
		String trans = request.getParameter("trans");
		
		Customer newCustomer = new Customer(fname,lname,email,phone,address,trans);
		RequestDispatcher dispatcher;
		HttpSession sess = request.getSession();
		if(errors == "") {
			sess.setAttribute("customer", newCustomer);
			dispatcher = request.getRequestDispatcher("OrderPage.jsp");
			dispatcher.forward(request, response);
		}
		else{
			sess.setAttribute("errors", errors);
			dispatcher = request.getRequestDispatcher("ErrorPage.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
