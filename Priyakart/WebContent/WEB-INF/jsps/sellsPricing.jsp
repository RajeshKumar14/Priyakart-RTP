<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pricing</title>
<%@include file="sellsHeader.jsp" %>
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
     <div class="col-md-10 col-md-offset-1">
        <div class="panel panel-default">
          <div class="panel-heading">
            <span class="glyphicon glyphicon-registration-mark"></span>Pricing</div>
             <div class="panel-body">
    <table class="table">
    <thead>
        <tr>
            <th>Item  </th>
            <th>Amount (Rs.)</th>
        </tr>
    </thead>
    <tbody>
       <tr><td>Selling Price (decided by you)</td><td>1500</td>
       <tr><td>Commission Fee(varies across sub-categories/verticals)</td><td>150 (assuming 10%)</td>
       <tr><td>Shipping Fee (Local shipping , weight 500 grams)</td><td>30</td>
       <tr><td>Collection Fee (2 % on the Order item value)</td><td>30</td>
       <tr><td>Fixed Fee</td><td>30</td>
       <tr><td>Total Marketplace Fee</td><td>240</td>
       <tr><td>Service Tax (15% of Marketplace Fee including Swachh Bharat &amp; Krishi Kalyan cess)</td><td>36</td>		
       <tr><td>Total deductions</td><td>276</td>
       <tr><th>Settlement Value(Amount credited to you)</th><th>1224</th>	
    </tbody>
    </table>
            </div>
            <div class="panel-footer">
              <p><label></label></p>
            </div>
        </div>
    </div>
  </div>
</div>
<br><br>

<div class="container">
  <div class="row">
     <div class="col-md-10 col-md-offset-1">
        <div class="panel panel-default">
          <div class="panel-heading">
            <span class="glyphicon glyphicon-registration-mark"></span>Pricing</div>
             <div class="panel-body">
       <table class="table">
    <thead>
        <tr>
            <th>Weight slab</th>
            <th>Local (Intracity)<br>in Rs. </th>
            <th>Zonal (Intrazone)<br>in Rs.</th>
            <th>National (Interzone)<br>in Rs.</th>
        </tr>
      </thead>
      <tbody>
           <tr><td>0.0 Kg - 0.5 Kg&nbsp;( For every 0.5 kg )</td><td>30 </td><td>50 </td> <td>70 </td></tr>
           <tr><td>0.5 Kg - 5.0 Kg&nbsp;( For every 0.5 kg )</td><td>30</td><td>35</td> <td>45 </td></tr>
           <tr><td>&gt; 5.0 Kg&nbsp;( For every 1 kg )</td><td>5</td><td>10</td> <td>20</td></tr>    
      </tbody>
      </table>
            </div>
            <div class="panel-footer">
              <p><label></label></p>
            </div>
        </div>
    </div>
  </div>
</div>
<br><br>
<%@include file="sellsFooter.jsp" %>