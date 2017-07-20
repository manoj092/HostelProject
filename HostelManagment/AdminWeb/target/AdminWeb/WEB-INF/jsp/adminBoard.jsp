<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h1 align="center">Add New Hostels</h1>
	<form:form method="POST" action="dataInsert.do"
		modelAttribute="hostelInfo" autocomplete="off">
		<table align="center">
			<tr>
				<td>HOSTELNAME :</td>
				<td><form:input path="hostelName" size="35" maxlength="50" /></td>
			</tr>
			<tr>
				<td>HOSTELCITY :</td>
				<td><form:input path="hostelCity" size="35" maxlength="20" /></td>
			</tr>

			<tr>
				<td>HOSTELCATEGORY :</td>
				<td><form:select path="hostelCatagory"   >
						<form:option value="boys"></form:option>
						<form:option value="girls"></form:option>
					</form:select></td>
			</tr>


			<tr>
				<td>TOTALROOM :</td>
				<td><form:input path="details.totalRoom" size="35"
						maxlength="4" /></td>
			</tr>
			<tr>
				<td>BOOKEDROOM :</td>
				<td><form:input path="details.bookedRoom" size="35"
						maxlength="4" /></td>
			</tr>
			<tr>
				<td>AVAILABLEROOM :</td>
				<td><form:input path="details.availableRoom" size="35"
						maxlength="4" /></td>
			</tr>
			<tr>
				<td>ROOMRATE :</td>
				<td><form:input path="details.roomRate" size="35" maxlength="5" /></td>
			</tr>
			<tr>
				<td>ROOMTYPE :</td>
				<td><form:input path="details.roomtype" size="35"
						maxlength="10" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	<c:choose>
		<c:when test="${fatch.isEmpty()}">
			<%--  <c:set var="msg" value="no record found"/>
      <c:out value="${msg}"></c:out>
       --%>
			<tr align="center">
				<td bgcolor="white">no record found</td>
			</tr>
		</c:when>
		<c:otherwise>
			<table border="1" width="100%">
				<thead>
					<tr>
						<th>HOSTELID</th>
						<th>HOSTELNAME</th>
						<th>HOSTELCITY</th>
						<th>HOSTELCATEGORY</th>
						<th>EDIT</th>
						<th>UPDATE</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${fatch}" var="count">
						<tr>
							<td>${count.hostelInfoId}</td>
							<td><a href="${count.hostelName}">${count.hostelName}</a></td>
							<td>${count.hostelCity}</td>
							<td>${count.hostelCatagory}</td>
							<td><a href="editHostel/${count.hostelInfoId}.do">UPDATE</a></td>
							<td><a href="deletehostels/${count.hostelInfoId}.do">DELETE</a></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</body>
</html>