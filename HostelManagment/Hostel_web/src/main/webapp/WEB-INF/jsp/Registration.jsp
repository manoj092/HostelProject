<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<html>
<style>
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

input[placeholder], [placeholder], *[placeholder] {
    color: red !important;
}

/* Set a style for all buttons */
button {
    background-color: #DEB887;
    color: black;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #EEE8AA;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn {
    float: left;
    width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
.wrap{
 width: 50%;
 margin: auto; 
}
</style>
<body>
<div class="wrap">
	<h2>Registration Form</h2>
  
	<form:form method="POST" class="modal-content animate" style="border:1px solid #ccc"
		action="registrationSubmmit.do" 
		modelAttribute="Registration" autocomplete="off">
		<div class="container">
			
			<label><b>FisrtName</b></label>
			<form:input path="firstName" placeholder="Enter FirstName" />

			<label><b>LastName</b></label>
			<form:input path="lastName"  placeholder="Enter LastName" />

			<label><b>Email</b></label>
			<form:input path="emailId"  placeholder="Enter email Id" />

			<label><b>Mobile Number</b></label>
			<form:input path="mobileNumber" placeholder="Enter mobile number" />

			<label><b>Password</b></label>
			<form:password path="passwords" placeholder="Enter passwords" />


			<input type="checkbox" checked="checked"> Remember me
			<p>
				By creating an account you agree to our <a href="#">Terms &
					Privacy</a>.
			</p>

			<div class="clearfix">
				<button type="button" class="cancelbtn">Cancel</button>
				<button type="submit" class="signupbtn">Register</button>
			</div>
		</div>
	</form:form>
</div>
</body>
</html>
