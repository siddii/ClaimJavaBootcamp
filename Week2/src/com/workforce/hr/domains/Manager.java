package com.workforce.hr.domains;

import java.util.ArrayList;

/**
 * Created by siddique on 6/19/15.
 */
public class Manager extends Employee {

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Manager(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    //list of employee ids who are reporting
   private ArrayList reports = new ArrayList();

    public void addEmployee(int employeeId) {
        reports.add(employeeId);
    }

    public void removeEmployee(int employeeId) {
        //remove his report
    }


    public double calculateBonus() {
        //twice the bonus value of his/her employees
        return super.calculateBonus() * 2;
    }
}
