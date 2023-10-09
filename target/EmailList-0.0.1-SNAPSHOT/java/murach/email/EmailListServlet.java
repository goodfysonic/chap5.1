package java.murach.email;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import murach.business.User; 
import murach.data.UserDB;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
							HttpServletResponse response) 
							throws ServletException, IOException {
		String url= "/index.html";
		// get current action
		String action = request.getParameter ("action");
		if (action == null) {
			action = "join"; // default action
		}
		//perform action and set URL to appropriate page 
		if (action.equals("join")) { url = "/index.html"; // the "join" page

		} 
		else if (action.equals("add")) {
			//get parameters from the request 
			String firstName = request.getParameter ("firstName"); 
			byte[] bytes = firstName.getBytes("ISO-8859-1");
			firstName  = new String(bytes, "utf-8");
			String lastName = request.getParameter("lastName"); 
			bytes = lastName.getBytes("ISO-8859-1");
			lastName = new String(bytes, "utf-8");
			String email = request.getParameter("email");
			String dateOfBirth = request.getParameter("dateOfBirth");
			
			String[] yesValues = request.getParameterValues("yes");
			ArrayList<String> yesList = new ArrayList<>(Arrays.asList(yesValues));
			String how = request.getParameter("how");
			String contact = request.getParameter("contact");
			//store data in User object and save User object in db 
			User user = new User (firstName, lastName, email, dateOfBirth, how, yesList, contact); 
			session.setAttribute("user", user);
			UserDB.insert(user);
			//set User object in request object and set URL 
			request.setAttribute("user", user); 
			url = "/thanks.jsp"; // the "thanks" page
		}
		//forward request and response objects to specified URL 
		getServletContext() 
		.getRequestDispatcher (url)
		.forward (request, response);
		}
		@Override 
		protected void doGet(HttpServletRequest request, 
							HttpServletResponse response) 
							throws ServletException, IOException { 
			doPost (request, response); 
		}
}