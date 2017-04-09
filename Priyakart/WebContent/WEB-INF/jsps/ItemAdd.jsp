<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <title>Add Item</title>
    <%@include file="sellerHeader.jsp" %>   
<script type="text/javascript">
  $(document).ready(function() {
    var date = new Date();
    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();

    if (month < 10) month = "0" + month;
    if (day < 10) day = "0" + day;

    var today = year + "-" + month + "-" + day;       
    $("#theDate").attr("value", today);
   });
  
  var itemPrice =document.itemForm.itemPrice.value;
  var discount =document.itemForm.discount.value;
  var rebateValue=document.itemForm.rebateValue.value;
  var specialCost =document.itemForm.specialCost.value;
  var quantity=document.itemForm.quantity.value;
  var discount=document.itemForm.discount.value;
  var discountPrice;
  var venMagrgin;
  var vat;
  var netPrice;
  
  function discountCalculation(itemPrice,discount){
    var discountPrice=(parseFloat(itemPrice)*parseFloat(discount))/100;
    return parseFloat(discountPrice);
  }
  function venMarginCalculation(discountPrice){
	    var venMagrgin=(parseFloat(discountPrice)*parseFloat(discount))/100;
	    return parseFloat(discountPrice);
   }
 discountPrice=discountCalculation(itemPrice,discount); //calculate percent of Mrp
  
</script>   
        
