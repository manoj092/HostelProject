<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="gray">
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
          <th>HOSTELID</th>
          <th>HOSTELNAME</th>
          <th>HOSTELCITY</th>
          <th>HOSTELCATEGORY</th>
           </tr>
      </thead>
      
      <tbody>
      <c:forEach items="${findlist}" var="count">
        <tr>   
          <td>${count.hostelInfoId}</td>
          <td><a href="hostelDetails/${count.hostelInfoId}.do">${count.hostelName}</a></td>      	
          <td>${count.hostelCity}</td>  
          <td>${count.hostelCatagory}</td>            
     </tr>
      </c:forEach>
      
    </tbody>
      </table>
      </c:otherwise>
      </c:choose>
</body>
</html>