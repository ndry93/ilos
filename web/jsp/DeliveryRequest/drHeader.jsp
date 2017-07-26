<%-- 
    Document   : drTransaction
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
            <h1 class="page-header">Delivery Request Transactions</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    &nbsp;
                    <div class="pull-right">
                        <a href="<s:url action="drLinesByDrNo"><s:param name="actionName">createDrHeader</s:param></s:url>" class="btn-sm btn-primary" ><i class="fa fa-pencil"></i> <strong>Add</strong></a>
                                <!--<a href="#" class="btn-sm btn-primary" id="addRow"><i class="fa fa-pencil"></i> <strong>Add</strong></a>-->
                                <!--<a href="#" class="btn-sm btn-primary" id="saveRow"><i class="fa fa-save"></i> <strong>Save</strong></a>-->
                                <!--<a href="#" class="btn-sm btn-primary"><i class="fa fa-align-justify"></i> <strong>List</strong></a>-->
                            </div>
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-drHeader">
                                <thead>
                                    <tr>
                                        <th>Transaction ID</th>
                                        <th>Customer ID</th>
                                        <th>Customer Name</th>
                                        <th>Status</th>
                                        <th>Created Date</th>
                                        <th>Last Update</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                            <s:iterator value="DrHeaderList">
                                <tr>
                                    <td id="drHeaderId">
                                        <s:property value="drHeaderId" />
                                    </td>
                                    <td>
                                        <s:property value="customers.customerId" />
                                    </td>
                                    <td>
                                        <s:property value="customers.customerName" />
                                    </td>
                                    <td>
                                        <s:property value="drStatus" />
                                    </td>
                                    <td>
                                        <s:property value="createdDate" />
                                    </td>
                                    <td>
                                        <s:property value="updatedDate" />
                                    </td>
                                    <td class="text-center"><s:property value="id"/>
                                        <a href="<s:url action="drLinesByDrNo" ><s:param name="DrHeaderNo"><s:property value="drHeaderId" /></s:param><s:param name="actionName">viewDrHeader</s:param></s:url>" id="btnView" class="btn-sm btn-info"><strong>View</strong></a>
                                        <a href="<s:url action="drLinesByDrNo" ><s:param name="DrHeaderNo"><s:property value="drHeaderId" /></s:param><s:param name="actionName">editDrHeader</s:param></s:url>" id="btnEdit" class="btn-sm btn-success"><strong>Edit</strong></a>
                                                <!--<a href="" id="btnDelete" class="btn-sm btn-danger" ><strong>Delete</strong></a>-->
                                            </td>
                                        </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
</div>
<!-- /#page-wrapper -->
<script>

    $(document).ready(function () {
        var table = $('#dataTables-drHeader').DataTable({
            rowReorder: {
                selector: 'td:nth-child(2)'
            },
            responsive: true
        });
    });

</script>


