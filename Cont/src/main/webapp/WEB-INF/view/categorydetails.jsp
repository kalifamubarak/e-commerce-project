<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome to category</title>
</head>
<body>
<h1><center>CATEGORY DETAILS!!!</center></h1>
<f:form method="post" action="addcategory" modelAttribute="addcategory">
<table>
<tr>
<td>
Enter category Name
</td>
<td>
<f:input path="CategoryName" value="${currcategory.CategoryName}" />
</td>

<td>
<input type='submit' value="save"/>
</td>
</tr>
</f:form>
<table border="2">
<th>
Category Name
</th>
<c:forEach items="${categorylist}" var="category">
<tr>
<td>
${category.categoryName}
</td>
<td>
<a href="categorydetails?id=${category.id}">edit</a>
</td>
<td>
<a href='deletecategory?id=${category.id}'>delete</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>