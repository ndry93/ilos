<%-- 
    Document   : drSummary
    Created on : Jul 15, 2017, 4:25:41 PM
    Author     : Hana
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Destination</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <!-- Default panel contents -->
                <div class="panel-heading">
                    &nbsp;
                    <div class="pull-left">
                        <h3 class="panel-title" id="actionTitle">Summary Details</h3>
                    </div>
                    <div class="pull-right">
                        <a href="#" id="btnDeleteDrHeader" class="btn-sm btn-danger"><i class="fa fa-trash" data-toggle="modal" data-target="#DeleteDrHeaderModal"></i> <strong>Delete</strong></a>
                        <a href="#" id="btnEditDrHeader" class="btn-sm btn-success"><i class="fa fa-edit"></i> <strong>Edit</strong></a>
                        <a href="#" id="btnSaveDrHeader" class="btn-sm btn-primary"><i class="fa fa-save"></i> <strong>Save</strong></a>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <s:hidden name="actionName" id="actionName" value="%{actionName}" />
                        <s:form id="FormDrLine" action="" method="post" validate="true" cssClass="form-inline" > 
                            <div class="col-lg-12">
                                <s:actionerror cssClass="alert alert-warning"/>
                                <div class="form-group">
                                    <label class="control-label col-md-4" for="driverName">Driver Name</label>
                                    <div class="col-md-4">
                                        <s:hidden name="DrHeaderNo" id="DrHeaderNo" value="%{DrHeaderNo}" />
                                        <s:hidden id="selectedDrLine.drLineId" name="selectedDrLine.drLineId" cssClass="form-control " value="" />
                                        <s:textfield id="selectedDrLine.driverName" name="selectedDrLine.driverName" cssClass="form-control " value="" required="true" />
                                    </div>
                                </div>
                                <div class="form-group" >
                                    <label class="control-label col-md-4" for="selectedDrLine.policeNo">Police No</label>
                                    <div class="col-md-4">
                                        <s:textfield id="selectedDrLine.policeNo" name="selectedDrLine.policeNo" cssClass="form-control " value="" required="true"/>
                                    </div>
                                </div>
                               <div class="form-group" >
                                    <label class="control-label col-md-4" for="selectedDrLine.area">Area</label>
                                    <div class="col-md-4">
                                        <%--<s:textfield id="selectedDrLine.area" name="selectedDrLine.area" cssClass="form-control " value="" required="true"/>--%>
                                    </div>
                                </div>
                            </div>
                        </s:form>
                    </div>

                </div>
                <!-- /.panelsummary -->
            </div>
        </div> <!-- /.col-lg-12 -->
        <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->
    
    <script>

        $(document).ready(function () {
            var table = $('#dataTables-drLine').DataTable({
                rowReorder: {
                    selector: 'td:nth-child(5)'
                },
                responsive: true
            });
           //initial state for create / edit drheader. actionName is parameter from drHeader.jsp
                $('#actionTitle').text("New Summary");
                var today = new Date();
                var uid = ("0" + today.getDate()).slice(-2)+("0" + (today.getMonth() + 1)).slice(-2)+ today.getFullYear().toString()+Math.random().toString(36).replace(/[^a-z]+/g, '').substr(0, 5).toUpperCase();
                $('#selectedDrLine.drLineId').val(uid);
                $('#FormDrLine').attr('action','createDrLine');
//              $('#drHeaderCreatedDate').val(new Date().toISOString().slice(0, 19).replace('T', ' '));
                enableDrLineForm();
//            if($('#actionName').val() === "editDrLine")
//            {
//                $('#FormDrLine').attr('action','editDrLine');
//                enableDrLineForm();
//            }else
//            {
//                disableDrLineForm();
//            }

            //Event Handler

            //enable form for editing
            $('#btnEditDrHeader').on('click', function () {
                enableDrLineForm();
                $('#FormDrLine').attr('action','editDrHeader');
            });

            //onclick save button
            $('#btnSaveDrHeader').on('click', function () {
                $( "#FormDrLine" ).submit();
            });
            
            $('#btnDeleteDrHeader').on('click', function () {
               //$('#DeleteDrHeaderModal').modal('show'); 
            });

            //function
            function enableDrLineForm() {

                $('#selectedDrLine.driverName').removeAttr('readonly');
                $('#selectedDrLine.policeNo').removeAttr('readonly');
                $('#btnEditDrHeader').hide();
                $('#btnSaveDrHeader').show();
//                $('#btnDeleteDrHeader').hide();

            }
            function disableDrLineForm() {

                $('#selectedDrLine.driverName').attr('readonly', 'true');
                 $('#selectedDrLine.policeNo').attr('readonly', 'true');
                $('#btnSaveDrHeader').hide();
                $('#btnEditDrHeader').show();
//                $('#btnDeleteDrHeader').show();

            }
        });
        
    </script>
