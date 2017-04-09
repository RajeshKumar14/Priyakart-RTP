<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SignUp</title>
<%@include file="itemHeader.jsp" %>
 <style>
     body { 
          background: url(http://lorempixel.com/1920/1920/city/9/) no-repeat center center fixed; 
         -webkit-background-size: cover;
         -moz-background-size: cover;
         -o-background-size: cover;
         background-size: cover;
        }

     .panel-default {
           opacity: 0.9;
           margin-top:30px;
           margin-left:0px;
         }
     .form-group.last { margin-bottom:0px; }
</style>

<div class="container">
  <div class="row">
     <div class="col-md-6 col-md-offset-7">
        <div class="panel panel-default">
          <div class="panel-heading">
            <span class="glyphicon glyphicon-registration-mark"></span> Register to Priyakart</div>
             <div class="panel-body">
              <form  action="insertCons" method="post" class="form-horizontal"  role="form">
      <!-- Text input-->
   <div class="form-group">
         <label for="inputName3" class="col-sm-4 control-label">First Name</label>
      <div class="col-sm-7">
          <input type="text"  name="consFirstName" class="form-control"  placeholder="first name" required>
      </div>
   </div>
   <!-- Text input-->
    <div class="form-group">
         <label for="inputName3" class="col-sm-4 control-label">Last Name</label>
       <div class="col-sm-7">
          <input type="text"  name="consLastName" class="form-control"  placeholder="last Name" required>
       </div>
   </div>  
   <!-- Text input-->
     <div class="form-group">
         <label for="inputEmail3" class="col-sm-4 control-label">Email</label>
       <div class="col-sm-7">
           <input type="text"  name="consEmail" class="form-control"  placeholder="email" required>
        </div>
     </div> 
     
   <!-- Text input-->
     <div class="form-group">
         <label for="inputMobile3" class="col-sm-4 control-label">Mobile No</label>
       <div class="col-sm-7">
           <input type="text"  name="mobileNo" class="form-control"  placeholder="mobile no" required>
        </div>
     </div> 
    <!-- Text input-->
     <div class="form-group">
         <label for="DateOfBirth" class="col-sm-4 control-label">Date of Birth</label>
       <div class="col-sm-7">
           <input type="date"  name="dob" class="form-control" required>
        </div>
     </div>    
   <!-- --Test Input -->
      <div class="form-group">
          <label class="col-sm-4 control-label">Gender</label>
             <div class="col-sm-7">
                <div class="row">
                   <div class="col-sm-3">
                      <label class="radio-inline">
                        <input type="radio" name="gender" id="maleRadio" value="Male">Male
                      </label>
                   </div>
                  <div class="col-sm-3">
                     <label class="radio-inline">
                        <input type="radio" name="gender" id="femaleRadio" value="Female">Female
                      </label>
                   </div>
                </div>
           </div>
      </div> <!-- /.form-group -->
     <!-- Button -->
       <div class="form-group">
             <label class="col-md-4 control-label" for="signup"></label>
          <div class="col-md-4">
              <button  type="submit" id="signup" name="signup" class="btn btn-success">Sign Up</button>
          </div>
       </div>
   </form>
</div>
   <div class="panel-footer">
     <p><label>${msg}</label></p>
   </div>
</div>
</div>
</div>
</div>
<br><br>
<%@include file="itemFooter.jsp" %>