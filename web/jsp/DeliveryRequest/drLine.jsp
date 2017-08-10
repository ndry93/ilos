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

                        <s:form id="FormDrHeader" action="" method="post" validate="true" cssClass="form-inline"> 
                            <s:hidden name="actionName" id="actionName" value="%{actionName}" />
                            <div class="col-md-5 col-xs-12 col-md-5">
                                <s:actionerror cssClass="alert alert-warning"/>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.drHeaderId">Transaction ID</label>
                                    <s:hidden id="drHeaderId" name="selectedDrHeader.drHeaderId" cssClass="form-control " value="%{selectedDrHeader.drHeaderId}"/>
                                    <s:textfield id="transactionNum" name="selectedDrHeader.transactionNum" cssClass="form-control pull-right" value="%{selectedDrHeader.transactionNum}" required="true"  readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12" >
                                    <label class="control-label" for="selectedDrHeader.customers.customerId">Customer ID</label>
                                    <s:select id="selectCustId" name="selectedDrHeader.customers.customerId" cssClass="form-control pull-right" value="%{selectedDrHeader.customers.customerId}" list="listCustomer" listKey="customerId" listValue="customerId" headerKey="" headerValue="Select Customer Id" style="width:200px;" required="true"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.customers.customerName">Customer Name</label>
                                    <s:select id="selectCustName" name="selectedDrHeader.customers.customerName" cssClass="form-control pull-right" value="%{selectedDrHeader.customers.customerId}" list="listCustomer" listKey="customerId" listValue="customerName" headerKey="" headerValue="Select Customer Name" style="width:200px;" required="true"></s:select>
                                    </div>
                                    <div class="form-group col-lg-12 col-xs-12">
                                        <label class="control-label" for="selectedDrHeader.deliveryDateStart">Delivery Start Date</label>
                                    <s:textfield type="datetime-local" id="deliveryDateStart" name="deliveryDateStart" cssClass="form-control pull-right" value="%{selectedDrHeader.deliveryDateStart}" readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.deliveryDateEnd">Delivery End Date</label>
                                    <s:textfield id="deliveryDateEnd" type="datetime-local" name="deliveryDateEnd" cssClass="form-control pull-right" value="%{selectedDrHeader.deliveryDateEnd}" readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12" id="DrHeaderAmount">
                                    <s:set var="totDeliveryAmt" value="0"/>
                                    <s:iterator value="selectedDrHeader.drLineses">
                                        <s:set var="totDeliveryAmt" value="%{#totDeliveryAmt + amount}"/>         
                                    </s:iterator>
                                    <label class="control-label" for="totDeliveryAmt">Amount</label>
                                    <s:textfield  id="totDeliveryAmt" name="totDeliveryAmt" cssClass="form-control pull-right" value="%{totDeliveryAmt}" readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.drStatus">Status</label>
                                    <s:textfield  id="drStatus" name="selectedDrHeader.drStatus" cssClass="form-control pull-right" value="%{selectedDrHeader.drStatus}" readonly="true" style="width:200px;"/>
                                </div>
                            </div>

                            <div class="col-md-5 col-xs-12 col-md-5">
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.driverName">Driver Name</label>
                                    <s:textfield id="driverName" name="selectedDrHeader.driverName" cssClass="form-control pull-right" value="%{selectedDrHeader.driverName}" required="true"  readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.policeNo">Police No</label>
                                    <s:textfield id="policeNo" name="selectedDrHeader.policeNo" cssClass="form-control pull-right" value="%{selectedDrHeader.policeNo}" required="true"  readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.drHeaderId">Ritase</label>
                                    <s:textfield type="number" id="rit" name="selectedDrHeader.rit" cssClass="form-control pull-right" value="%{selectedDrHeader.rit}" required="true"  readonly="true" style="width:200px;" />
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.kmStart">KM Start</label>
                                    <s:textfield  type="number" id="kmStart" name="selectedDrHeader.kmStart" cssClass="form-control pull-right" value="%{selectedDrHeader.kmStart}" readonly="true" style="width:200px;"/>
                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.kmEnd">KM End</label>
                                    <s:textfield type="number" id="kmEnd" name="selectedDrHeader.kmEnd" cssClass="form-control pull-right" value="%{selectedDrHeader.kmEnd}" readonly="true" style="width:200px;"/>

                                </div>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.areaId">Area</label>
                                    <s:textfield type="number" id="areaId" name="selectedDrHeader.areaId" cssClass="form-control pull-right" value="%{selectedDrHeader.areaId}" readonly="true" style="width:200px;"/>

                                </div>

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
                        <a href="#" id="btnAddDrLine" class="btn-sm btn-primary" ><i class="fa fa-pencil"></i> <strong>Add</strong></a>
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
                                <th>Destination Id</th>
                                <th>Destination Name</th>
                                <th>Amount</th>
                                <th>Delivery Status</th>
                                <th>Delivery Date</th>
                                <th>Created Date</th>

                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="selectedDrHeader.drLineses" var="drLine">
                                <s:if test="#drLine.isDeleted != 'Y'">
                                    <tr>
                                        <td id="td_drLineId_<s:property value="drLineId"/>">
                                            <s:property value="drLineId" />
                                        </td>
                                        <td id="td_destId_<s:property value="drLineId"/>">
                                            <s:property value="destinations.destId" />
                                        </td>
                                        <td id="td_destName_<s:property value="drLineId"/>">
                                            <s:property value="destinations.destName" />
                                        </td>
                                        <td id="td_amount_<s:property value="drLineId"/>">
                                            <s:property value="amount" />
                                        </td>
                                        <td id="td_deliveryStatus_<s:property value="drLineId"/>">
                                            <s:property value="deliveryStatus" />
                                        </td>
                                        <td id="td_deliveryDate_<s:property value="drLineId"/>">
                                            <s:property value="deliveryDate" />
                                        </td>
                                        <td id="td_createdDate_<s:property value="drLineId"/>">
                                            <s:property value="createdDate" />
                                        </td>
                                        <s:hidden id="td_bk24_%{drLineId}" value="%{bk24}" />
                                        <s:hidden id="td_arrivalDate_%{drLineId}" value="%{arrivalDate}" />
                                        <s:hidden id="td_arrivalKm_%{drLineId}" value="%{arrivalKm}" />
                                        <s:hidden id="td_leavingDate_%{drLineId}" value="%{leavingDate}" />
                                        <s:hidden id="td_description_%{drLineId}" value="%{description}" />

                                        <td class="text-center" style="min-width: 250px;">
                                            <a href="javascript:createDeliveryReport('<s:property value="drHeaders.drHeaderId"/>')" id="btnReport" class="btn-sm btn-default"><i class="fa fa-book"></i> <strong>DR Report</strong></a>
                                            <a href="#" id="EditDrLine" onclick="EditDrLineForm('<s:property value="%{drLineId}"/>');" class="btn-sm btn-success"><i class="fa fa-edit"></i> <strong>Edit</strong></a>
                                            <a href="#" onclick="DeleteDrLine('<s:url action="deleteDrLine" ><s:param name="DrLineNo"><s:property value="%{drLineId}" /></s:param></s:url>');" id="btnDeleteDrLine" class="btn-sm btn-danger"><i class="fa fa-trash"></i> <strong>Delete</strong></a>
                                                </td>

                                            </tr>
                                </s:if>
                            </s:iterator>
                        </tbody>
                    </table>
                </div>
            </div><!-- /.paneltable -->
        </div> <!-- /.col-lg-12 -->
        <!-- /.row -->
    </div>
