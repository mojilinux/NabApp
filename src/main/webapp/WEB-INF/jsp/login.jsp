<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="webjars/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="webjars/bootstrap/js/bootstrap.min.js"></script>
    <link  rel="stylesheet" href="/css/login.css">
    <title>Title</title>
</head>
<body>
    <div class="wrapper fadeInDown">
        <div id="formContent">
            <div class="fadeIn first">
                <img src="" id="icon" alt="User Icon" />
            </div>
            <form method="get">
                <input type="text" id="username" class="fadeIn second" name="login" placeholder="نام کاربری">
                <input type="password" id="password" class="fadeIn third" name="login" placeholder="رمز عبور">
                <span style="visibility: hidden">${notValidCredential}</span>
                <input type="submit" class="fadeIn fourth" value="ورود">
            </form>
            <div id="formFooter">
                <a class="underlineHover" href="#">بازیابی رمز عبور</a>
            </div>
        </div>
    </div>
</body>
</html>
