<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách Sinh Viên</title>
</head>
<body>
	<a href="showformsinhvien">add</a>
	<h1>Danh sách Sinh Viên</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Họ Tên</th>
				<th>Ngày Sinh</th>
				<th>Địa Chỉ Hiện Tại</th>
				<th>CCCD</th>
				<th>Giới Tính</th>
				<th>Quê Quán</th>
				<th>Khoahoc_id</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sinhViens}" var="sinhVien">
				<tr>
					<td><c:out value="${sinhVien.sinhvien_id}" /></td>
					<td><c:out value="${sinhVien.hoTen}" /></td>
					<td><c:out value="${sinhVien.ngaySinh}" /></td>
					<td><c:out value="${sinhVien.diaChiHienTai}" /></td>
					<td><c:out value="${sinhVien.cccd}" /></td>
					<td><c:out value="${sinhVien.gioiTinh}" /></td>
					<td><c:out value="${sinhVien.queQuan}" /></td>
					<td><c:out value="${sinhVien.khoaHoc.khoahoc_id}" /></td>
					<td><a href="delete?sinhvienId=${sinhVien.sinhvien_id}">Delete</a>
						<a href="updatekhoahoc?sinhvienId=${sinhVien.sinhvien_id}">update</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
