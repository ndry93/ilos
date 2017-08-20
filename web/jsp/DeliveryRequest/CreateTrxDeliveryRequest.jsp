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
            <h1 class="page-header">Delivery Request</h1>
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
                        <h3 class="panel-title" id="actionTitle">Add New Delivery Request</h3>
                    </div>
                    <div class="pull-right">
                        <a href="#" id="btnSaveDrHeader" class="btn-sm btn-primary"><i class="fa fa-save"></i> <strong>Save</strong></a>
                    </div>
                </div>
                <div class="panel-body">
                    <div class="row">

                        <s:form id="FormDrHeader" action="" method="post" validate="true" cssClass="form-inline"> 
                           
                            <div class="col-md-5 col-xs-12 col-md-5">
                                <s:actionerror cssClass="alert alert-warning"/>
                                <div class="form-group col-lg-12 col-xs-12">
                                    <label class="control-label" for="selectedDrHeader.drHeaderId">Transaction ID</label>
                                    <s:hidden id="drHeaderId" name="selectedDrHeader.drHeaderId" cssClass="form-control " value="%{selectedDrHeader.drHeaderId}"/>
                                    <s:textfield id="dreqNum" name="selectedDrHeader.transactionNum" cssClass="form-control pull-right" value="%{selectedDrHeader.transactionNum}" required="true"  readonly="true" style="width:200px;"/>
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
                                    <s:textfield type="text" id="deliveryDateStart" name="selectedDrHeader.deliveryDateStart" cssClass="form-control datepicker pull-right" value="%{selectedDrHeader.deliveryDateStart}" readonly="true" style="width:200px;"/>
                                <p>Date: <input type="text" class="datepicker form-control"></p>
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
 
        </div> <!-- /.col-lg-12 -->
        <!-- /.row -->
    </div>
</div>
<!-- /#page-wrapper -->


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
                                                    $(function () {
                                                        $(".datepicker").datepicker({
                                                            dateFormat : 'dd/mm/yy'
                                                        });
                                                    });
                                                   // input text using datepicker
                                                    <!--<p>Date: <input type="text" class="datepicker form-control"></p>-->

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

