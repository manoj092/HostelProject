<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1 align="center">Add New Hostels</h1>
       <form:form  method="POST"  action="saveEdithostels.do" modelAttribute="hostels" autocomplete="off">    
    
       
        <table align="center" >
        <tr>
         <td></td>    
         <td><form:hidden  path="hostelInfoId" /></td>  
         </tr>
             
         <tr>    
          <td>HOSTELNAME : </td>   
          <td><form:input path="hostelName"  size="35" maxlength="50"  /></td>  
         </tr>    
         <tr>    
          <td>HOSTELCITY :</td>    
          <td><form:input path="hostelCity" size="35" maxlength="20" /></td>  
         </tr>   
          
         <tr>    
          <td>HOSTELCATEGORY :</td>    
          <td><form:input path="hostelCatagory" size="35" maxlength="5" /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td align="center"><input type="submit"  value="update" /></td>    
         </tr> 
         
        </table>    

       </form:form>
       <c:choose>
      <c:when test="${Lists.isEmpty()}">
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
        <h1>UPDATE VALUE</h1>
        <tr>
          <th>HOSTELID</th>
          <th>HOSTELNAME</th>
          <th>HOSTELCITY</th>
          <th>HOSTELCATEGORY</th>
        </tr>
      </thead>
      
      <tbody>
      <c:forEach items="${Lists}" var="count">
        <tr>   
          <td>${count.hostelInfoId}</td>
          <td>${count.hostelName}</td>      	
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