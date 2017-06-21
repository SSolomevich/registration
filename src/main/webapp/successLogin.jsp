<%--
  Created by IntelliJ IDEA.
  User: 15
  Date: 01.04.2017
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Страница успешного входа в систему</title>
</head>
<body>

<br>
<h1>Вход посетителя в систему прошел успешно</h1>
<jsp:useBean id="user" class="ru.registration.model.User" scope="application"/>
Пользователь: <%= user.getUser()%><br>
Email: <%= user.getEmail()%><br>
Адрес: <%= user.getAddress()%><br>
Телефон: <%= user.getPhone()%><br>
</body>
</html>
