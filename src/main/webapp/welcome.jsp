<%@ page language="java" %>
<%
    String name = request.getParameter("uname");
    int time = Integer.parseInt(request.getParameter("time"));

    // Create session
    session.setAttribute("user", name);

    // Set session expiry
    session.setMaxInactiveInterval(time);
%>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<h2 style="color:green;">
    Hello <%= name %>, session has started.<br><br>

    Your name is stored in session.<br><br>

    Session expiry time is set to <%= time %> seconds.<br><br>

    Click the below link within time or wait to check expiry.
</h2>

<br>

<a href="second.jsp">Click Here to Check Session</a>

</body>
</html>