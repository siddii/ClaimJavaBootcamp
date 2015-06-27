package com.workforce.hr.domains;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by siddique on 6/19/15.
 */
public class Department {

    private String name;

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();


    public Department(String name) {
       this.name = name;
    }

    public void addEmployee (Employee employee) {
        employees.add(employee);
    }


    public void runPayroll() {
        //TODO: Work In Progress (WIP)
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Running payroll for the department " + name + " ...");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        for (Employee employee: employees) {
            System.out.println("------------------------------------------------");
            System.out.println("Employee Id = " + employee.getId());
            System.out.println("Is Manager = " + (employee instanceof Manager));
            System.out.println("First Name = " + employee.getFirstName());
            System.out.println("Last Name = " + employee.getLastName());
            System.out.println("Years of experience = " + employee.yearsOfExperience());
            double baseSalary = employee.getSalary();
            System.out.println("Base Salary  = " + currencyFormat.format(baseSalary));
            double bonus = employee.calculateBonus();
            System.out.println("Bonus = " + currencyFormat.format(bonus));
            double totalSalary = baseSalary + bonus;
            System.out.println("Total = " + currencyFormat.format(totalSalary));
            System.out.println("------------------------------------------------\n");
        }
    }
}
