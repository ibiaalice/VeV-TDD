import static org.junit.Assert.assertEquals;
import org.junit.Test;

import models.Employee;

public class EmployeeTest {
    @Test
    public void testCreateEmployee() {
        Employee employee = new Employee("Jenny", "jenny@jenny.com", 2000.0, "DESENVOLVEDOR");
        assertEquals("Jenny", employee.getName());
        assertEquals("jenny@hotmail.com", employee.getEmail());
        assertEquals(2000.0, employee.getBaseSalary());
        assertEquals("DESENVOLVEDOR", employee.getRole());
    }

    @Test
    public void testGetters() {
        Employee emp = new Employee("Mary", "mary@dba.com", 3500.0, "DBA");
        assertEquals("Mary", emp.getName());
        assertEquals("mary@dba.com", emp.getEmail());
        assertEquals(3500.0, emp.getBaseSalary());
        assertEquals("DBA", emp.getRole());
    }

    @Test
    public void testSetters() {
        Employee emp = new Employee ("John", "john@john.com", 4500.0, "GERENTE");
        emp.setName("Jude");
        emp.setEmail("jude@testador.com");
        emp.setBaseSalary(3000.0);
        emp.setRole("TESTADOR");
        assertEquals("Jude", emp.getName());
        assertEquals("jude@testador.com", emp.getEmail());
        assertEquals(3000.0, emp.getBaseSalary());
        assertEquals("TESTADOR", emp.getRole());
    }
}