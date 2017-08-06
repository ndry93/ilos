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
                                <label class="control-label" for="selectedDrHeader.areaId">Rute yang ditentukan</label>
                                <s:textfield id="areaId" name="selectedDrHeader.areaId" cssClass="form-control " value="%{selectedDrHeader.areaId}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6"> 
                                <label class="control-label" for="selectedDrHeader.deliveryDateStart">Tanggal Pengiriman</label>
                                <s:textfield id="deliveryDateStart" name="selectedDrHeader.deliveryDateStart" cssClass="form-control " value="%{selectedDrHeader.deliveryDateStart}" required="true"  readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-6"> 
                                <label class="control-label" for="kmPkg">KM Berdasarkan Paket</label>
                                <s:textfield id="kmPkg" name="kmPkg" cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6"> 
                                <label class="control-label" for="selectedDrHeader.rit">Ritase</label>
                                <s:textfield id="rit" name="selectedDrHeader.rit" cssClass="form-control " value="%{selectedDrHeader.rit}" required="true"  readonly="true"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-sm-5 col-sm-offset-1">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-6">
                                <label class="control-label" for="selectedDrHeader.deliveryDateStart">Jam Berangkat</label>
                                    <s:textfield id="deliveryDateStart" name="selectedDrHeader.deliveryDateStart" cssClass="form-control " value="%{selectedDrHeader.deliveryDateStart}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="control-label" for="selectedDrHeader.deliveryDateEnd">Jam Tiba di DC</label>
                                    <s:textfield id="deliveryDateEnd" name="selectedDrHeader.deliveryDateEnd" cssClass="form-control " value="%{selectedDrHeader.deliveryDateEnd}" required="true"  readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-6">
                                <label class="control-label" for="selectedDrHeader.kmStart">KM Awal</label>
                                    <s:textfield id="kmStart" name="selectedDrHeader.kmStart" cssClass="form-control " value="%{selectedDrHeader.kmStart}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="control-label" for="selectedDrHeader.kmEnd">KM Akhir</label>
                                    <s:textfield id="kmEnd" name="selectedDrHeader.kmEnd" cssClass="form-control " value="%{selectedDrHeader.kmEnd}" required="true"  readonly="true"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-6">
                                <label class="control-label" for="selectedDrHeader.kmTotal">Total KM Ril</label>
                                    <s:textfield id="kmTotal" name="selectedDrHeader.kmTotal" cssClass="form-control " value="%{selectedDrHeader.kmTotal}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="control-label" for="kmPkgTtl">Total KM Paket</label>
                                    <s:textfield id="kmPkgTtl" name="kmPkgTtl" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                    </form>  
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-12">
                    <table width="100%" class="table table-striped table-bordered table-hover small" id="report-line-tbl">
                        <thead>
                            <tr>
                                <th>Inisial Toko</th>
                                <th>Jam tiba di toko</th>
                                <th>KM tiba di toko</th>
                                <th>Jam berangkat dari toko</th>
                                <th>Keterangan</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="selectedDrHeader.drLineses" >
                            <tr>
                                <td>
                                    <s:property value="destinations.destCode" />
                                </td>
                                <td>
                                    <s:property value="arrivalDate" />
                                </td>
                                <td>
                                    <s:property value="arrivalKm" />
                                </td>
                                <td>
                                    <s:property value="leavingDate" />
                                </td>
                                <td>
                                    <s:property value="description" />
                                </td>
                            </tr>
                        </s:iterator>
                    </tbody>
                </table>
            </div>
            <br>
            <div class="row">
                <div class="col-sm-6">
                    <div class="form-group">
                        <label class="control-label" for="selectedDrHeader.deliveryDateStart">Delivery Start Date</label>
                        <s:textfield  id="deliveryDateStart" name="selectedDrHeader.deliveryDateStart" cssClass="form-control pull-right" value="%{selectedDrHeader.deliveryDateStart}" readonly="true" style="min-width:200px;"/>
                    </div>
                </div>
            </div>
            <br>
            <br>
            <br>
            <br>
            <br>
            <div class="row">
                <div class="col-sm-12">
                </div>
            </div>
        </div>
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/theme/vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/theme/vendor/bootstrap/js/bootstrap.min.js"></script>

    </body>
</html>
