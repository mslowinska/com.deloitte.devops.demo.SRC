<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>DevOps demo - Buy item</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/shop-item.css" rel="stylesheet">
    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<!-- jQuery library -->
	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<!-- Latest compiled JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script> 

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/demo">Camera Online Shop</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">About</a>
                    </li>
                    <li>
                        <a href="#">Services</a>
                    </li>
                    <li>
                        <a href="#">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <div class="col-md-3">
                <p class="lead">Camera Shop</p>
                <div class="list-group">
                    <a href="#" class="list-group-item active">Cameras</a>
                    <a href="#" class="list-group-item">Accessories</a>
                    <a href="#" class="list-group-item">Gadgets</a>
                </div>
            </div>

            <div class="col-md-9">

                <div class="thumbnail">
                	<div align="center">
                	<form:form action="confirmation" method="post" modelAttribute="user">
                	<table>
                <tr>
					<td><h6 style="text-align:right; margin-right:5px;">Product Name:</h6></td>
					<td>Canon EOS 1300D DSLR Camera with 18-55mm Lens</td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Price:</h6></td>
					<td>£329.99</td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">First Name:</h6></td>
					<td><input type="text" name="firstName" value="${user.firstName}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Last Name:</h6></td>
					<td><input type="text" name="lastName" value="${user.lastName}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">E-mail:</h6></td>
					<td><input type="text" name="email" value="${user.email}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Address Line 1:</h6></td>
					<td><input type="text" name="address1" value="${user.address1}"></td>
				</tr>
				 <tr>
					<td><h6 style="text-align:right; margin-right:5px;">Address Line 2:</h6></td>
					<td><input type="text" name="address2" value="${user.address2}"></td>
				</tr>		
				<tr>
				
					<td><h6 style="text-align:right; margin-right:5px;">Postcode:</h6></td>
					<td><input type="text" name="postcode" value="${user.postcode}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">City:</h6></td>
					<td><input type="text" name="city" value="${user.city}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Name on Card:</h6></td>
					<td><input type="text" name="nameCard" value="${user.nameCard}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Card Number:</h6></td>
					<td><input type="text" name="numberCard" value="${user.numberCard}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Expiry Date:</h6></td>
					<td><input type="text" name="expiryDate" value="${user.expiryDate}"></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">CVV:</h6></td>
					<td><input type="text" name="securityCard" value="${user.securityCard}"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><button class="btn btn-success" type="submit" style="margin-top:20px; width:250px;" value="Submit" />Pay Now</button></td>
				</tr>
			</table>
		</form:form>
                	
                	
                	
                	
						<%-- <table>
							<tr>
								<td colspan="2" align="center"><h2>Purchase Successful!</h2></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<h3>${user.firstName}, here is your order summary:</h3>
								</td>
							</tr>
							<tr>
								<td>Name:</td>
								<td>${user.firstName} ${user.lastName}</td>
							</tr>
							<tr>
								<td>E-mail:</td>
								<td>${user.email}</td>
							</tr>			
						</table> --%>
					</div>
           		</div>
       		 </div>
    	</div>
    	</div>
    <!-- /.container -->

    <div class="container">

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; DevOps@Deloitte demo</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</body>

</html>
