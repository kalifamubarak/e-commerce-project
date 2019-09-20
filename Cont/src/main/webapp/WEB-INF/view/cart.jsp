<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>details of the price</title>

</head>
<body>
<h1><center>AMOUNT TO THUNDER</center></h1>
<div class="menu bar">
<ul>
   <li> <a href="userhome" class="btn btn-info" role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">userhome</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    
    
 
  </ul>
</div>
<c:url value="/resources/images/" var="image"/>
  <table>
   
   <c:forEach items="${cartlist}" var="cart">
     <tr>
        <td>
           ${cart.id}
           <img src="${image}${cart.productid}.jpg" height="100px" width="100px"/>
         </td> 
          <td>
            ${cart.price}
          </td>
          <td>
          <a href='deletecart?id=${cart.id}'>delete</a>
          </td>
      </tr>
   </c:forEach>
   Total amount ${carttotal}
</table>
<c:url value="payment" var="payment"/>
<a href="${payment}">payment</a>
</body>
</html>