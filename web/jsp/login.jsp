<%-- 
    Document   : template
    Created on : Sep 8, 2012, 8:41:43 PM
    Author     : Sudhanshu
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Login</title>

        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}/theme/dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/theme/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
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
                            <s:form action="login" method="post" validate="true"> 
                                <div class="form-group input-group">
                                    <span class="input-group-addon"><i class="fa fa-user"></i>
                                    </span>
                                    <s:textfield name="users.userName" label="Enter User Name" cssClass="form-control" placeholder="Username" />
                                </div>
                                <div class="form-group input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock"></i>
                                    </span>
                                    <s:password name="users.password" label="Enter Password" cssClass="form-control" placeholder="Password" />
                                </div>
                                <s:actionerror cssClass="alert alert-warning"/>
                                <s:submit validate="true" value="Login" align="center" cssClass="btn btn-lg btn-primary btn-block"  />
                            </s:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/theme/vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/vendor/metisMenu/metisMenu.min.js"></script>

        <!-- Morris Charts JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/vendor/raphael/raphael.min.js"></script>
        <script src="${pageContext.request.contextPath}/theme/vendor/morrisjs/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/theme/data/morris-data.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/dist/js/sb-admin-2.js"></script>
    </body>
</html>