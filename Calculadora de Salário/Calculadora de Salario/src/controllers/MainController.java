package controllers;

import models.Employee;
import models.Salary;

public class MainController {

    static public Salary calculateSalary(String name, String email, double baseSalary, String role) {
        Employee employee = new Employee(name, email, baseSalary, role);
        Salary salary = new Salary(employee);

        return salary;
    }
    
}
