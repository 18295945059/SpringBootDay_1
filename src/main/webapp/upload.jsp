<%@ page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<html>
<head>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload/u" method="post" enctype="multipart/form-data">
    <input type="file" name="upload"/> <br/>
    <input type="submit" value="上传文件">
</form>
</body>

</html>