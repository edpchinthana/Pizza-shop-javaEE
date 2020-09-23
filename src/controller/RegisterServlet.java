package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private final UserDAO userDAO = new UserDAOImpl();
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
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
		User user = new User();
		String displayName = request.getParameter("displayName").toString();
		String emailAddress = request.getParameter("emailAddress").toString();
		String password1 = request.getParameter("password1").toString();
		String password2 = request.getParameter("password2").toString();

		if(password1.equals(password2)) {
			user.setDisplayName(displayName);
			user.setEmailAddress(emailAddress);
			user.setPassword(password1);
			try {
				if(userDAO.register(user)) {
					 response.sendRedirect("/pizzaShop/");
				}else {
					request.setAttribute("er", "error happend");
					response.sendRedirect("/pizzaShop/register.jsp");
				}
			} catch (SQLException | ClassNotFoundException e) {
				request.setAttribute("er", "error happend");
				response.sendRedirect("/pizzaShop/register.jsp");
				e.printStackTrace();
			}
		}else {
		    response.setContentType("text/html");
			request.setAttribute("er", "Passwords did not match");
		    //request.getRequestDispatcher("/pizzaShop/register.jsp").forward(request, response);

			response.sendRedirect("/pizzaShop/register.jsp");
		}

		//doGet(request, response);
	}

}
