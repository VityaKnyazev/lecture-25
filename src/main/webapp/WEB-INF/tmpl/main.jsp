<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload your file</title>
</head>
<body>
	<form action="/files" method="POST" enctype="multipart/form-data">
		<input type="file" name="file" />
		<input type="submit" value="Отправить файл" />
	</form>
</body>
</html>