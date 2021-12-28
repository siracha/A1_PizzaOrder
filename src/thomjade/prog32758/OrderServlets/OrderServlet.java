package thomjade.prog32758.OrderServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import thomjade.prog32758.Pizza.*;

/**
 * Servlet implementation class OrderServlet
 */
@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] toppings = request.getParameterValues("toppings");
		String size = request.getParameter("size");
		Order order = new Order();
		HttpSession  session = request.getSession();
		
		Pizza newPizza = new Pizza(toppings,size);
		order.addPizza(newPizza);
		session.setAttribute("cart", order);
		
		RequestDispatcher dispatcher;
		if(request.getParameter("add") != null) {
			dispatcher = request.getRequestDispatcher("OrderPage.jsp");
			dispatcher.forward(request,response);
		}
		if(request.getParameter("checkout") != null) {
			dispatcher = request.getRequestDispatcher("Receipt.jsp");
			dispatcher.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
