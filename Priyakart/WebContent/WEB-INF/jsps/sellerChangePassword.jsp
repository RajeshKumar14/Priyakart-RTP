<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
<%@include file="sellerHeader.jsp" %>
<div class="container" style="marging-top:-0px;">
  <div class="row">
    <!-- left column -->
    <div class="col-md-4 col-sm-6 col-xs-12">
      <div class="text-center">
        <img src="http://lorempixel.com/200/200/people/9/" class="avatar img-circle img-thumbnail" alt="avatar">
      </div>
    </div>
    <!-- edit form column -->
    <div class="col-md-8 col-sm-6 col-xs-12 personal-info">
      <div class="alert alert-info alert-dismissable">
        <a class="panel-close close" data-dismiss="alert">×</a> 
        <i class="fa fa-coffee"></i>
        This is an <strong>.alert</strong>. Use this to show important messages to the user.
      </div>
      <h3>Personal info</h3>
      <form  action="sellerChangePassword" method="post" class="form-horizontal" role="form">
         <div class="form-group">
          <label class="col-lg-3 control-label">Seller Id</label>
          <div class="col-lg-8">
            <input name="sellerId" class="form-control" value="${sellerObj.sellerId}" type="text" readonly>
          </div>
        </div>
         <div class="form-group">
          <label class="col-lg-3 control-label">Name</label>
          <div class="col-lg-8">
            <input class="form-control" value="${sellerObj.sellerFirstName} ${sellerObj.sellerLastName}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-lg-3 control-label">Email Id</label>
          <div class="col-lg-4">
            <input class="form-control" value="${sellerObj.sellerEmail}" type="text" readonly>
          </div>
          <div class="col-lg-4">
            <input class="form-control" value="" type="text" placeholder="Enter Secondry Email" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Username</label>
          <div class="col-md-8">
            <input class="form-control" value="${sellerObj.sellerEmail}" type="text" readonly>
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Old Password</label>
          <div class="col-md-8">
            <input name="oldPwd" class="form-control" value="" type="password">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Password</label>
          <div class="col-md-8">
            <input name="newPwd" class="form-control" value="" type="password">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label">Confirm password</label>
          <div class="col-md-8">
            <input name="conformPwd" class="form-control" value="" type="password">
          </div>
        </div>
        <div class="form-group">
          <label class="col-md-3 control-label"></label>
          <div class="col-md-8">
            <input class="btn btn-primary" value="Save Changes" type="submit">
            <span></span>
            <input class="btn btn-default" value="Cancel" type="reset">
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<%@include file="sellsFooter.jsp" %>