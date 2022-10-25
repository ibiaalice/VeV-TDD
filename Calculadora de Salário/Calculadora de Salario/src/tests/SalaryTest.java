import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import models.Employee;
import models.Salary;

public class SalaryTest {

    @Test
    public void testSalary() {
        Employee employee = new Employee("John", "Jonh@jonh.com", 1000, "DESENVOLVEDOR");
        Salary salary = new Salary(employee);

        assertEquals(900, salary.getSalary(), 0.0001);
        assertNotEquals(1000, salary.getSalary(), 0.000001);
    }

    @Test
    public void testSalaryPlus() {
        Employee employee = new Employee("John", "john@john.com", 3000.0, "DESENVOLVEDOR");

        Salary salary = new Salary(employee);
        assertEquals(2700, salary.getSalary(), 0.0001);
        assertNotEquals(3000, salary.getSalary());
    }

    @Test
    public void testSalaryDBA() {
        Employee employee = new Employee("John", "john@dba.com", 1500.0, "DBA");

        Salary salary = new Salary(employee);
        assertEquals(1275, salary.getSalary(), 0.0001);
    }

    @Test
    public void testSalaryPlusDBA() {
        Employee employee = new Employee("John", "john@dba.com", 4500.0, "DBA");
        Salary salary = new Salary(employee);

        assertEquals(3375, salary.getSalary(), 0.0001);
    }

    @Test
    public void testSalaryTester() {
        Employee employee = new Employee("John", "john@testador.com", 1500.0, "TESTADOR");
        Salary salary = new Salary(employee);

        assertEquals(1275, salary.getSalary(), 0.0001);
        assertNotEquals(1500, salary.getSalary());

    }

    @Test
    public void testSalaryPlusTester() {
        Employee employee = new Employee("John", "john@testador.com", 4500.0, "TESTADOR");

        Salary salary = new Salary(employee);
        assertEquals(3375, salary.getSalary(), 0.0001); 
        assertNotEquals(4500, salary.getSalary());
    }

    @Test
    public void testSalaryManager() {
        Employee employee = new Employee("John", "john@manager.com", 4500.0, "GERENTE");

        Salary salary = new Salary(employee);
        assertEquals(3150, salary.getSalary(), 0.0001);
        assertNotEquals(4500, salary.getSalary());
    }
    
    
}