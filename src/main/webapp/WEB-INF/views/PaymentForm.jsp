<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Payment Form</title>
<link href="../resources/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div align="center">
		<form:form action="payment" method="post" modelAttribute="user">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Payment Form</h2></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" /></td>
					<td><form:errors path="firstName" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" /></td>
				</tr>
				
				<tr>
					<td>Address Line 1:</td>
					<td><form:input path="address1" /></td>
				</tr>
				 <tr>
					<td>Address Line 2:</td>
					<td><form:input path="address2" /></td>
				</tr>		
				<tr>
					<td>Postcode:</td>
					<td><form:input path="postcode" /></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><form:input path="city" /></td>
				</tr>
				<tr>
					<td>Card Number:</td>
					<td><form:input path="nameCard" /></td>
				</tr>
				<tr>
					<td>Name on Card:</td>
					<td><form:input path="nameCard" /></td>
				</tr>
				<tr>
					<td>Expiry Date:</td>
					<td><form:input path="expiryDate" /></td>
				</tr>
				<tr>
					<td>CVV:</td>
					<td><form:input path="securityCard" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>