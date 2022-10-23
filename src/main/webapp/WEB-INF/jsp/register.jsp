<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html xmlns:th="http://www.thymeleaf.org">
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

            </div>
            <form action="/index/register" method="post" th:object="${User}">
                <input th:field="*{firstName}" type="text" id="firstName" class="fadeIn second" name="firstName" placeholder="نام">
                <input th:field="*{lastName}" type="text" id="lastName" class="fadeIn third" name="lastName" placeholder="نام خانوادگی">
                <input th:field="*{username}" type="text" id="username" required class="fadeIn fourth" name="username" placeholder="نام کاربری">
                <input th:field="*{password}" type="password" id="password" required class="fadeIn five" name="password" placeholder="رمز عبور">
                <input th:field="*{email}" type="email" id="email" pattern=".+@gmail\.com" size="30" required class="fadeIn sixth" name="email" placeholder="ایمیل">
                <input type="submit" class="fadeIn seventh" value="ثبت نام">
            </form>
            <div id="formFooter">
                <a class="underlineHover" href="">صفحه ورود</a>
            </div>
        </div>
    </div>
</body>
</html>
