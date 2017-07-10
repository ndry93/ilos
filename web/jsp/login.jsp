<%-- 
    Document   : template
    Created on : Sep 8, 2012, 8:41:43 PM
    Author     : Sudhanshu
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib prefix="h" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <sb:head/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Please Sign In</h3>
                        </div>
                        <div class="panel-body">
                            <h:form action="login" method="post" theme="bootstrap"> 
                                <h:textfield name="users.userName" label="Enter User Name" /><br>
                                <h:password name="users.password" label="Enter Password" /><br>
                                <h:submit value="Login" align="center" />
                            </h:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="${pageContext.request.contextPath}/vendor/metisMenu/metisMenu.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="${pageContext.request.contextPath}/vendor/raphael/raphael.min.js"></script>
        <script src="${pageContext.request.contextPath}/vendor/morrisjs/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/data/morris-data.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="${pageContext.request.contextPath}/dist/js/sb-admin-2.js"></script>
    </body>
</html>