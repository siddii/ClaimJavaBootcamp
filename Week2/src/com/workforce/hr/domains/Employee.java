package com.workforce.hr.domains;

import java.util.Date;

/**
 * Created by siddique on 6/19/15.
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;

    private Gender gender = Gender.MALE;

    private Date dateOfBirth;
    private Date hireDate;

    private String title;

    //making this protected so instance of Manager can access to calculate bonus
    protected double salary;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName) {
        this(firstName, lastName);
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int yearsOfExperience() {
        //calculate years of experience
        //TODO: Yes, this is not a perfect calculation, come back to me later.
        return (new Date().getYear() - hireDate.getYear());
    }

    public double calculateBonus() {
        return ((salary * yearsOfExperience()) / 100) / 10;
    }

    public int age() {
        //calculate age
        return 0;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
