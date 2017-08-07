<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}/theme/dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Morris Charts CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/morrisjs/morris.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/theme/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- DataTables CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

        <!-- DataTables Responsive CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">
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

        <!-- DataTables JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/vendor/datatables/js/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/theme/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/theme/vendor/datatables-responsive/dataTables.responsive.js"></script>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
<script type="text/javascript"
     src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
    </script>
        <title><t:getAsString name="title"/></title>
    </head>
    <body>
        <div id="wrapper">

            <!-- Header -->
            <t:insertAttribute name="header"/>
            <!-- Body -->
            <t:insertAttribute name="body"/>
            <!-- Footer -->
            <%--<t:insertAttribute name="footer"/>--%>
        </div>
    </body>
</html>