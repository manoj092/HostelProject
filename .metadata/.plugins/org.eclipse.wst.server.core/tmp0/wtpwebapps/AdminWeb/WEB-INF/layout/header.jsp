<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<style>
div.container {
    width: 100%;
    border: 1px solid gray;
}

header, footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}

nav {
    float: left;
    max-width: 160px;
    margin: 0;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
</style>
</head>
<body>

<div class="container">

<header>
   <h1>Hostel Management</h1>

</div>

<c:choose>
<c:when test="${sessionScope.USER!=null }">
<div style="background:#EDGHY&; height:60px; padding:5px; width:100;">
<div style="float:left"></div>
<h1>welcome  <c:out value="${sessionScope.USER.emailId}"/></h1>
<div style="float:right; height:50px; padding:5px; width:100; text-align:right;">
Search<input name="search">
<div style="float:right; height:50px; padding:5px; width:100;text-align:right;">

<a href="logout.do">User Logout</a>
</div>
</div>
</c:when>
</c:choose>
</header>
</body>
</html>
