package com.workforce.hr.domains;

import java.text.NumberFormat;

/**
 * Created by siddique on 6/19/15.
 */
public class Department {

    private String name;

    private Employee employees[] = null;
    private Manager manager = null;

    private NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();


    public Department(String name) {
       this.name = name;
    }

    public void calculateBonuses() {
        //calculate bonuses of all the individuals(Employee & Manager) working for this department

    }

    public void calculateVacationDays() {
        //calculate total vacation days of all the individuals(Employee & Manager) working for this department
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void runPayroll() {
        //TODO: Work In Progress (WIP)
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Running payroll for the department " + name + " ...");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("------------------------------------------------");
            Employee employee = employees[i];
            System.out.println("Employee Id = " + employee.getId());
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
