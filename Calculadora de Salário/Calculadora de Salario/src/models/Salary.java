package models;

public class Salary {

    private Employee employee;

    public Salary(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        double salary = employee.getBaseSalary();

        switch(employee.getRole()){
            case "DESENVOLVEDOR":
                if(salary > 3000){
                    salary = salary * 0.8;
                }else{
                    salary = salary * 0.9;
                }
                break;
            case "DBA":
                if(salary > 2000){
                    salary = salary * 0.75;
                }else{
                    salary = salary * 0.85;
                }
                break;
            case "TESTADOR":
                if(salary > 2000){
                    salary = salary * 0.75;
                }else{
                    salary = salary * 0.85;
                }
                break;
            case "GERENTE":
                salary = salary * 0.7;
                break;

        }

        return salary;
    }
    
}