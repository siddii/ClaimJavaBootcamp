<%@ page import="com.workforce.hr.system.EmployeeMap" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.workforce.hr.system.Employee" %>
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
        table {
            width: 100%;
            border: 1px solid yellow;
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


<table>
<tr>
    <th>Employee Id</th>
</tr>
<%
    for (Iterator<Integer> iterator = EmployeeMap.employeeMap.keySet().iterator(); iterator.hasNext(); ) {
        Integer id = iterator.next();
        System.out.println("id = " + id);
        Employee employee = EmployeeMap.employeeMap.get(id);
        System.out.println("employee = " + employee);
        out.println("<tr><td>Employee Id: " + id +"</td></tr>");
%>
<%
    }
%>

</table>



</body>
</html>
