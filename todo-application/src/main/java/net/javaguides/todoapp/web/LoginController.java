/**
 * 
 */
package net.javaguides.todoapp.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.javaguides.todoapp.dao.LoginDao;
import net.javaguides.todoapp.model.LoginBean;
/**
 * Used to process HTTP request parameters and redirect to the appropriate JSP
 * page based on the login status. If login successfully validated with the
 * database then redirect to "todo/todo-list.jsp" page otherwise redirect to
 * login.jsp page.
 * 
 * @author sparshgarg
 *
 */
@WebServlet("/login")
public class LoginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login/login.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		authenticate(request, response);
	}
	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);
		try {
			if(loginDao.validate(loginBean)) {
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("todo/todo-list.jsp");
				requestDispatcher.forward(request, response);
			}
		} catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
