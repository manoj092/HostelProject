<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
.vertical-menu {
    width: 100%;
}

.vertical-menu a {
    background-color: #eee;
    color: black;
    display: block;
    padding: 12px;
    text-decoration: none;
}

.vertical-menu a:hover {
    background-color: #ccc;
}

.vertical-menu a.active {
    background-color: gray;
    color: yellow;
}
</style>
<body>

<h1>Menus</h1>

<div class="vertical-menu">
  <a href="Deshboard.do" class="active">Home</a>
  <a href="hostels.do">all hostels</a>
  <a href="hostelsboys.do">Boys Hostels</a>
  <a href="hostelsgirls.do">Girls Hostels</a>
</div>

</body>