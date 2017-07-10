<%-- 
    Document   : login.jsp
    Created on : Jul 3, 2017, 12:07:18 PM
    Author     : S
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="h" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <sb:head/>
    </head>
    <body>
        <h:form action="login" method="post" theme="bootstrap"> 
            <h:textfield name="users.userName" label="Enter User Name" /><br>
            <h:password name="users.password" label="Enter Password" /><br>
            <h:submit value="Login" align="center" />
        </h:form>
    </body>
</html>

