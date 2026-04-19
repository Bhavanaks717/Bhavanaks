<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Cookie Added</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int expiry = Integer.parseInt(request.getParameter("expiry"));

    // Create Cookie
    Cookie c = new Cookie(name, "ActiveUser");

    c.setMaxAge(expiry);   // expiry in seconds
    c.setDomain(domain);   // set domain

    response.addCookie(c);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Expiry Time:</b> <%= expiry %> seconds</p>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>