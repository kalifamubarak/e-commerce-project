<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
div
{
padding:250px;
border-radius:150px;
background-color:grey;
text-align:center;
}
</style>
<script>
var arr=[];
function validate()
{
var categoryName=document.forms["myform"]["categoryName"].value

console.log(categoryName.trim().length)

if(categoryName.trim().length==0 )
{
console.log("there is no character")
}
else
{
var user={"categoryName":categoryName}
arr.push(user)
}}
function display()
{
document.write("<table border='2'>")
document.write("<th>categoryName</th>")

for(i=0;i<arr.length;i++)
{
document.write("<tr>")
document.write("<td>")
document.write(arr[i].categoryName)
document.write("</td>")

document.write("</tr>")
}}
</script>
</head>
<body>
<h1>categoryPage</h1>
<form name="myform">
<div>
Enter the categoryName
<input type='text' name='CategoryName' placeholder='CategoryName' size='40'/><br></br>

<input type='submit' value='Proceed' onclick='validate()'/>
<input type='submit' value='Display' onclick='display()'/></div></form>
</body>
</html>