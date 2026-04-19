<%@ page import="java.util.*" %>
<html>
<body>

<%
    String name = request.getParameter("uname");
    int time = Integer.parseInt(request.getParameter("time"));

    // Create session
    session.setAttribute("username", name);

    // Set session expiry (user given time)
    session.setMaxInactiveInterval(time);
%>

<h2>Hello <%= name %>!</h2>

<p>Your session has started.</p>
<p>Session expiry time: <%= time %> seconds</p>

<p>
Click the link below to check session within time 
or wait to see expiry:
</p>

<a href="check.jsp">Check Session</a>

</body>
</html>