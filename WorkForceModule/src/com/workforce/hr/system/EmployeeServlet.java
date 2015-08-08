package com.workforce.hr.system;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by siddique on 7/20/15.
 */
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Adding Employee...");


        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String ssn = request.getParameter("ssn");

        System.out.println("EmployeeMap.employeeMap BEFORE = " + EmployeeMap.employeeMap);

        int id = EmployeeMap.addEmployee(new Employee(firstName, lastName, ssn));

        System.out.println("EmployeeMap.employeeMap AFTER = " + EmployeeMap.employeeMap);

        response.getWriter().println(id);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Looking for employee.. eh?");
    }
}
