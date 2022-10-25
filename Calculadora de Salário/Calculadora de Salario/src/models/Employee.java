package models;

public class Employee {

    private String name;
    private String email;
    private double baseSalary ;
    private String role;

    public Employee(String name, String email, double baseSalary, String role){
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public String getRole() {
        return this.role;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    public void setRole(String newRole) {
        this.role = newRole;
    }
    
}
