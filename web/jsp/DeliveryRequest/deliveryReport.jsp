<%-- 
    Document   : DeliveryReport
    Created on : Jul 26, 2017, 10:37:23 PM
    Author     : ndry93
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
        <title>Delivery Report</title>
        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/theme/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/theme/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <br>
            <div class="row">
                <div class="col-sm-11"></div>
                <div class="col-sm-1"><button>Print</button></div>
            </div>
            <div class="row">
                <div class="col-sm-8"><h3>Laporan Pengiriman</h3><b>27 Juli 2017</b></div>
                <div class="col-sm-4"></div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-6"> 
                                <label class="control-label" for="namaSupir">Nama Supir</label>
                                <s:textfield id="transactionNum" name="selectedDrHeader.driverName" cssClass="form-control " value="%{selectedDrHeader.driverName}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6"> 
                                <label class="control-label" for="noPol">No. Polisi</label>
                                <s:textfield id="transactionNum" name="selectedDrHeader.policeNo" cssClass="form-control " value="%{selectedDrHeader.policeNo}" required="true"  readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            
                            <div class="col-sm-6"> 
                                <label class="control-label" for="noPol">Rute yang ditentukan</label>
                                <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                            <div class="col-sm-6"> 
                                <label class="control-label" for="noPol">Tanggal Pengiriman</label>
                                <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-6"> 
                                <label class="control-label" for="noPol">KM Berdasarkan Paket</label>
                                <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                            <div class="col-sm-6"> 
                                <label class="control-label" for="ritase">Ritase</label>
                                <s:textfield id="ritase" name="ritase" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-sm-5 col-sm-offset-1">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-6">
                                <label class="control-label" for="noPol">Jam Berangkat</label>
                                    <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="control-label" for="noPol">Jam Tiba di DC</label>
                                    <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-6">
                                <label class="control-label" for="noPol">KM Awal</label>
                                    <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="control-label" for="noPol">KM Akhir</label>
                                    <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-6">
                                <label class="control-label" for="noPol">Total KM Ril</label>
                                    <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="control-label" for="noPol">Total KM Paket</label>
                                    <s:textfield id="noPol" name="noPol" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                    </form>
                    
                </div>
            </div>
        </div>
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/theme/vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/vendor/bootstrap/js/bootstrap.min.js"></script>

    </body>
</html>