</div>
<!-- /#page-wrapper -->

<!--modal delete dr header-->
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

        <!--modal new dr line-->
        <div class="modal fade" id="NewDrLineModal" tabindex="-1" role="dialog" 
             aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <!-- Modal Header -->
                    <div class="modal-header">
                        <button type="button" class="close" 
                                data-dismiss="modal">
                            <span aria-hidden="true">&times;</span>
                            <span class="sr-only">Close</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">
                            New Summary
                        </h4>
                    </div>

                    <!-- Modal Body -->
                    <div class="modal-body">

                <s:form id="FormNewDrLine" action="createDrLine" method="post" validate="true"> 
                    <div class="col-md-6 col-lg-6 col-xs-12">
                        <div class="form-group" >
                            <label class="control-label" for="selectedDrLine.destinations.destId">Destination ID</label>
                            <s:select id="selectDestId" name="selectedDrLine.destinations.destId" cssClass="form-control pull-right" value="" list="listDestination" listKey="destId" listValue="destId" headerKey="" headerValue="Select Destination Id" style="min-width:200px;" required="true"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="selectedDrLine.destinations.destName">Destination Name</label>
                            <s:select id="selectDestName" name="selectedDrLine.destinations.destName" cssClass="form-control pull-right" value="" list="listDestination" listKey="destId" listValue="destName" headerKey="" headerValue="Select Destination" style="min-width:200px;" required="true"></s:select>
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="amount">Amount</label>
                            <s:hidden name="selectedDrLine.drHeaders.drHeaderId" id="selectedDrLine.drHeaders.drHeaderId" value="%{selectedDrHeader.drHeaderId}" />
                            <s:textfield type="number" id="amount" name="selectedDrLine.amount" cssClass="form-control" value="" required="true" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="amount">bk24</label>
                            <s:textfield type="text" id="bk24" name="selectedDrLine.bk24" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="deliveryDate">Delivery Date</label>
                            <s:textfield id="deliveryDate" type="datetime-local" name="selectedDrLine.deliveryDate" cssClass="form-control" value="" />
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-6 col-xs-12">
                        <div class="form-group">
                            <label class="control-label" for="arrivalDate">Arrival Date</label>
                            <s:textfield id="arrivalDate" type="datetime-local" name="selectedDrLine.arrivalDate" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="arrivalKm">KM Arrival</label>
                            <s:textfield type="number" id="arrivalKm" name="selectedDrLine.arrivalKm" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="leavingDate">Leaving Date</label>
                            <s:textfield  id="leavingDate" type="datetime-local" name="selectedDrLine.leavingDate" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="amount">Description</label>
                            <s:textfield type="textarea" id="description" name="selectedDrLine.description" cssClass="form-control" value="" />
                        </div>

                    </div>
                </s:form>
            </div>

            <!-- Modal Footer -->
            <div class="row col-lg-12 col-xs-12 col-md-12 pull-right">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal">
                    Close
                </button>
                <button id="btnSaveNewDrLine" type="submit" class="btn btn-primary">
                    Save
                </button>
            </div>

            <div class="row" ></div>
            <br/>
        </div>
    </div>
