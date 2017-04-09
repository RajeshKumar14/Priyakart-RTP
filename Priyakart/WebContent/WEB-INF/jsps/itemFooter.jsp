     <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
<style>
/*--------ITEM_FOOTER----------*/
.footer-item_part{
	background-color:#337ab7;
	box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.12);
	box-sizing: border-box;
	width: 100%;
	text-align: left;
	font: bold 16px sans-serif;
	padding: 45px 50px;
	margin-top: 0px;
}
.footer-item_part .footer-left,
.footer-item_part .footer-middle,
.footer-item_part .footer-center,
.footer-item_part .footer-right{
	display: inline-block;
	vertical-align: top;
}

/* Footer left */
.footer-item_part .footer-left{
	width: 25%;
}

/* The company logo */

.footer-item_part h3{
	color:  #ffffff;
	font: normal 36px 'Cookie', cursive;
	margin: 0;
}

.footer-item_part h3 span{
	color:  #5383d3;
}



/* Footer middle left */
.footer-item_part .footer-middle{
	width: 25%;
}
/* This is is nav title */
.footer-item_part h3{
	color:  #ffffff;
	font: normal 36px 'Cookie', cursive;
	margin: 0;
}
.footer-item_part h3 span{
	color:  #5383d3;
}

/* Footer links */
.footer-item_part .footer-links{
	color:  #ffffff;
	margin: 20px 0 12px;
	padding: 0;
}

.footer-item_part .footer-links a{
	display:inline-block;
	line-height: 1.8;
	text-decoration: none;
	color:  inherit;
}

/* Footer Center */
.footer-item_part .footer-center{
	width: 25%;
}

.footer-item_part .footer-center i{
	background-color:#337ab7;
	color: #ffffff;
	font-size: 25px;
	width: 38px;
	height: 38px;
	border-radius: 50%;
	text-align: center;
	line-height: 42px;
	margin: 10px 15px;
	vertical-align: middle;
}

.footer-item_part .footer-center i.fa-envelope{
	font-size: 17px;
	line-height: 38px;
}

.footer-item_part .footer-center p{
	display: inline-block;
	color: #ffffff;
	vertical-align: middle;
	margin:0;
}

.footer-item_part .footer-center p span{
	display:block;
	font-weight: normal;
	font-size:14px;
	line-height:2;
}

.footer-item_part .footer-center p a{
	color:#ffffff;
	text-decoration: none;;
}


/* Footer Right */
.footer-item_part .footer-right{
	width: 23%;
}

.footer-item_part .footer-company-about{
	line-height: 20px;
	color:  #ffffff;
	font-size: 13px;
	font-weight: normal;
	margin: 0;
}

.footer-item_part .footer-company-about span{
	display: block;
	color:  #ffffff;
	font-size: 14px;
	font-weight: bold;
	margin-bottom: 20px;
}

.footer-item_part .footer-icons{
	margin-top: 25px;
}

.footer-item_part .footer-icons a{
	display: inline-block;
	width: 35px;
	height: 35px;
	cursor: pointer;
	background-color:#337ab7;
	border-radius: 2px;

	font-size: 20px;
	color: #ffffff;
	text-align: center;
	line-height: 35px;

	margin-right: 3px;
	margin-bottom: 5px;
}

.footer-item_part .footer-company-name{
	color: #ffffff;;
	font-size: 16px;
	font-weight: normal;
	text-align:center;
	margin: 0;
}

.footer-item_part .footer-company-name a{
	text-decoration:none;
	color:#ffffff;;
}

/* If you don't want the footer to be responsive, remove these media queries */

@media (max-width: 880px) {

	.footer-item_part{
		font: bold 14px sans-serif;
	}

	.footer-item_part .footer-left,
	.footer-item_part .footer-middle,
	.footer-item_part .footer-center,
	.footer-item_part .footer-right{
		display: block;
		width: 100%;
		margin-bottom: 40px;
		text-align: center;
	}

	.footer-item_part .footer-center i{
		margin-left: 0;
	}
}

</style>	
		
		<footer class="footer-item_part" >
			<div class="footer-left">
				<h3>Help</h3>
				<nav class="footer-links">
				   <ul>
				    <li><a href="#">Payment</a></li>
					<li><a href="#">Shipping</a></li>
					<li><a href="#">Cancelation</a></li>
					<li><a href="#">Faq</a></li>
					<li><a href="#">Report</a></li>
				   </ul>
				</nav>
			</div>
			
			<div class="footer-middle">
				<h3>Priyakart</h3>
				<nav class="footer-links">
				   <ul>
				    <li><a href="#">About Us </a></li>
					<li><a href="#">Carerrs</a></li>
					<li><a href="#">Priyakart Stories</a></li>
					<li><a href="#">Press</a></li>
					<li><a href="seller">Sell on Priyakart</a></li>
				   </ul>
				</nav>
			</div>

			<div class="footer-center">
			    <h3>Contact</h3>
				<div><i class="fa fa-map-marker"></i>
					<p><span> Madhaili Bazar,Madhepura </span> Biahr,India</p>
				</div>
				
				<div><i class="fa fa-phone"></i>
					<p>+918120969542</p>
				</div>

				<div><i class="fa fa-envelope"></i>
					<p><a href="mailto:supprot@priyakart.com">support@priyakart.com</a></p>
				</div>
			</div>

			<div class="footer-right">
			    <h3>About the Company</h3>
                 <p class="footer-company-about">
				 <span></span>
					Managed the all type of product and process to deliver to the customer .Main focus on reduced the processing time and provide good Product and facility.
				</p>
				<nav class="footer-icons">
					<a href="#"><i class="fa fa-facebook"></i></a>
					<a href="#"><i class="fa fa-twitter"></i></a>
					<a href="#"><i class="fa fa-linkedin"></i></a>
					<a href="#"><i class="fa fa-github"></i></a>
				</nav>
           </div>
		   <hr>
		   <p class="footer-company-name">Copyright © 2017 <a href="#">Priyakart</a> | 
            Designed by <a href="http://www.rajeshwebsolutions.com" target="_parent">Rajesh WebSolutions Pvt.Ltd</a></p> 
		</footer>

