
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
   <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
 
  <style>
   body{
	    margin: 0;
	    padding: 0;
	    line-height: 1.5em;
	    font-family: Georgia, "Times New Roman", Times, serif;
	    font-size: 17px;
	    color: #555a4a;
        background: #e9e9e9;
     }
   .priyakart-navbar {
       background-color:#337ab7;
       color: #FFFFFF;
	   margin-top:-20px;
	   margin-bottom:50px;
     }

   .row1{
       margin-right:60px;
       padding-top:25px;
       padding-bottom:0px;
      }

   .row2 {
       margin-left:30px;
       margin-top:-20px;
       padding-bottom:20px;
      }
	   
   @media screen and (max-height: 450px) {
       .sidenav a {font-size: 18px;}
    }

    .container{
	    margin-top:-16px;
		margin-bottom:0px;
		margin-left:40px;
		
	}
	/* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-top: -1px;
      border-radius: 0;
    }
    
	.container-fluid{
	 background-color:#FFFFFF;
		color:black;
	}

   a:link, a:visited { 
       color:black; 
       text-decoration: none; 
       font-weight:900px;; 
     } 
   a:active, a:hover { 
       color:black; 
      text-decoration:none;
   }
</style>
  
 <div class="priyakart-navbar">
     <div class="row row1">
  <div class="col-dm-1">
    <c:choose>
	    <c:when test="${sellerObj eq null}">   
	    </c:when>
		<c:otherwise>
		<ul class="nav navbar-nav navbar-right">
          <li class="dropdown">
		     <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> Hi <b>${sellerObj.sellerFirstName}!</b></a>
		     <ul class="dropdown-menu">
               <li><a href="sellerPro?sellerId=<c:out value="${sellerObj.sellerId}"/>"><span class="glyphicon glyphicon-user"></span>Profile</a></li>
               <li><a href="sellerSett?sellerId=<c:out value="${sellerObj.sellerId}"/>"><span class="glyphicon glyphicon-cog"></span>Setting</a></li>
               <li><a href="sellerChangePwd?sellerId=<c:out value="${sellerObj.sellerId}"/>"><span class="glyphicon glyphicon-edit"></span>Change Password</a></li>
                <li><a href="sellerLogout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
            </ul>
		 </li>
	    </ul> 
		</c:otherwise>
	</c:choose>
   </div>
    <div class="row row2">
        <div class="col-sm-2">
          <h2 style="margin-left:40px;"><span class="largenav">SellerHub</span></h2>
        </div>
    </div>
 
    <div class="container">
     <div class="navbar-header ">
      <button type="button" class="navbar-toggle color-black" data-toggle="collapse" data-target="#myNavbarbottom">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbarbottom">
      <ul class="nav navbar-nav">
		<li><a class="dropdown-toggle" href="sellerDash">WELCOME</a> </li>
        <li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">PRODUCTS<span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="addItem">Adding Item</a></li>
            <li><a href="trackApprovalItem?sellerId=<c:out value="${sellerObj.sellerId}"/>">Track Approval Item</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">ORDER<span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Active Order</a></li>
            <li><a href="#">Cancel Order</a></li>
          </ul> 
		</li>
		<li class="dropdown">
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">RETURN <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Returns</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">PAYMENTS <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Overview</a></li>
            <li><a href="#">Statement</a></li>
            <li><a href="#">Transaction</a></li>
            <li><a href="#">Invoices</a></li>
            
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">PERFORMANCE <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Overview</a></li>
            <li><a href="#">Growth of Opportunity</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">PROMOATIONS<span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">My Promotions</a></li>
            <li><a href="#">Priyakart Promotions</a></li>
          </ul> 
		</li>
	 </ul>
    </div>
  </div>		
</div>
</div>

