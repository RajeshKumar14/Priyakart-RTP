<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Setting</title>
<%@include file="sellerHeader.jsp" %>
<div class="container" style="marging-top:0px;">
  <div class="row">
    <!-- left column -->
     <form action="updateAdminProfilePicture"  method="post" enctype="multipart/form-data" class="form-horizontal" role="form">
    <div class="col-md-4 col-sm-6 col-xs-12">
      <div class="text-center">
        <img src="http://lorempixel.com/200/200/people/9/" class="avatar img-circle img-thumbnail" alt="avatar">
          <br><br>
            <input type="file" name="profileImageName" class="text-center center-block well well-sm">
            <button class="btn btn-primary" type="submit">Save</button>
            <button  class="btn btn-Primary"  type="submit">Remove</button>
        </div>
     </div>
    </form>
    <!-- edit form column -->
    <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
      <div class="alert alert-info alert-dismissable">
        <a class="panel-close close" data-dismiss="alert">×</a> 
        <i class="fa fa-coffee"></i>
        <strong>${msg}</strong>.
      </div>
      <h3 style="color:#337ab7">Personal Information</h3>
      <form  action="updateSeller" method="post" class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-lg-3 control-label">Seller Id</label>
          <div class="col-lg-8">
            <input name="sellerId" class="form-control" value="${sellerObject.sellerId}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">First name</label>
          <div class="col-lg-8">
            <input name="sellerFirstName" class="form-control" value="${sellerObject.sellerFirstName}" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Last name</label>
          <div class="col-lg-8">
            <input  name="sellerLastName" class="form-control" value="${sellerObject.sellerLastName}" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Username</label>
          <div class="col-md-8">
            <input name="sellerEmail" class="form-control" value="${sellerObject.sellerEmail}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Password</label>
          <div class="col-md-8">
            <input  name="pwd" class="form-control" value="${sellerObject.pwd}" type="password" readonly>
          </div>
        </div>
         <div class="form-group">
          <label class="col-lg-3 control-label">Email Id</label>
          <div class="col-lg-4">
            <input class="form-control" value="${sellerObject.sellerEmail}" type="text" readonly>
          </div>
          <div class="col-lg-4">
            <input name="sellerSecEmail" class="form-control" value="${sellerObject.sellerSecEmail}" type="text" placeholder="Enter Secondry Email">
          </div>
        </div>
         <div class="form-group">
          <label class="col-lg-3 control-label">Mobile No</label>
          <div class="col-lg-8">
            <input name="mobileNo" class="form-control" value="${sellerObject.mobileNo}" type="text">
          </div>
        </div>
        <div class="form-group">
             <label class="col-lg-3 control-label">Birthday</label>
          <div class="col-lg-4">
            <input name="dob" class="form-control" value="${sellerObject.dob}" type="date">
          </div>
         </div>
           <!-- --Test Input -->
      <div class="form-group">
          <label class="col-sm-3 control-label">Gender</label>
             <div class="col-sm-7">
                <div class="row">
                <c:choose>
				 <c:when test="${sellerObject.gender eq 'Male'}">
                   <div class="col-sm-3">
                      <label class="radio-inline">
                        <input type="radio" name="gender" id="maleRadio" value="Male" checked="checked">Male
                      </label>
                   </div>
                  <div class="col-sm-3">
                     <label class="radio-inline">
                        <input type="radio" name="gender" id="femaleRadio" value="Female">Female
                      </label>
                   </div>
                  </c:when>
                  <c:when test="${sellerObject.gender eq 'Female'}">
                     <div class="col-sm-3">
                      <label class="radio-inline">
                        <input type="radio" name="gender" id="maleRadio" value="Male">Male
                      </label>
                   </div>
                  <div class="col-sm-3">
                     <label class="radio-inline">
                        <input type="radio" name="gender" id="femaleRadio" value="Female" checked="checked">Female
                      </label>
                   </div>
                  </c:when>
				<c:otherwise>
				     <div class="col-sm-3">
                      <label class="radio-inline">
                        <input type="radio" name="gender" id="maleRadio" value="Male">Male
                      </label>
                   </div>
                  <div class="col-sm-3">
                     <label class="radio-inline">
                        <input type="radio" name="userGender" id="femaleRadio" value="Female">Female
                      </label>
                   </div>
				</c:otherwise>
			    </c:choose>
               </div>
           </div>
      </div> <!-- /.form-group -->
        <div class="form-group">
          <label class="col-md-3 control-label"></label>
          <div class="col-md-8"  align="right">
            <input  class="btn btn-primary" value="Save Changes" type="submit">
            <span></span>
            <input  class="btn btn-default" value="Cancel" type="reset">
          </div>
        </div>
      </form>
       <h3 style="color:#337ab7">Current Address  :</h3>
      <form action="updateAddress" method="post" class="form-horizontal" role="form">
        <div class="form-group">
          <label class="col-lg-3 control-label">Seller Id</label>
          <div class="col-lg-8">
            <input name="sellerId" class="form-control" value="${sellerObject.sellerId}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Address Line1</label>
          <div class="col-lg-8">
            <input name="addr1" class="form-control" value="${sellerObject.addr.addr1}" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Address Line2</label>
          <div class="col-lg-8">
            <input name="addr2" class="form-control" value="${sellerObject.addr.addr2}" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">City Name</label>
          <div class="col-lg-3">
            <input name="city" class="form-control" value="${sellerObject.addr.city}" type="text">
          </div>
          <label class="col-lg-2 control-label">State</label>
          <div class="col-lg-3">
            <input name="state" class="form-control" value="${sellerObject.addr.state}" type="text">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Country</label>
          <div class="col-md-3">
            <input name="country" class="form-control" value="${sellerObject.addr.country}" type="text">
          </div>
          <label class="col-md-2 control-label">Pin Code</label>
          <div class="col-md-3">
            <input name="pinCode" class="form-control" value="${sellerObject.addr.pinCode}" type="text">
          </div>
        </div>
         <div class="form-group">
          <label class="col-md-3 control-label"></label>
          <div class="col-md-8"  align="right">
            <input  class="btn btn-primary" value="Save Changes" type="submit">
            <span></span>
            <input  class="btn btn-default" value="Cancel" type="reset">
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<br><br>
<%@include file="sellsFooter.jsp" %>