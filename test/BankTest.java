import ChibuzorAssignment.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    @Test
    public void testThatTheAccountExist() {
//        Given we have an Bank
        Bank armani = new Bank();
//        when an account exist
        assertNotNull(armani);

    }

    @Test
    public void testThatAnAccountCanDeposit() {
      //Given that we have an Bank
        Bank armani = new Bank();
        //When i deposit 4000
        armani .deposit(4000);
       //Expect balance is 4000
        assertEquals(4000, armani .checkBalance());
    }
    @Test
    public void testThatAccountCanDepositTwice(){
      //  Given
        Bank armani = new Bank();
        // when i deposit
        armani .deposit(2500);
        armani .deposit(2500);
        armani .deposit(2500);
        armani .deposit(2500);
        //Expect balance is 10000
        assertEquals(10000, armani .checkBalance());
    }
    @Test
    public void testThatAccountCanPerformWithdrawal() {
        Bank armani  = new Bank();
        armani .withdraw(3000);
        //Expected
        assertEquals(-3000, armani.checkBalance());

    }
}