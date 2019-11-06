<%@ page  pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false"  %>
<html>
<head>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/user/login">
    用户名 <input type="text" name="username" /> <br/>
    密码 <input type="password" name="password" /> <br/>
    <input type="submit" value="登录" />
</form>
</body>

</html>