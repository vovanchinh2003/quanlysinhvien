<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="khoaHocs" method="post"
		action="addkhoahoc">
		<table>
			<tr>
				<td>Ten Khoa Hoc:</td>
				<td><form:input path="tenKhoaHoc" /></td>
			</tr>
			<!-- Add more fields as needed -->
		</table>
		<input type="submit" value="Save" />
	</form:form>
</body>
</html>