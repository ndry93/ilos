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
                    <h3 class="panel-title">Details</h3>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <s:form action="" method="post" validate="true"> 
                            <div class="col-lg-6">
                                <s:actionerror cssClass="alert alert-warning"/>
                                <div class="form-group">
                                    <%--<s:label class="control-label" for="DrLineList.drHeaders" >Transaction ID</s:label>--%>
                                    <label class="control-label" for="selectedDrHeader.drHeaderId">Transaction ID</label>
                                    <s:textfield name="selectedDrHeader.drHeaderId" cssClass="form-control" value="%{selectedDrHeader.drHeaderId}" required="true" />
                                </div>
                                <div class="form-group">
                                    <%--<s:label class="control-label" for="DrLineList.drHeaders" >Transaction ID</s:label>--%>
                                    <label class="control-label" for="selectedDrHeader.customers.customerId">Customer ID</label>
                                    <s:textfield name="selectedDrHeader.customers.customerId" cssClass="form-control" value="%{selectedDrHeader.customers.customerId}" required="true" />
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.customers.customerName">Customer Name</label>
                                    <s:textfield name="selectedDrHeader.customers.customerName" cssClass="form-control" value="%{selectedDrHeader.customers.customerName}" required="true" />
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.drStatus">Status</label>
                                    <s:textfield name="selectedDrHeader.drStatus" cssClass="form-control" value="%{selectedDrHeader.drStatus}" required="true" />
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.createdDate">Created Date</label>
                                    <s:textfield name="selectedDrHeader.createdDate" cssClass="form-control" value="%{selectedDrHeader.createdDate}" required="true" />
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.updatedDate">Updated Date</label>
                                    <s:textfield name="selectedDrHeader.updatedDate" cssClass="form-control" value="%{selectedDrHeader.updatedDate}" required="true" />
                                </div>
                                <div class="form-group">
                                    <label class="control-label" for="selectedDrHeader.updatedBy">Updated By</label>
                                    <s:textfield name="selectedDrHeader.updatedBy" cssClass="form-control" value="%{selectedDrHeader.updatedBy}" required="true" />
                                </div>
                                <%--<s:submit validate="true" value="Login" align="center" cssClass="btn btn-lg btn-primary btn-block"  />--%>
                            </div>
                        </s:form>
                    </div>

                </div>
                <!-- /.panelsummary -->
            </div>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <a href="#" class="btn-sm btn-primary" ><i class="fa fa-pencil"></i> <strong>Add</strong></a>
                    <!--<a href="#" class="btn-sm btn-primary" id="addRow"><i class="fa fa-pencil"></i> <strong>Add</strong></a>-->
                    <!--<a href="#" class="btn-sm btn-primary" id="saveRow"><i class="fa fa-save"></i> <strong>Save</strong></a>-->
                    <!--<a href="#" class="btn-sm btn-primary"><i class="fa fa-align-justify"></i> <strong>List</strong></a>-->

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
    </script>
