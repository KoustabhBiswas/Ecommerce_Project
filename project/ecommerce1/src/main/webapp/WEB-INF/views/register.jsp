<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.btn{
	box-shadow:4px 4px 6px grey;
	margin-right: 10%; 
	padding-right: 25px; 
	padding-left: 25px; 
	background-color: green;
	color: white;
}
.btn:hover{
	box-shadow:2px 2px 4px grey;
	background-color: blue;
}
</style>
</head>
<body>
<div class="container-fluid">
	<%@ include file="shared/navbar.jsp" %>
	<div class="row" >

  		<div class="col-md-6" style="margin-left: 25%; ">
  				<div><p style="color: red; margin-left: 40%; font-size: 24px; text-shadow: 3px 3px 5px grey; ">Register</p></div>

  			<form:form action="userSubmit" modelAttribute="registration" method="post" class="form-group">
  				<div class="form-group">
  				<form:input type="hidden" path="userId" />
  					<form:label path="userName">Your name:</form:label><span style="color: red">*</span>
  					<form:input type="text" name="uname" path="userName" class="form-control" placeholder="Enter Your name" />
  				</div>

  				<div class="form-group">
  					<form:label path="emailId">Email:</form:label><span style="color: red">*</span>
  					<form:input type="text" path="emailId" class="form-control" placeholder="Enter Your Email" />
  				</div>

  				<div class="form-group">
  					<form:label path="contactNo">Contact No:</form:label><span style="color: red">*</span>
  					<form:input type="text" path="contactNo" class="form-control" placeholder="Enter Your Address" />
  				</div>

  				<div class="form-group">
  					<form:label path="role">Role:</form:label><span style="color: red">*</span>
  					<form:input type="text" path="role" class="form-control" placeholder="Enter Your Phone Number" />
  				</div>

  				 

  				<div style="margin-left: 30% ">
  					<input type="reset" value="Reset" class="btn" style="">
  				
  					<input type="submit" value="Sighn Up" class="btn" style="  padding-right: 25px; padding-left: 25px;">
  				</div>

  			</form:form>
  			
  		</div>
  		
  	</div>
  	</div>
</body>
</html>