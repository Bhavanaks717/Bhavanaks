<html>
<head>
    <title>Cookie Management</title>
</head>
<body>
    <h2>Enter Cookie Details</h2>

    <form action="addCookie.jsp" method="post">
        Name: <input type="text" name="name" required><br><br>
        Domain: <input type="text" name="domain" required><br><br>
        Expiry Time (in seconds): <input type="number" name="expiry" required><br><br>

        <input type="submit" value="Add Cookie">
    </form>
</body>
</html>