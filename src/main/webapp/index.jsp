<%@ page language="java" %>
<html>
<head>
    <title>Session Input</title>
</head>
<body>

<h2>Session Management</h2>

<form action="welcome.jsp" method="post">
    
    Enter Name:
    <input type="text" name="uname" required>
    <br><br>

    Enter Session Expiry Time (in seconds):
    <input type="number" name="time" required>
    <br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>