</div>
<!--end modal-->

<!--modal delete dr header-->
<div class="modal fade bs-example-modal-sm" id="DeleteDrLineModal" tabindex="0" role="dialog" aria-labelledby="DeleteDrLineModalLabel">
    <div class="modal-dialog modal-sm" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="DeleteDrLineLabel">Delete Destination in Summary</h4>
            </div>
            <div class="modal-body">
                Are you sure you want to delete it?
            </div>
            <div class="modal-footer">
                <a href="" id="btnYesDeleteDrLine" class="btn btn-danger">Yes</a>
                <a href="#" class="btn btn-default" data-dismiss="modal">No</a>
            </div>
        </div>
    </div>
</div>
<!--end modal-->

<!--modal edit dr line-->
<div class="modal fade" id="EditDrLineModal" tabindex="-1" role="dialog" 
     aria-labelledby="edModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <!-- Modal Header -->
            <div class="modal-header">
                <button type="button" class="close" 
                        data-dismiss="modal">
                    <span aria-hidden="true">&times;</span>
                    <span class="sr-only">Close</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    Edit Summary
                </h4>
            </div>

            <!-- Modal Body -->
            <div class="modal-body">

                <s:form id="FormEditDrLine" action="editDrLine" method="post" validate="true"> 
                    <div class="col-md-6 col-lg-6 col-xs-12">
                        <div class="form-group">
                            <label class="control-label" for="amount">Id</label>
                            <s:textfield type="number" id="ed_drLineId" name="edDrLine.drLineId" cssClass="form-control" value="" readonly="true" required="true" />
                        </div>
                        <div class="form-group" >
                            <label class="control-label" for="edDrLine.destinations.destId">Destination ID</label>
                            <s:select id="ed_selectDestId" name="edDrLine.destinations.destId" cssClass="form-control pull-right" value="" list="listDestination" listKey="destId" listValue="destId" headerKey="" headerValue="Select Destination Id" style="min-width:200px;" required="true"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="edDrLine.destinations.destName">Destination Name</label>
                            <s:select id="ed_selectDestName" name="edDrLine.destinations.destName" cssClass="form-control pull-right" value="" list="listDestination" listKey="destId" listValue="destName" headerKey="" headerValue="Select Destination" style="min-width:200px;" required="true"></s:select>
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="amount">Amount</label>
                            <s:hidden name="edDrLine.drHeaders.drHeaderId" id="edDrLine.drHeaders.drHeaderId" value="%{selectedDrHeader.drHeaderId}" />
                            <s:textfield type="number" id="ed_amount" name="edDrLine.amount" cssClass="form-control" value="" required="true" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="bk24">bk24</label>
                            <s:textfield type="text" id="ed_bk24" name="edDrLine.bk24" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="deliveryDate">Delivery Date</label>
                            <s:textfield id="ed_deliveryDate" type="datetime-local" name="edDrLine.deliveryDate" cssClass="form-control" value="" />
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-6 col-xs-12">
                        <div class="form-group">
                            <label class="control-label" for="arrivalDate">Arrival Date</label>
                            <s:textfield id="ed_arrivalDate" type="datetime-local" name="edDrLine.arrivalDate" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="arrivalKm">KM Arrival</label>
                            <s:textfield type="number" id="ed_arrivalKm" name="edDrLine.arrivalKm" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="leavingDate">Leaving Date</label>
                            <s:textfield  id="ed_leavingDate" type="datetime-local" name="edDrLine.leavingDate" cssClass="form-control" value="" />
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="amount">Description</label>
                            <s:textfield type="textarea" id="ed_description" name="edDrLine.description" cssClass="form-control" value="" />
                        </div>

                    </div>
                </s:form>
            </div>

            <!-- Modal Footer -->
            <div class="row col-lg-12 col-xs-12 col-md-12 pull-right">
                <button type="button" class="btn btn-default"
                        data-dismiss="modal">
                    Close
                </button>
                <button id="btnSaveEdDrLine" type="submit" class="btn btn-primary">
                    Save
                </button>
            </div>

            <div class="row" ></div>
            <br/>
        </div>
    </div>
