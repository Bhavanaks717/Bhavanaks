package com.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Step 1: Get input number
        int num = Integer.parseInt(request.getParameter("num"));

        boolean isPrime = true;

        // Step 2: Check prime logic
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Step 3: Display result
        out.println("<html><body>");

        if (isPrime) {
            out.println("<h2 style='color:green;'>" + num + " is a Prime Number</h2>");
        } else {
            out.println("<h2 style='color:red;'>" + num + " is NOT a Prime Number</h2>");
        }

        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}