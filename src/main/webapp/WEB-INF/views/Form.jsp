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
                <p class="lead">Payment</p>
					<form:form action="payment" method="post" modelAttribute="user">
				<table>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">First Name*:</h6></td>
					<td><form:input path="firstName" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="firstName" cssClass="error"></form:errors></h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Last Name1*:</h6></td>
					<td><form:input path="lastName" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="lastName" cssClass="error"></form:errors></h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">E-mail*:</h6></td>
					<td><form:input path="email" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="email" cssClass="error"></form:errors></h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Address Line 1*:</h6></td>
					<td><form:input path="address1" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="address1" cssClass="error"></form:errors></h6></div></td>
				</tr>
				 <tr>
					<td><h6 style="text-align:right; margin-right:5px;">Address Line 2:</h6></td>
					<td><form:input path="address2" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="address2" cssClass="error"></form:errors><h6></div></td>
				</tr>		
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Postcode*:</h6></td>
					<td><form:input path="postcode" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="postcode" cssClass="error"></form:errors><h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">City*:</h6></td>
					<td><form:input path="city" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="city" cssClass="error"></form:errors><h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Name on Card*:</h6></td>
					<td><form:input path="nameCard" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="nameCard" cssClass="error"></form:errors><h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Card Number*:</h6></td>
					<td><form:input path="numberCard" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="numberCard" cssClass="error"></form:errors></h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">Expiry Date*:</h6></td>
					<td><form:input path="expiryDate" /></td>
					<td><div style="margin-left:10px; color:red;"><h6><form:errors path="expiryDate" cssClass="error"></form:errors></h6></div></td>
				</tr>
				<tr>
					<td><h6 style="text-align:right; margin-right:5px;">CVV*:</h6></td>
					<td><form:input path="securityCard" /></td>
					<td><div style="margin-left:10px; color:red;"><form:errors path="securityCard" cssClass="error"></form:errors></div></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><button class="btn btn-primary" type="submit" style="margin-top:20px; width:250px;" value="Submit" />Proceed</button></td>
				</tr>
			</table>
		</form:form>
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
