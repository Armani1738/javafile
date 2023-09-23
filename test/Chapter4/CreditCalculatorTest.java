package Chapter4;

import ChibuzorAssignment.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {
    @Test
    void checkAccountNumberActive(){
        CreditCalculator calculator = new CreditCalculator();
        assertEquals(162864310, calculator.account(162864310));
    }
    @Test
    void beginningOfMonthBalance(){
        CreditCalculator calculator = new CreditCalculator();
        calculator.balance(10000);
        assertEquals(10000, calculator.balance(10000));
    }
    @Test
    void itemsChargedByMonthEnd(){
        CreditCalculator calculator = new CreditCalculator();
        calculator.balance(10000);
        calculator.monthCharge(8500);
        assertEquals(1500, calculator.monthCharge(8500));
    }
    @Test
    void creditAppliedToCustomer(){
        CreditCalculator calculator = new CreditCalculator();
        calculator. totalCreditsApplied(750);
        assertEquals(750, calculator.totalCreditsApplied(1500));
    }

}


