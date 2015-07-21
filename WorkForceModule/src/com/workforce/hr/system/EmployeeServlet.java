package com.workforce.hr.system;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by siddique on 7/20/15.
 */
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Adding Employee...");


        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String ssn = request.getParameter("ssn");

        Employee employee = new Employee(firstName, lastName, ssn);

        EmployeeMap.addEmployee(employee);

        System.out.println("com.workforce.hr.system.EmployeeServlet.doPost");

        response.getWriter().println("<h1>Employee has been successfully added!</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Looking for employee.. eh?");
    }
}
