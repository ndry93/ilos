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
            <h1 class="page-header">Delivery Request Summary</h1>
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
                        <h3 class="panel-title" id="actionTitle">Transaction Details</h3>
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
                        <s:form id="FormDrHeader" action="" method="post" validate="true" cssClass="form-inline"> 
                            <div class="col-lg-12">
                                <s:actionerror cssClass="alert alert-warning"/>
                                <div class="form-group">
                                    <label class="control-label col-md-4" for="selectedDrHeader.drHeaderId">Transaction ID</label>
                                    <div class="col-md-4">
                                        <s:hidden id="drHeaderId" name="selectedDrHeader.drHeaderId" cssClass="form-control " value="%{selectedDrHeader.drHeaderId}"/>
                                        <s:textfield id="transactionNum" name="selectedDrHeader.transactionNum" cssClass="form-control " value="%{selectedDrHeader.transactionNum}" required="true"  readonly="true"/>
                                    </div>
                                </div>
                                <div class="form-group" >
                                    <label class="control-label col-md-4" for="selectedDrHeader.customers.customerId">Customer ID</label>
                                    <div class="col-md-4">
                                        <s:select id="selectCustId" name="selectedDrHeader.customers.customerId" cssClass="form-control" value="%{selectedDrHeader.customers.customerId}" list="listCustomer" listKey="customerId" listValue="customerId" headerKey="-1" headerValue="Select Customer Id"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label col-md-4" for="selectedDrHeader.customers.customerName">Customer Name</label>
                                    <div class="col-md-4">
                                        <s:select id="selectCustName" name="selectedDrHeader.customers.customerName" cssClass="form-control" value="%{selectedDrHeader.customers.customerId}" list="listCustomer" listKey="customerId" listValue="customerName" headerKey="-1" headerValue="Select Customer Name"></s:select>
                                    </div>
                                </div>
<!--                                <div class="form-group" >
                                        <label class="control-label" for="selectedDrHeader.drStatus">Status</label>
                                    <--s:textfield id="drStatus" name="selectedDrHeader.drStatus" cssClass="form-control" value="%{selectedDrHeader.drStatus}" required="true" />
                                </div>-->
                            </div>
