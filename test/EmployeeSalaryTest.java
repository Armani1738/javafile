import org.junit.jupiter.api.Test;
import Malik.Employeelist;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeSalaryTest {
    @Test
    void numbersOfEmployeesOne(){
        Employeelist employee = new Employeelist("john", 40, 50000);
        int hourlyRate = employee.salary(50000, 40);
        assertEquals(1250, hourlyRate);
    }
    @Test
    void numbersOfEmployeeTwo(){
        Employeelist employee = new Employeelist("samuel", 45,50000);
        int hourlyRate = employee.salary(75000, 45);
        assertEquals(1666, hourlyRate);
    }
    @Test
    void numberOfEmployeethree(){
        Employeelist employee = new Employeelist("semicolon", 42, 50000);
        int hourlyRate = employee.salary(75000, 42);
        assertEquals(1785, hourlyRate);
    }

}
