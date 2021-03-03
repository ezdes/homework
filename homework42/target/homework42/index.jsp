<html>
<body>

<form action="register" method="post">
    <label>Login: <br><br>
        <input type="text" name="login" minlength="3" required>
    </label>
    <br><br>
    <label>Password: <br><br>
        <input type="password" name="password" minlength="6" required>
    </label>
    <br><br>
    <label>Email: <br><br>
        <input type="text" name="email" minlength="3" required>
    </label>
    <br><br>
    Gender:
    <br><br>
    <label>Male:
        <input type="radio" value="Male" name="gender" required>
    </label>
    <br><br>
    <label>Female:
        <input type="radio" value="Female" name="gender" required>
    </label>
    <br><br>
    <input type="Submit" value="submit">
</form>
</body>
</html>
