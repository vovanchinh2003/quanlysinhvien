<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit KhoaHoc</title>
</head>
<body>
	<h1>Edit KhoaHoc</h1>

	<form:form modelAttribute="khoaHoc" method="post" action="editkhoahoc">
		<table>
			<tr>
				<td>ID:</td>
				<td><form:input path="khoahoc_id" readonly="true" /></td>
			</tr>
			<tr>
				<td>Ten Khoa Hoc:</td>
				<td><form:input path="tenKhoaHoc" /></td>
			</tr>
			<!-- Add more fields as needed -->
		</table>
		<input type="submit" value="Save" />
		<a href="<c:url value='/khoahoc/listkhoahoc'">Cancel</a>
	</form:form>
</body>
</html>
