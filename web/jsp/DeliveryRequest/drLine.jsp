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
                        <a href="#" id="btnDeleteDrHeader" class="btn-sm btn-danger"><i class="fa fa-trash"></i> <strong>Delete</strong></a>
                        <a href="#" id="btnEditDrHeader" class="btn-sm btn-success"><i class="fa fa-edit"></i> <strong>Edit</strong></a>
                        <a href="#" id="btnSaveDrHeader" class="btn-sm btn-primary"><i class="fa fa-save"></i> <strong>Save</strong></a>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <s:hidden name="actionName" id="actionName" value="%{actionName}" />
                        <s:form id="FormDrHeader" action="" method="post" validate="true"> 
                            <div class="col-lg-6">
                                <s:actionerror cssClass="alert alert-warning"/>
                                <div class="form-group">
                                    <%--<s:label class="control-label" for="DrLineList.drHeaders" >Transaction ID</s:label>--%>
                                    <label class="control-label" for="selectedDrHeader.drHeaderId">Transaction ID</label>
                                    <s:textfield id="drHeaderId" name="selectedDrHeader.drHeaderId" cssClass="form-control" value="%{selectedDrHeader.drHeaderId}" required="true"  readonly="true"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.customers.customerId">Customer ID</label>
                                    <s:select id="selectCustId" name="selectedDrHeader.customers.customerId" cssClass="form-control" value="%{selectedDrHeader.customers.customerId}" list="listCustomer" listKey="customerId" listValue="customerId" headerKey="-1" headerValue="Select Customer Id"></s:select>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label" for="selectedDrHeader.customers.customerName">Customer Name</label>
                                    <s:select id="selectCustName" name="selectedDrHeader.customers.customerName" cssClass="form-control" value="%{selectedDrHeader.customers.customerId}" list="listCustomer" listKey="customerId" listValue="customerName" headerKey="-1" headerValue="Select Customer Name"></s:select>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label" for="selectedDrHeader.drStatus">Status</label>
                                    <s:textfield id="drStatus" name="selectedDrHeader.drStatus" cssClass="form-control" value="%{selectedDrHeader.drStatus}" required="true" />
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.createdDate">Created Date</label>
                                    <s:textfield id="drHeaderCreatedDate" name="selectedDrHeader.createdDate" cssClass="form-control" value="%{selectedDrHeader.createdDate}" disabled="true"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.updatedDate">Updated Date</label>
                                    <s:textfield name="selectedDrHeader.updatedDate" cssClass="form-control" value="%{selectedDrHeader.updatedDate}" disabled="true" />
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.updatedBy">Updated By</label>
                                    <s:textfield name="selectedDrHeader.updatedBy" cssClass="form-control" value="%{selectedDrHeader.updatedBy}"  disabled="true" />
                                </div>
                                <%--<s:submit id="submitDrHeaderForm" validate="true" value="Login" align="center" cssClass="btn btn-lg btn-primary btn-block" disabled="true" />--%>
                            </div>
                        </s:form>
                    </div>

                </div>
                <!-- /.panelsummary -->
            </div>
            <div id="Summary" class="panel panel-default">
                <div class="panel-heading">
                    Summary
                    <div class="pull-right">
                        <a href="#" class="btn-sm btn-primary" ><i class="fa fa-pencil"></i> <strong>Add</strong></a>
                        <!--<a href="#" class="btn-sm btn-primary" id="addRow"><i class="fa fa-pencil"></i> <strong>Add</strong></a>-->
                        <!--<a href="#" class="btn-sm btn-primary" id="saveRow"><i class="fa fa-save"></i> <strong>Save</strong></a>-->
                        <!--<a href="#" class="btn-sm btn-primary"><i class="fa fa-align-justify"></i> <strong>List</strong></a>-->
                    </div>
                </div>
                <!-- Table -->
                <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-drLine">
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
    <script>

        $(document).ready(function () {
            var table = $('#dataTables-drLine').DataTable({
                rowReorder: {
                    selector: 'td:nth-child(5)'
                },
                responsive: true
            });
           
            if ($('#actionName').val() == "createDrHeader")
            {
                $('#actionTitle').text("New Delivery Request");
                $('#btnDeleteDrHeader').hide();
                $('#Summary').hide();
                var today = new Date();
                var uid = today.getDate().toString()+(today.getMonth() + 1).toString()+ today.getFullYear().toString()+Math.random().toString(36).replace(/[^a-z]+/g, '').substr(0, 5).toUpperCase();
                $('#drHeaderId').val(uid);
                $('#FormDrHeader').attr('action','createDrHeader');
//                $('#drHeaderCreatedDate').val(new Date().toISOString().slice(0, 19).replace('T', ' '));
                enableDrHeaderForm();
            } else
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
            });

            //onclick save button
            $('#btnSaveDrHeader').on('click', function () {
                $( "#FormDrHeader" ).submit();
            });

            //function
            function enableDrHeaderForm() {

                $('#selectCustId').removeAttr('readonly');
                $('#selectCustName').removeAttr('readonly');
                $('#drStatus').removeAttr('readonly');
                $('#btnEditDrHeader').hide();
                $('#btnSaveDrHeader').show();

            }
            function disableDrHeaderForm() {

                $('#selectCustId').attr('readonly', 'true');
                $('#selectCustName').attr('readonly', 'true');
                $('#drStatus').attr('readonly', 'true');
                $('#btnSaveDrHeader').hide();
                $('#btnEditDrHeader').show();

            }
        });

    </script>
