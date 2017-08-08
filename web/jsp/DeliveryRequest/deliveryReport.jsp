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
<html moznomarginboxes mozdisallowselectionprint>
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
        <style>
            @media print
            {
                .noPrint{
                    display:none;
                }
                @page {
                    size:auto;
                    margin:0;
                }
            }
        </style>
    </head>
    <body>
        <div class="container">
            <div class="row noPrint">
                <div class="col-sm-11"></div>
                <div class="col-sm-1"><button onclick="window.print();">Print</button></div>
            </div>
            <div class="row">
                <div class="col-sm-8">
                    <h3><u>Laporan Pengiriman</u></h3>
                    <b>
                       <s:property value="%{selectedDrHeader.deliveryDateStart}" />
                    </b>
                </div>
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
                                <label class="control-label" for="selectedDrHeader.areaId"><br>Rute yang ditentukan</label>
                                <s:textfield id="areaId" name="selectedDrHeader.areaId" cssClass="form-control " value="%{selectedDrHeader.areaId}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-6"> 
                                <label class="control-label" for="kmPkg"><br>KM Berdasarkan Paket</label>
                                <s:textfield id="kmPkg" name="kmPkg" cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <div class="col-sm-6"> 
                                <label class="control-label" for="selectedDrHeader.rit">Ritase</label>
                                <s:textfield id="rit" name="selectedDrHeader.rit" cssClass="form-control " value="%{selectedDrHeader.rit}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-3">
                                <label class="control-label" for="selectedDrHeader.kmStart">KM Awal</label>
                                    <s:textfield id="kmStart" name="selectedDrHeader.kmStart" cssClass="form-control " value="%{selectedDrHeader.kmStart}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-3">
                                <label class="control-label" for="selectedDrHeader.kmEnd">KM Akhir</label>
                                    <s:textfield id="kmEnd" name="selectedDrHeader.kmEnd" cssClass="form-control " value="%{selectedDrHeader.kmEnd}" required="true"  readonly="true"/>
                            </div>
                            
                        </div>
                        <div class="form-group">
                            <div class="col-sm-3">
                                <label class="control-label" for="selectedDrHeader.deliveryDateStart">Jam Berangkat</label>
                                    <s:textfield id="deliveryDateStart" name="selectedDrHeader.deliveryDateStart" cssClass="form-control " value="%{selectedDrHeader.deliveryDateStart}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-3">
                                <label class="control-label" for="selectedDrHeader.deliveryDateEnd">Jam Tiba di DC</label>
                                    <s:textfield id="deliveryDateEnd" name="selectedDrHeader.deliveryDateEnd" cssClass="form-control " value="%{selectedDrHeader.deliveryDateEnd}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-3">
                                <label class="control-label" for="selectedDrHeader.kmTotal">Total KM Ril</label>
                                    <s:textfield id="kmTotal" name="selectedDrHeader.kmTotal" cssClass="form-control " value="%{selectedDrHeader.kmTotal}" required="true"  readonly="true"/>
                            </div>
                            <div class="col-sm-3">
                                <label class="control-label" for="kmPkgTtl">Total KM Paket</label>
                                    <s:textfield id="kmPkgTtl" name="kmPkgTtl" cssClass="form-control" readonly="true"/>
                            </div>
                        </div>
                    </form>  
                </div>
            </div>
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
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="control-label col-xs-6">Uang yang diberikan</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangDiberikanTotal"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-sm-6">
                    <b><u>Catatan:</u></b>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <b><u>Rincian Pemakaian</u></b>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="control-label col-xs-6">Uang solar</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangSolar"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Tol</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangTol"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Parkir</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangParkir"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Pak Ogah</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangPakOgah"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Retribusi</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangRetribusi"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            
                        </div>
                    </form>
                </div> 
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="control-label col-xs-6">Uang Makan</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangMakan"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Insentif Rit-3</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangInsentifRit3"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Insentif Pagi</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangInsentifPagi"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Lain-lain</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangLainLain"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>     
            <div class="row">
                <div class="col-sm-6">
                    <form class="form-horizontal">
                        <div class="form-group">
                            <label class="control-label col-xs-6">Total Pemakaian</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangTerpakaiTotal"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Sisa</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangSisa"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                            <label class="control-label col-xs-6">Kasbon</label>
                            <div class="col-xs-6">
                                <s:textfield id="uangKasbon"  cssClass="form-control " value="" required="true"  readonly="true"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <form class="form-horizontal">
                    <table width="100%" class="table table-striped table-bordered table-hover small" id="report-line-tbl">
                        <thead>
                            <tr>
                                <th>Kasir</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><br><br><br><br></td>
                            </tr>
                        </tbody>
                    </table>
                    </form>
                </div>
                <div class="col-sm-4">
                </div>
                <div class="col-sm-4">
                    <form class="form-horizontal">
                    <table width="100%" class="table table-striped table-bordered table-hover small" id="report-line-tbl">
                        <thead>
                            <tr>
                                <th>Supir</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><br><br><br><br></td>
                            </tr>
                        </tbody>
                    </table>
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
