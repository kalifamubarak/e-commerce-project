<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}
li {
  float: left;
}


li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
</style>
</head>

<body>
<c:url value="userhome" var="home"/>
<div class="menu bar">
<ul>
   <li> <a href="aboutus"  role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">about us</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    
    
  <li> <a href="admin"  role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">admin</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    
     
    
     <li> <a href="login" role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">Login</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    
 
     <li> <a href="signup"  role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">Signup</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    
    
   
  </ul>
</div>
<form method="post" action="/Cont/j_spring_security_check" style="border:1px solid #ccc">
<c:url value="adduser" var="adduser"/>
<f:form method="post" modelAttribute="user" action="${adduser}">
<div class="container">
  <h2>login form</h2>
 
 
  <form action="/Cont/j_spring_security_check'" class="was-validated">
    <div class="form-group">
      <label for="uname">Username:</label>
      <input type="text" class="form-control" id="uname" placeholder="Enter username" name="j_username" required>
     
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="j_password" required>
      
    </div>
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember" required> I agree on blabla.
        
      </label>
    </div>
    <div>
    <input type='submit' value='login'/>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    </div>
   
    
    </form>
  </form>
</div>
</f:form>
</body>
</html>