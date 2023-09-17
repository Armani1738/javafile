import Chapter4.TaxCalculator420;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TaxCalculator420Test {
    @Test
    public void aTaxCalculatorCanBeCreated1(){
        TaxCalculator420 calculator = new TaxCalculator420();
        calculator.setSalary(30000);
        assertEquals(4500, calculator.taxRate(calculator.getSalary()));
    }
    @Test
    public void aTaxCalculatorCanBeCreated2(){
        TaxCalculator420 calculator = new TaxCalculator420();
        calculator.setSalary(30000);
        assertEquals(4500,calculator.taxRate(calculator.getSalary()));
    }
    @Test
    public void aTaxCalculatorCanBeCreated(){
        TaxCalculator420 calculator = new TaxCalculator420();
        calculator.setSalary(45000);
        assertEquals(9000, calculator.taxRate(calculator.getSalary()));
    }
}
