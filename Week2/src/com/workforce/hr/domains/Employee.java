package com.workforce.hr.domains;

import java.util.Date;

/**
 * Created by siddique on 6/19/15.
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;

    //M for Male & F for Female
    private char gender;


    private Date dateOfBirth;
    private Date hireDate;


    private String title;
    private double salary;

    public Employee(String firstName, String lastName) {
        System.out.println("##### I am a 2 arg constructor");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id, String firstName, String lastName) {
        this(firstName, lastName);
        System.out.println("##### I am a 3 arg constructor");
        this.id = id;
    }


    public int yearsOfExperience() {
        //calculate years of experience
        return 0;
    }

    public int age() {
        //calculate age
        return 0;
    }

}