<div class="container" style="marging-top:0px;">
  <div class="row">
    <!-- left column -->
   <form  name="itemForm" action="insertItem" method="POST" class="form-horizontal" role="form">
    <div class="col-md-4 col-sm-6 col-xs-12">
      <div class="text-center">
        <img src="http://lorempixel.com/200/200/people/9/" class="img-thumbnail" alt="avatar">
        <input type="file" name="" class="text-center center-block well well-sm">
        <input type="file" name="" class="text-center center-block well well-sm">
        <input type="file" name="" class="text-center center-block well well-sm">
        <input type="file" name="" class="text-center center-block well well-sm">
        <input type="file" name="" class="text-center center-block well well-sm">
      </div>
    </div>
    <!-- edit form column -->
    <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
       <div class="alert alert-info alert-dismissable">
       
           <a class="panel-close close" data-dismiss="alert">×</a> 
           <i class="fa fa-coffee"></i>
             <strong>${msg}</strong>.
       </div>
            <h3 style="color:#337ab7">Add Item Information</h3>
        <div class="form-group">
          <label  for="itemName" class="col-lg-3 control-label">Title</label>
          <div class="col-lg-9">
            <input  name="itemName" class="form-control" value="" type="text">
          </div>
        </div>
         <!-- Select Basic -->
        <div class="form-group">
           <label  for="itemType" class="col-lg-3 control-label">Type</label>
               <div class="col-lg-4">
                   <select id="State" name="itemType" class="form-control">
                      <option value="">Select Type</option>
                      <option value="ELECTRONICS">ELECTRONICS</option>
                      <option value="MEN">MEN</option>
                      <option value="WOMEN">WOMEN</option>
                      <option value="HOME&FURNITURE">HOME&FURNITURE</option>
                      <option value="BABY&KIDS">BABY&KIDS</option>
                      <option value="APPLIANCES">APPLIANCES</option>
                      <option value="BOOK&MORE">BOOK&MORE</option>
                   </select>
               </div>
               <div class="col-lg-5">
                   <select id="State" name="itemSubType" class="form-control">
                      <option value="">Select Sub-Type</option>
                      <option value="Mobile">Mobile</option>
                      <option value="Mobile Accessories">Mobile Accessories</option>
                      <option value="Laptop">Laptop</option>
                      <option value="Desktop PCs">Desktop PCs</option>
                      <option value="Computer Accessories">Computer Accessories</option>
                      <option value="Computer Peripherial">Computer Peripherial</option>
                      <option value="Televisions">Televisions</option>
                      <option value="Home Entertainment">Home Entertainment</option>
                      <option value="Camera">Camera</option>
                      <option value="Camera Accessories">Camera Accessories</option>
                      <option value="Networks Components">Networks Components</option>
                   </select>
               </div>
         </div> 
         <!-- Select Basic -->
          <!-- Select Basic -->
        <div class="form-group">
           <label  for="itemType" class="col-lg-3 control-label">Brand Name</label>
               <div class="col-lg-3">
                   <select id="State" name="itemBrand" class="form-control">
                      <option value="">Select Brand </option>
                      <option value="Samsung">Samsung</option>
                      <option value="Lenovo">Lenovo</option>
                      <option value="Dell">Dell</option>
                      <option value="Tosiba">Tosiba</option>
                      <option value="Segate">Segate</option>
                      <option value="Micromax">Micromax</option>
                      <option value="Apple">Apple</option>
                   </select>
               </div>
          <label class="col-lg-3 control-label">MRP</label>
          <div class="col-lg-3">
            <input class="form-control" name="itemMrp" type="text" placeholder="Item price" id="itemPrice">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Transaction Date</label>
          <div class="col-md-3">
            <input class="form-control" name="transactinDateAndTime" type="date" id="theDate" >
          </div>
          <label class="col-md-3 control-label">Margin Discount</label>
          <div class="col-md-3">
            <input class="form-control" name="marginDiscount" type="text" placeholder="Discount %" id="discount">
          </div>
        </div>
         <div class="form-group">
          <label class="col-lg-3 control-label">Service</label>
          <div class="col-lg-3">
               <select id="State" name="service" class="form-control">
                   <option value="Cash On Delivery">Cash On Delivery</option>
                   <option value="Digital Delivery">Digital Delivery</option>
               </select>
            </div>
            <label class="col-lg-3 control-label">Rebate Value</label>
          <div class="col-lg-3">
            <input class="form-control" name="rebateValue" type="text" placeholder="Rebate value" id="rebateValue">
          </div>
        </div>
         <div class="form-group">
           <label  for="itemType" class="col-lg-3 control-label">Shipment Mode</label>
               <div class="col-lg-2">
                   <select id="State" name="shipmentMode" class="form-control">
                      <option value="Flight">Flight</option>
                      <option value="Rail">Rail</option>
                      <option value="Truck">Truck</option>
                   </select>
               </div>
             <label class="col-lg-4 control-label">Special Services Cost</label>
          <div class="col-lg-3">
            <input class="form-control" name="specialServiceCost" type="text" placeholder="Special Service Cost" id="specialCost">
          </div> 
        </div>
        <div class="form-group">
          <label  for="itemType" class="col-lg-3 control-label">Mode of Payment</label>
               <div class="col-lg-3">
                   <select id="State" name="modeOfPayment" class="form-control">
                      <option value="Cash On Delivery">Cash Payment</option>
                      <option value="Online Payment">Online Payment</option>
                   </select>
              </div> 
           <label class="col-lg-3 control-label">Avaliable Quantity</label>
          <div class="col-lg-3">
              <input class="form-control" name="avaliableQuantity" type="text" placeholder="Quantity" >
           </div>
        </div>
        <div class="form-group">
            <label class="col-lg-9 control-label">Total Amount</label>
          <div class="col-lg-3">
            <input class="form-control" name="" type="text" placeholder="Total Amount">
          </div>
        </div>
       <div class="form-group">
             <label class="col-lg-3 control-label">VAT</label>
          <div class="col-lg-3">
             <input class="form-control" name="vat" type="text" placeholder="VAT%">
          </div>
            <label class="col-lg-3 control-label">Vendor Margin</label>
          <div class="col-lg-3">
            <input class="form-control" name="vendorMargin" type="text" placeholder="Vendor margin">
          </div>
        </div> 
        <div class="form-group">
             <label class="col-lg-3 control-label">Descriptions</label>
          <div class="col-lg-9">
             <textarea rows="6" class="form-control" id="details" name="details"></textarea>
          </div>
        </div> 
        <div class="form-group">
            <label class="col-lg-9 control-label">Net Total Amount</label>
          <div class="col-lg-3">
            <input class="form-control" name="" type="text" placeholder="Net total amount">
          </div>
        </div> 
        <div class="form-group">
          <label class="col-md-3 control-label"></label>
          <div class="col-md-9"  align="right">
            <button  class="btn btn-primary" type="submit">Add Item</button>
            <span></span>
           <button  class="btn btn-default"  type="reset">Cancel</button> 
          </div>
       </div>
    </div>
  </form>
  </div>
</div>
<br><br><br>
<%@include file="sellsFooter.jsp" %>