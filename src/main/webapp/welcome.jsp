<%@ page import="java.util.*" %>
<html>
<body>

<%
    String name = request.getParameter("uname");

    // Create session
    session.setAttribute("username", name);

    // Set session expiry = 60 seconds
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>

<p>Your session has started.</p>
<p>Session will expire in 1 minute.</p>

<a href="check.jsp">Click here to check session</a>

</body>
</html>