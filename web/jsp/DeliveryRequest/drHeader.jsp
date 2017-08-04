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
                            <table width="100%" class="table table-striped table-bordered table-hover small" id="dataTables-drHeader">
                                <thead>
                                    <tr>
                                        <th>Transaction No</th>
                                        <th>Customer ID</th>
                                        <th>Customer Name</th>
                                        <th>Driver Name</th>
                                        <th>Police No</th>
                                        <th>Ritase</th>
                                        <th>Status</th>
                                        <th>Created Date</th>
                                        <th>Updated Date</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                            <s:iterator value="DrHeaderList">
                                <tr>
                                    <td id="transactionNum">
                                        <s:property value="transactionNum" />
                                    </td>
                                    <td>
                                        <s:property value="customers.customerId" />
                                    </td>
                                    <td>
                                        <s:property value="customers.customerName" />
                                    </td>
                                    <td>
                                        <s:property value="driverName" />
                                    </td>
                                    <td>
                                        <s:property value="policeNo" />
                                    </td>
                                    <td>
                                        <s:property value="rit" />
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
                                    <td class="text-center" style="min-width: 100px;"><s:property value="id"/>
                                            <a href="<s:url action="drLinesByDrNo"><s:param name="DrHeaderId"><s:property value="drHeaderId" /></s:param><s:param name="actionName">viewDrHeader</s:param></s:url>" id="btnView" class="btn-sm btn-info"><strong>View</strong></a>
                                            <a href="<s:url action="drLinesByDrNo" ><s:param name="DrHeaderId"><s:property value="drHeaderId" /></s:param><s:param name="actionName">editDrHeader</s:param></s:url>" id="btnEdit" class="btn-sm btn-success"><strong>Edit</strong></a>     
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
                <a href="" id="btnYesDelete" class="btn btn-danger">Yes</a>
                <a href="#" class="btn btn-default" data-dismiss="modal">No</a>
            </div>
        </div>
    </div>
</div>
<script>

    $(document).ready(function () {
        var table = $('#dataTables-drHeader').DataTable({
            rowReorder: {
                selector: 'td:nth-child(2)'
            },
            responsive: true
        });
        $('#dataTables-drHeader').on('click', '#btnDelete', function () {
//            var DrHeaderId = table.row($(this).parents('tr')).data()[0];
            $('#DeleteDrHeaderModal').modal('show');
            //            $('#btnYesDelete').attr('href',url);

        });
    });

</script>


