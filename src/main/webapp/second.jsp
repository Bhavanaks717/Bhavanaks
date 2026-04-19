<%@ page language="java" %>
<%
    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Session Check</title>
</head>
<body>

<%
    if (user != null) {
%>
        <h2 style="color:blue;">
            Session Active! Hello <%= user %>
        </h2>
<%
    } else {
%>
        <h2 style="color:red;">
            Session Expired!
        </h2>
<%
    }
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>