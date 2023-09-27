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

	<form action="savesinhvien" method="post" modelAttribute="sinhVien">
		<table>
			<tr>
				<td><label for="hoTen">Full Name:</label></td>
				<td><form:input path="sinhVien.hoTen" id="hoTen" /></td>
			</tr>
			<tr>
				<td><label for="ngaySinh">Date of Birth:</label></td>
				<td><form:input path="sinhVien.ngaySinh" id="ngaySinh" type="date" /></td>
			</tr>
			<tr>
				<td><label for="diaChiHienTai">Current Address:</label></td>
				<td><form:input path="sinhVien.diaChiHienTai" id="diaChiHienTai" /></td>
			</tr>
			<tr>
				<td><label for="cccd">ID Card Number:</label></td>
				<td><form:input path="sinhVien.cccd" id="cccd" /></td>
			</tr>
			<tr>
				<td><label for="gioiTinh">Gender:</label></td>
				<td><form:radiobutton path="sinhVien.gioiTinh" id="gioiTinhNam"
						value="Nam" /> Male <form:radiobutton path="sinhVien.gioiTinh"
						id="gioiTinhNu" value="Nu" /> Female</td>
			</tr>
			<tr>
				<td><label for="queQuan">Hometown:</label></td>
				<td><form:input path="sinhVien.queQuan" id="queQuan" /></td>
			</tr>
			<tr>
				<td><label for="khoaHoc">Select:</label></td>
				<td><form:select path="sinhVien.khoaHoc" id="khoaHoc">
						<form:option value="">Select Course</form:option>
						<c:forEach var="khoaHoc" items="${listKhoaHoc}">
							<form:option value="${khoaHoc.khoahoc_id}">${khoaHoc.khoahoc_id}</form:option>
						</c:forEach>
					</form:select></td>
			</tr>
		</table>
		<input type="submit" value="Create Student" />
	</form>
</body>
</html>
