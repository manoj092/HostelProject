<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hostal Managment</title>
</head>
<body bgcolor="pink">
<c:choose>
      <c:when test="${findlist.isEmpty()}">
      <%--  <c:set var="msg" value="no record found"/>
      <c:out value="${msg}"></c:out>
       --%>
       <tr  align="center">
       <td bgcolor="white">no record found</td>
       </tr>
          </c:when>
     <c:otherwise>    
      <table border="1" width="100%">
      <thead>
        <tr>
          <th>HOSTEL DETAIL ID</th>
          <th>TOTAL ROOM</th>
          <th>AVAILABLE ROOM</th>
          <th>BOOKED ROOM</th>
          <th>ROOM RATE</th>
          <th>ROOM TYPE</th>
        </tr>
      </thead>
      
      <tbody>
      <c:forEach items="${findlist}" var="count">
        <tr>   
          <td>${count.details.hostelDetailId}</td>
           <td>${count.details.totalRoom}</td>      	
          <td>${count.details.availableRoom}</td>  
          <td>${count.details.bookedRoom}</td>
          <td>${count.details.roomRate}</td>
          <td>${count.details.roomtype}</td>                             
     </tr>
      </c:forEach>
      
    </tbody>
      </table>
      </c:otherwise>
      </c:choose>
</body>
</html>