<!--                            <div class="col-lg-6" >
                                <div class="form-group" >
                                    <label class="control-label" for="selectedDrHeader.createdDate">Created Date</label>
                                    <--s:textfield id="drHeaderCreatedDate" name="selectedDrHeader.createdDate" cssClass="form-control" value="%{selectedDrHeader.createdDate}" disabled="true"/>
                                </div>
                                <div class="form-group" >
                                    <label class="control-label" for="selectedDrHeader.updatedDate">Updated Date</label>
                                    <--s:textfield name="selectedDrHeader.updatedDate" cssClass="form-control" value="%{selectedDrHeader.updatedDate}" disabled="true" />
                                </div>
                                <div class="form-group" >
                                    <label class="control-label" for="selectedDrHeader.updatedBy">Updated By</label>
                                    <--s:textfield name="selectedDrHeader.updatedBy" cssClass="form-control" value="%{selectedDrHeader.updatedBy}"  disabled="true" />
                                </div>
                                <%--<s:submit id="submitDrHeaderForm" validate="true" value="Login" align="center" cssClass="btn btn-lg btn-primary btn-block" disabled="true" />--%>
                            </div>-->
                        </s:form>
                    </div>

                </div>
                <!-- /.panelsummary -->
            </div>
            <div id="Summary" class="panel panel-default">
                <div class="panel-heading">
                    Summary
                    <div class="pull-right">
                        <a href="<s:url action="drLineDestByNo"><s:param name="DrHeaderNo" value="%{selectedDrHeader.drHeaderId}"/></s:url>" class="btn-sm btn-primary" ><i class="fa fa-pencil"></i> <strong>Add</strong></a>
                        <!--<a href="#" class="btn-sm btn-primary" id="addRow"><i class="fa fa-pencil"></i> <strong>Add</strong></a>-->
                        <!--<a href="#" class="btn-sm btn-primary" id="saveRow"><i class="fa fa-save"></i> <strong>Save</strong></a>-->
                        <!--<a href="#" class="btn-sm btn-primary"><i class="fa fa-align-justify"></i> <strong>List</strong></a>-->
                    </div>
                </div>
                <!-- Table -->
                <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover small" id="dataTables-drLine">
                        <thead>
                            <tr>
                                <th>Summary ID</th>
                                <th>Driver Name</th>
                                <th>No Police</th>
                                <th>Created Date</th>
                                <th>Last Update</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                                <s:iterator value="DrLineList">
                                    <tr>
                                        <td>
                                            <s:property value="drLineId" />
                                        </td>
                                        <td>
                                            <s:property value="driverName" />
                                        </td>
                                        <td>
                                            <s:property value="policeNo" />
                                        </td>
                                        <td>
                                            <s:property value="createdDate" />
                                        </td>
                                        <td>
                                            <s:property value="updatedDate" />
                                        </td>
                                        <td class="text-center"><s:property value="id"/>
                                            <a href="<s:url action="drLine" ><s:param name="DrHeaderNo"><s:property value="drHeaderId" /></s:param></s:url>" id="btnView" class="btn-sm btn-info"><i class="fa fa-eye"></i> <strong>View</strong></a>
                                                    <a href="#" id="btnEdit" class="btn-sm btn-success"><i class="fa fa-edit"></i> <strong>Edit</strong></a>
                                                    <a href="#" id="btnDelete" class="btn-sm btn-danger"><i class="fa fa-trash"></i> <strong>Delete</strong></a>
                                                </td>
                                            </tr>
                                </s:iterator>
                        </tbody>
                    </table>
                </div>
            </div><!-- /.paneltable -->
        </div> <!-- /.col-lg-12 -->
        <!-- /.row -->
    </div>
    <!-- /#page-wrapper -->
    <!--modal-->
    <div class="modal fade bs-example-modal-sm" id="DeleteDrHeaderModal" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
                <div class="modal-dialog modal-sm" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">Delete Delivery Request</h4>
                        </div>
                        <div class="modal-body">
                            Deleting transaction will also delete all of its data. Are you sure you want to delete it?
                        </div>
                        <div class="modal-footer">
                            <a href="<s:url action="deleteDrHeader" ><s:param name="selectedDrHeader.drHeaderId"><s:property value="%{selectedDrHeader.drHeaderId}" /></s:param></s:url>" id="btnYesDelete" class="btn btn-danger">Yes</a>
                            <a href="#" class="btn btn-default" data-dismiss="modal">No</a>
                        </div>
                    </div>
                </div>
            </div>
    <!--end modal-->
    <script>

        $(document).ready(function () {
            var table = $('#dataTables-drLine').DataTable({
                rowReorder: {
                    selector: 'td:nth-child(5)'
                },
                responsive: true
            });
           //initial state for create / edit drheader. actionName is parameter from drHeader.jsp
            if ($('#actionName').val() === "createDrHeader")
            {
                $('#actionTitle').text("New Delivery Request");
                $('#Summary').hide();
                var today = new Date();
                var uid = ("0" + today.getDate()).slice(-2)+("0" + (today.getMonth() + 1)).slice(-2)+ today.getFullYear().toString()+Math.random().toString(36).replace(/[^a-z]+/g, '').substr(0, 5).toUpperCase();
                $('#transactionNum').val(uid);
                $('#FormDrHeader').attr('action','createDrHeader');
//                $('#drHeaderCreatedDate').val(new Date().toISOString().slice(0, 19).replace('T', ' '));
                enableDrHeaderForm();
            } else if($('#actionName').val() === "editDrHeader")
            {
                $('#FormDrHeader').attr('action','editDrHeader');
                enableDrHeaderForm();
            }else
            {
                disableDrHeaderForm();
            }

            //Event Handler

            //select customer
            $('#selectCustId').on('change', function () {
                var a = $('#selectCustId').val();
                $('#selectCustName').val(a);
            });
            $('#selectCustName').on('change', function () {
                var a = $('#selectCustName').val();
                $('#selectCustId').val(a);
            });

            //enable form for editing
            $('#btnEditDrHeader').on('click', function () {
                enableDrHeaderForm();
                $('#FormDrHeader').attr('action','editDrHeader');
            });

            //onclick save button
            $('#btnSaveDrHeader').on('click', function () {
                $( "#FormDrHeader" ).submit();
            });
            
            $('#btnDeleteDrHeader').on('click', function () {
               $('#DeleteDrHeaderModal').modal('show'); 
            });

            //function
            function enableDrHeaderForm() {

                $('#selectCustId').removeAttr('readonly');
                $('#selectCustName').removeAttr('disabled');
                $('#drStatus').removeAttr('readonly');
                $('#btnEditDrHeader').hide();
                $('#btnSaveDrHeader').show();
//                $('#btnDeleteDrHeader').hide();

            }
            function disableDrHeaderForm() {

                $('#selectCustId').attr('readonly', 'true');
                $('#selectCustName').attr('disabled', 'true');
                $('#drStatus').attr('readonly', 'true');
                $('#btnSaveDrHeader').hide();
                $('#btnEditDrHeader').show();
//                $('#btnDeleteDrHeader').show();

            }
        });
        
    </script>
