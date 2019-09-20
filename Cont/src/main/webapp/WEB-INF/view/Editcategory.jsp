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
<f:form method="post" action="updatecategory" modelAttribute="addcategory">
<table>
<tr>
<td>
<f:input path="id" value="${currcategory.id}"/>

</td>
<td>
Enter Category name
</td>
<td>
<f:input path="categoryName" value="${currcategory.categoryName}"/>
</td>
</tr>
</table>
<tr>
<td>
<input type="submit" value="save"/>
</td>
</tr>

</f:form>
</body>
</html>