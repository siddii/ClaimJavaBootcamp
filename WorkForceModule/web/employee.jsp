<%@ page import="com.workforce.hr.system.Employee" %>
<%@ page import="com.workforce.hr.system.EmployeeMap" %>
<%--
  Created by IntelliJ IDEA.
  User: siddique
  Date: 7/20/15
  Time: 7:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Information</title>
</head>
<body>

<h1>Employee Information</h1>

<%
    String employeeId = request.getParameter("id");
    System.out.println("EmployeeMap.employeeMap = " + EmployeeMap.employeeMap);
    Employee employee = EmployeeMap.employeeMap.get(Integer.parseInt(employeeId));
%>

<% if (employee == null) {
    %>
    <h2>No employee found!</h2>
<%
}
else {
%>

<table>
    <tr>
        <td>First Name:</td>
        <td><%= employee.getFirstName()%>
        </td>
    </tr>
    <tr>
        <td>Last Name:</td>
        <td><%= employee.getLastName()%>
        </td>
    </tr>
    <tr>
        <td>SSN:</td>
        <td><%= employee.getSSN()%>
        </td>
    </tr>
</table>
<%
    }
%>
</body>
</html>
