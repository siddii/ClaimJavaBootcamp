<%--
  Created by IntelliJ IDEA.
  User: siddique
  Date: 7/20/15
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
<h1>Add Employee</h1>

<form method="post" action="employee">
    <table>
        <tr>
            <td>
                First Name:
            </td>
            <td>
                <input type="text" name="firstName"/>
            </td>
        </tr>
        <tr>
            <td>
                Last Name:
            </td>
            <td>
                <input type="text" name="lastName"/>
            </td>
        </tr>
        <tr>
            <td>
                SSN:
            </td>
            <td>
                <input type="text" name="ssn"/>
            </td>
        </tr>
    </table>
    <input type="submit" value="Add Employee">
    <input type="reset" value="Clear">
</form>

</body>
</html>
