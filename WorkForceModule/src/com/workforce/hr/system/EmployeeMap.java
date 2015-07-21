package com.workforce.hr.system;

import java.util.HashMap;

/**
 * Created by siddique on 7/20/15.
 */
public class EmployeeMap {

    public static HashMap<Integer, Employee> employeeMap = null;


    public static void setupEmployees() {
        employeeMap = new HashMap<Integer, Employee>();
        int id = employeeMap.size();
        employeeMap.put(++id, new Employee("John", "Doe", "555-55-5555"));
        employeeMap.put(++id, new Employee("Johny", "Doe", "555-55-5556"));
        employeeMap.put(++id, new Employee("Bob", "Doe", "555-55-5557"));
        employeeMap.put(++id, new Employee("Bobby", "Doe", "555-55-5558"));
    }

    public static void addEmployee(Employee employee) {
        int id = employeeMap.size();
        employeeMap.put(++id, employee);
    }
}
