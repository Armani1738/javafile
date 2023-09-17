import ChibuzorAssignment.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
   @Test

    public void testthatMoneyExist() {
      //  Given that we have an account
        Money armani= new Money();
        //when
         assertNotNull(armani);
    }
    @Test
    public void testMoneyCanDeposit(){
       //Given
        Money armani = new Money();
        //when
        armani.deposit(6000);
        //expected;
        assertEquals(6000, armani.checkBalance());

    }
    @Test
    public void testMoneyCanWithdraw(){
       //Given
        Money armani = new Money();
        //When
        armani.Withdraw(2500);
        //expected
        assertEquals(3500, armani.checkBalance());
  }
@Test
    public void testCheckBalance(){
       //Given
    Money armani = new Money();
    // When
    armani.deposit(1000);
    armani.checkBalance();
    System.out.println(armani.checkBalance());
    assertEquals(1000,armani.checkBalance());
}

}
