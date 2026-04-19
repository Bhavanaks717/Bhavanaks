package com.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// ✅ Create or get existing session
		HttpSession session = request.getSession(true);

		// ✅ Set session timeout to 1 minute
		session.setMaxInactiveInterval(60);

		// ✅ Visit count logic
		Integer visitCount = (Integer) session.getAttribute("visitCount");

		if (visitCount == null) {
			visitCount = 1;
		} else {
			visitCount++;
		}

		session.setAttribute("visitCount", visitCount);

		// ✅ Display session info
		out.println("<html><body>");
		out.println("<h2>Session Tracking Information</h2>");

		out.println("<p><b>Session ID:</b> " + session.getId() + "</p>");
		out.println("<p><b>Session Creation Time:</b> "
				+ new Date(session.getCreationTime()) + "</p>");
		out.println("<p><b>Last Access Time:</b> "
				+ new Date(session.getLastAccessedTime()) + "</p>");
		out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");

		out.println("<br><a href='SessionServlet'>Refresh / Visit Again</a>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}