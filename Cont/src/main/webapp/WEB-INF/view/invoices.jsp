<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script src='https://kit.fontawesome.com/a076d05399.js'></script>
<meta charset=ISO-8859-1">
<title>details of the price</title>

</head>
<body>
<h1><center>AMOUNT TO THUNDER</center></h1>
<div class="menu bar">
<ul>
   <li> <a href="userhome" class="btn btn-info" role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">userhome</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
</ul>
</div>
 <table class="table table-borderless">
   <thead class="table-dark">
   <th>name</th>
   <th><center>price</center></th>
 </thead></table>  
 <table class="table table-borderless">  
<c:forEach items="${cartlist}" var="cart">
  <tr>
         <td>
           <h3>${cart.cartid} </h3>
          <td> ${cart.price}
           </td>
      </tr>
   </c:forEach></table>
   <label><h1><center>Total amount :${carttotal}</center></h1> </label>
<c:forEach  items="${Paymentlist}" var="payment">
<label><h1><center>Shipping Address :${payment.shippingaddress}</center></h1></label><br></c:forEach>  
<center><a type="submit"  class="btn btn-primary btn-lg"  href="#">Proceed</a></center>

</body>
</html>
