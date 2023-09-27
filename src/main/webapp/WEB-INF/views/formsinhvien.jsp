<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta charset="UTF-8">
<title>Create Student</title>
</head>
<body>
	<h2>Create Student</h2>

	<form:form action="savesinhvien" method="post"
		modelAttribute="sinhVien">
		<label for="hoTen">Full Name:</label>
		<form:input path="hoTen" id="hoTen" />

		<label for="ngaySinh">Date of Birth:</label>
		<form:input path="ngaySinh" id="ngaySinh" type="date"  />

		<label for="diaChiHienTai">Current Address:</label>
		<form:input path="diaChiHienTai" id="diaChiHienTai"  />

		<label for="cccd">ID Card Number:</label>
		<form:input path="cccd" id="cccd" />

		<label for="gioiTinh">Gender:</label>
		<form:radiobutton path="gioiTinh" id="gioiTinhNam" value="Nam" /> Male
        <form:radiobutton path="gioiTinh" id="gioiTinhNu" value="Nu" /> Female
        
		<label for="queQuan">Hometown:</label>
		<form:input path="queQuan" id="queQuan" />

		<label for="khoaHoc">Select:</label>
		<form:select path="khoaHoc" id="khoaHoc">
			<form:option value="">Select Course</form:option>
			<c:forEach var="khoaHoc" items="${listKhoaHoc}">
				<form:option value="${khoaHoc.khoahoc_id}">${khoaHoc.khoahoc_id}</form:option>
			</c:forEach>
		</form:select>
		<input type="submit" value="Create Student" />
	</form:form>
</body>
</html>