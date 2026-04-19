<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie cookies[] = request.getCookies();

    if(cookies != null){
        for(int i = 0; i < cookies.length; i++){
%>
            <p>
                <b>Name:</b> <%= cookies[i].getName() %> <br>
                <b>Value:</b> <%= cookies[i].getValue() %>
            </p>
            <hr>
<%
        }
    } else {
%>
        <p>No active cookies found.</p>
<%
    }
%>

</body>
</html>