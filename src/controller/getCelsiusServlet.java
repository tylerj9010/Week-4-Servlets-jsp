package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DegreesConverter;

/**
 * Servlet implementation class getCelsiusServlet
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userDegreeAmount = request.getParameter("userDegreeAmount");
		DegreesConverter userDegrees = new DegreesConverter("CELSIUS", Double.parseDouble(userDegreeAmount));
		
		request.setAttribute("userCalc", userDegrees);
		getServletContext().getRequestDispatcher("/resultcelsius.jsp").forward(request, response);
	}

}