</div>

<!--end modal-->
<!--<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.js"></script>-->
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
<script>
                                                function createDeliveryReport(value) {
                                                    var url = "createDrReport?drId=" + value;
                                                    window.open(url, "_blank", "directories=no, status=no,width=800, height=580,top=0,left=0");
                                                }
                                                $(document).ready(function () {
                                                    var table = $('#dataTables-drLine').DataTable({
                                                        rowReorder: {
                                                            selector: 'td:nth-child(5)'
                                                        },
                                                        responsive: true
                                                    });
                                                    $('#DrHeaderAmount').show();
                                                    //initial state for create / edit drheader. actionName is parameter from drHeader.jsp
                                                    $('#drStatus').show();
                                                    if ($('#actionName').val() === "createDrHeader")
                                                    {
                                                        $('#actionTitle').text("New Delivery Request");
                                                        $('#Summary').hide();
                                                        $('#DrHeaderAmount').hide();
                                                        //                $('#drStatus').hide();
                                                        var today = new Date();
                                                        var uid = ("0" + today.getDate()).slice(-2) + ("0" + (today.getMonth() + 1)).slice(-2) + today.getFullYear().toString() + Math.random().toString(36).replace(/[^a-z]+/g, '').substr(0, 5).toUpperCase();
                                                        $('#transactionNum').val(uid);
                                                        $('#FormDrHeader').attr('action', 'createDrHeader');
                                                        //                $('#drHeaderCreatedDate').val(new Date().toISOString().slice(0, 19).replace('T', ' '));
                                                        enableDrHeaderForm();
                                                    } else if ($('#actionName').val() === "editDrHeader")
                                                    {
                                                        $('#FormDrHeader').attr('action', 'editDrHeader');
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
                                                    //select destination
                                                    $('#selectDestId').on('change', function () {
                                                        var a = $('#selectDestId').val();
                                                        $('#selectDestName').val(a);
                                                    });
                                                    $('#selectDestName').on('change', function () {
                                                        var a = $('#selectDestName').val();
                                                        $('#selectDestId').val(a);
                                                    });
                                                    //select destination
                                                    $('#ed_selectDestId').on('change', function () {
                                                        var a = $('#ed_selectDestId').val();
                                                        $('#ed_selectDestName').val(a);
                                                    });
                                                    $('#ed_selectDestName').on('change', function () {
                                                        var a = $('#ed_selectDestName').val();
                                                        $('#selectDestId').val(a);
                                                    });

                                                    //enable form for editing
                                                    $('#btnEditDrHeader').on('click', function () {
                                                        enableDrHeaderForm();
                                                        $('#FormDrHeader').attr('action', 'editDrHeader');
                                                    });

                                                    //onclick save button
                                                    $('#btnSaveDrHeader').on('click', function () {

                                                        if ($("#FormDrHeader").valid()) {   // test for validity
                                                            $('#FormDrHeader').submit();
                                                        } else {

                                                        }
                                                        $('#actionName').val("viewDrHeader");
                                                    });

                                                    $('#btnDeleteDrHeader').on('click', function () {
                                                        $('#DeleteDrHeaderModal').modal('show');
                                                    });

                                                    //function
                                                    function enableDrHeaderForm() {

                                                        $('#selectCustId').removeAttr('disabled');
                                                        $('#selectCustName').removeAttr('disabled');
                                                        $('#rit').removeAttr('readonly');
                                                        $('#driverName').removeAttr('readonly');
                                                        $('#kmStart').removeAttr('readonly');
                                                        $('#kmEnd').removeAttr('readonly');
                                                        $('#deliveryDateEnd').removeAttr('readonly');
                                                        $('#deliveryDateStart').removeAttr('readonly');
                                                        //                $('#drStatus').removeAttr('readonly');
                                                        $('#policeNo').removeAttr('readonly');
                                                        $('#btnEditDrHeader').hide();
                                                        $('#btnSaveDrHeader').show();
                                                        //                $('#btnDeleteDrHeader').hide();
                                                    }
                                                    function disableDrHeaderForm() {

                                                        $('#selectCustId').attr('disabled', 'true');
                                                        $('#selectCustName').attr('disabled', 'true');
                                                        $('#rit').attr('readonly', 'true');
                                                        $('#driverName').attr('readonly', 'true');
                                                        $('#policeNo').attr('readonly', 'true');
                                                        $('#kmStart').attr('readonly', 'true');
                                                        $('#kmEnd').attr('readonly', 'true');
                                                        $('#deliveryDateEnd').attr('readonly', 'true');
                                                        $('#deliveryDateStart').attr('readonly', 'true');
                                                        $('#btnSaveDrHeader').hide();
                                                        $('#btnEditDrHeader').show();
                                                        //                $('#btnDeleteDrHeader').show();

                                                    }

                                                    //function for edit dr line
//            $('#btnEdit').on('click', function () {
//                $('#NewDrLineModal').modal('show');
//            });
                                                    //function for new dr line
                                                    $('#btnAddDrLine').on('click', function () {
                                                        $('#NewDrLineModal').modal('show');
                                                    });
                                                    $('#btnSaveNewDrLine').on('click', function () {

                                                        if ($("#FormNewDrLine").valid()) {   // test for validity
                                                            $('#FormNewDrLine').submit();
                                                        } else {

                                                        }
                                                    });
                                                    $('#btnSaveEdDrLine').on('click', function () {

                                                        if ($("#FormEditDrLine").valid()) {   // test for validity
                                                            $('#FormEditDrLine').submit();
                                                        } else {

                                                        }
                                                    });
                                                    

                                                });
                                                function DeleteDrLine(LinkDelete) {

                                                    $('#btnYesDeleteDrLine').attr('href', LinkDelete);
                                                    $('#DeleteDrLineModal').modal('show');
                                                }
                                                function EditDrLineForm(drLineId) {
                                                    $('#ed_selectDestId').val($('#td_destId_' + drLineId).html().trim());
                                                    $('#ed_selectDestName').val($('#td_destId_' + drLineId).html().trim());
                                                    $('#ed_amount').val($('#td_amount_' + drLineId).html().trim());
                                                    $('#ed_deliveryDate').val($('#td_deliveryDate_' + drLineId).html().trim());
                                                    $('#ed_bk24').val($('#td_bk24_' + drLineId).val());
                                                    $('#ed_arrivalDate').val($('#td_arrivalDate_' + drLineId).val());
                                                    $('#ed_arrivalKm').val($('#td_arrivalKm_' + drLineId).val());
                                                    $('#ed_leavingDate').val($('#td_leavingDate_' + drLineId).val());
                                                    $('#ed_description').val($('#td_description_' + drLineId).val());
                                                     $('#ed_drLineId').val(drLineId);

                                                    $('#EditDrLineModal').modal('show');
                                                }
</script>

