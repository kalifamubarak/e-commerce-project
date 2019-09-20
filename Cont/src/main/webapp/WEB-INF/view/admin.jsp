<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WELCOME TO ADMIN PAGE.....!!!</title>
<style>
nav {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}
a {
  float: left;
}


 a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

 a:hover {
  background-color: #111;
}
  

</style>
</head>

<body>
<li> <a href="logout" class="btn btn-info" role="button"><span class="glyphicon glyphicon-user" style="font-size:18px;">Logout</a></li>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
    
 <nav>
      <table>
       <tr>
       <td>
       <c:url value="Productdetails" var="product"/> 
      <c:url value="categorydetails" var="category"/>
       <c:url value="supplierdetails" var="supplier"/>
    <div class="product">
    <a href="${product}" >Product</a> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp 
       </td>
       </div>
       <div class="category">
       <td>
       <a href="${category}">Category</a>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
       </td>
       </div>
       <div class="supllier">
       <td>
    <a href="${supplier}">Supplier</a>&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
       </td>
       </tr>
       </div>
      </table>
   </nav>
  
  <p>
   

#Administration #Facilities Management #Vendor Management
- The single point of Management Control for FM in the client site.

- Oversee the operation, staffing, performance and development of the Facilities Management service delivery staff.

- Ensure Facility/Property Management by providing a seamless interface

- Demonstrate leadership, responsiveness and creativity.

- Understand the Facilities Management scope for the client to assign and develop specific processes and procedures in consultation GM and compliance of the processes.

- Oversee the development and management of the capital and expense budgets.

- Support the Client in the implementation of short and long-term projects.

- Develop and implement the annual management plan; accomplish key performance indicators as identified.

- Oversee compilation and deliver the appropriate monthly/quarterly/annual reporting.

- Responsible for all administrative Expenses.

- Monitoring the Performance of all Service Personnel.

- Assist entire Team members ( Front Office, Help Desk, Executives,MIS Billing )

- Effectively manage the Help Desk, ensuring all the procedures processes and requirements are undertaken in a timely and effective manner.

- Undertake comprehensive re-tendering procedures for all outsourced services.

- Participate in the Emergency Evacuation procedures including Crisis Management and Business Continuity

- Develop the necessary policies and procedures required for all functions within the scope of Administrative Assistant

- Coordinate discussions with each direct report regarding goal setting, performance reviews, and career development planning and incentive/salary administration.

- Actively seek to train subordinates in all aspects of Non-technical services.

- Share best practices with the assigned owner of best practices.

- Responsible for making SLA/SOW

- Responsible for handling Travel Desk

- Responsible for maintaining the Guest Houses.

- Responsible for Medical room and multipurpose room.

- Developing and implementing building procedures and performance

- Measures to ensure Simplification and accuracy of work methods and reliability of System

- Managing the facility and regular office operations: Housekeeping Team, Regular office meeting arrangements, security, hot and cold beverages, etc.

- Security Management and Visitor management etc.

- Managing the cafeteria operations: Regular kitchen Audit, Managing Cafeteria vendor, Menu setting, Tuck shops, MIS, etc.

- Cafeteria card management.

- Vendor management and selection of vendors in accordance with the needs of the organization.

- Managing communication facility such as a mobile SIM etc.

- Horticulture management.

- Forecasting and planning the planning of departmental expenses and ensuring adherence to budgetary limits.

- Interacting with different departments for the maintenance of all the office equipment.

- Agreement renewal for different services.

   </p>
  
</body>
</html>