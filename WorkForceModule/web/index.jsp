<%@ page import="com.workforce.hr.system.EmployeeMap" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: siddique
  Date: 7/20/15
  Time: 6:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Workforce System</title>
    <style>
        body {
            background: #abcdef;
        }
    </style>
</head>
<body>
<h1>Welcome to HR System!</h1>
<br/>
<%
    Date date = new Date();
    out.println("Current date & time is " + date + "<br/>");
    EmployeeMap.setupEmployees();
    int employeeCount = EmployeeMap.employeeMap.size();
%>
<h3>Total number of employees : <%= employeeCount%></h3>
</body>
</html>
