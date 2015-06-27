package com.workforce.hr.payroll;

import com.workforce.hr.domains.Department;
import com.workforce.hr.domains.Employee;
import com.workforce.hr.domains.Gender;
import com.workforce.hr.domains.Manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by siddique on 6/20/15.
 */
public class PayrollProcessor {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    private Department setupEmployees() throws ParseException {
        //Setup employees for marketing department
        Department department = new Department("Marketing");

        Employee employee1 = new Employee(1, "John", "Marketing");
        employee1.setGender(Gender.MALE);
        employee1.setSalary(45000);
        employee1.setHireDate(dateFormat.parse("09/12/2000"));

        Employee employee2 = new Employee(2, "John", "Marketing");
        employee2.setGender(Gender.MALE);
        employee2.setSalary(55000);
        employee2.setHireDate(dateFormat.parse("10/12/2005"));


        Employee employee3 = new Employee(3, "Shelly", "Marketing");
        employee3.setGender(Gender.FEMALE);
        employee3.setSalary(60000);
        employee3.setHireDate(dateFormat.parse("10/12/2012"));


        Manager marketingManager = new Manager(100, "Cyndy", "Manager");
        marketingManager.setGender(Gender.FEMALE);
        marketingManager.setSalary(75000);
        marketingManager.setHireDate(dateFormat.parse("10/01/2014"));

        marketingManager.addEmployee(1);
        marketingManager.addEmployee(2);
        marketingManager.addEmployee(3);


        Employee[] employees = {employee1, employee2, employee3};

        department.setEmployees(employees);
        department.setManager(marketingManager);
        return department;
    }

    public static void main(String[] args) throws ParseException {
        PayrollProcessor payrollProcessor = new PayrollProcessor();

        //setup employees for the department
        Department department = payrollProcessor.setupEmployees();

        //run payroll report
        department.runPayroll();
    }
}
