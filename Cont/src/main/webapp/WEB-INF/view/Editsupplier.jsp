<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form method="post" action="updatesupplier" modelAttribute="addsupplier">
<table>
<tr>
<td>
<f:input path="id" value="${currsupplier.id}"/>

</td>
<td>
Enter Supplier name
</td>
<td>
<f:input path="supplierName" value="${currsupplier.supplierName}" />
</td>
</tr>
<tr>
<td>
Enter Address
</td>
<td>
<f:textarea path="address" value="${currsupplier.address}" />
</td>
</tr>
</table>
<tr>
<td>
<input type="submit" value="add"/>
</td>
</tr>


</f:form>
</body>
</html>