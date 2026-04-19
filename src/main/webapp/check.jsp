<html>
<body>

<%
    String name = (String) session.getAttribute("username");

    if (name == null) {
%>
        <h2>Session Expired!</h2>
        <p>Please enter details again.</p>
        <a href="index.jsp">Go Back</a>
<%
    } else {
%>
        <h2>Hello <%= name %>!</h2>
        <p>Session is still active.</p>
        <a href="check.jsp">Check Again</a>
<%
    }
%>

</body>
</html>