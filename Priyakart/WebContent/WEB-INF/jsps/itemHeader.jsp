 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
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
       padding-top: 10px;
      }

   .row2 {
       padding-bottom: 20px;
      }
	  
	  
	  
   @media screen and (max-height: 450px) {
       .sidenav a {font-size: 18px;}
    }

    .container{
	    margin-top:-16px;
		margin-bottom:0px;
		
	}
	/* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-top: -1px;
      border-radius: 0;
    }
    
	.container-fluid{
	 background-color:#ffd6cc;
	 color:black;
	}

   a:link, a:visited { 
       color:black; 
       text-decoration: none; 
       font-weight:900px;
     } 
   a:active, a:hover { 
       color:black; 
      text-decoration: underline;
   }
	
	#dyn{float:right;padding-left:40px; padding-right:40px;font-size:18px; color:white;}
	#error{float:right;padding-right:40px;font-family:arial black;font-size:18px;color:white;}
</style>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
	
	  </ul>
      <ul class="nav navbar-nav navbar-right ">
	    <li><a href="sells"><span class="glyphicon glyphicon-link"></span>Design In</a></li>
	    <li><a href="sells"><span class="glyphicon glyphicon-share-alt"></span>Sell on Priyakart</a></li>
		<li><a href="#"><span class="glyphicon glyphicon-gift"></span>GiftCard</a></li>
		<li><a href="#"><span class="glyphicon glyphicon-signal"></span>Customer Care</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-check"></span>Track Order</a></li>
		 <c:choose>
	   <c:when test="${consObj eq null}">
		<li><a href="regCons"><span class="glyphicon glyphicon"></span>SignUp</a></li>
		<li><a href="loginCons"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	   </c:when>
	   <c:otherwise>
		 <li class="dropdown">
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-user"></span> Hi <b>${consObj.consFirstName}!</b></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Account</a></li>
            <li><a href="#">Orders</a></li>
            <li><a href="#">Wallet</a></li>
            <li><a href="consLogout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
          </ul>
		 </li> 
	  </c:otherwise>
     </c:choose>
        <li><a href="itemCart"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="priyakart-navbar">
    <div class="row row2">
        <div class="col-sm-2">
        <h1 style="margin-left:40px;"><span class="largenav">Priyakart</span></h1>
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
		<li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#">ELECTRONICS<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-toggle" data-toggle="dropdown" href="#">Mobile<span class="caret"></span></a></li>
            <li><a href="#">Samsung</a></li>
            <li><a href="#">Lenvo</a></li>
            <li><a href="#">Motorola</a></li>
            <li><a href="#">Apple</a></li>
            <li><a href="#">Asus</a></li>
            <li><a href="#">MicroMax</a></li>
          </ul>
        </li>
        <li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">MEN<span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">WOMEN<span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">HOME&FURNITURE <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">BABY&KIDS <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">APPLIANCES <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul> 
		</li>
		<li class="dropdown" >
		   <a class="dropdown-toggle" data-toggle="dropdown" href="#">BOOK&MORE <span class="caret"></span></a></a>
		   <ul class="dropdown-menu">
            <li><a href="#">Page 1-1</a></li>
            <li><a href="#">Page 1-2</a></li>
            <li><a href="#">Page 1-3</a></li>
          </ul> 
		</li>
      </ul>
    </div>
  </div>		
</div>

