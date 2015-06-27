package com.workforce.hr.payroll;

import com.workforce.hr.domains.*;

/**
 * Created by siddique on 6/20/15.
 */
public class PayrollProcessor {


    private Department setupEmployees() {

        //Setup employees for marketing department
        Department department = new Department("Marketing");


        Employee employee1 = new Employee(1, "John", "Marketing");

        Employee employee2 = new Employee(2, "John", "Marketing");


        Manager marketingManager = new Manager(100, "Marketing", "Manager");

        return department;
    }

    public static void main(String[] args) {
        PayrollProcessor payrollProcessor = new PayrollProcessor();
        payrollProcessor.setupEmployees();
    }


}
