<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>
    <body >
        <table  width="100%" border="0" cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td height="100%" colspan="2" bg>
                    <tiles:insertAttribute name="header" />
                </td>
            </tr>
            <tr>
                <td width="100%" colspan="1">
                    <tiles:insertAttribute name="body" />
                </td>
            </tr>
            <tr>
                <td height="100%" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>