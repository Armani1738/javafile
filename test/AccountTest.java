import ChibuzorAssignment.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void anAccountCanBeCreated(){
        Account armaniAccount = new Account(200, "Armani", "1234567890","1234");
        assertNotNull(armaniAccount);
    }
    @Test
    public void depositTest(){
        //given that
        Account armaniAccount = new Account(200, "Armani", "1234567890","1234");
        //when
        armaniAccount.deposit(200);
        //expect
        assertEquals(400, armaniAccount.checkbalance());

    }
    @Test
    public void testDepositLessThan1(){
        //given that
        Account armaniAccount = new Account(200, "Armani", "1234567890","1234");
        //when
        armaniAccount.deposit(-1);
        //expect
        assertEquals(200, armaniAccount.checkbalance());

    }
    @Test
    void testAccountCanWithdraw(){
        //given that
        Account armaniAccount = new Account(200, "Armani", "1234567890","1234");
        //when
        armaniAccount.deposit(200);
        //when
        armaniAccount.withdrawal(100);
        //expect
        assertEquals(400, armaniAccount.checkbalance());
    }
    @Test
    void testWithdrawWhenDepositedTwice(){
        //given that
        Account armaniAccount = new Account(200, "Armani", "1234567890","1234");
        //when
        armaniAccount.deposit(5000);
        //when
        armaniAccount.deposit(4000);
        //when
        armaniAccount.withdrawal(4500);
        //expect
        assertEquals(9200, armaniAccount.checkbalance());
    }
    @Test
    void testCannotWithdrawAboveBalance(){
        //given that
        Account armaniAccount = new Account(200, "Armani", "1234567890","1234");
        //when
        armaniAccount.deposit(300);
        //when
        armaniAccount.withdrawal(400);
        //expect
        assertEquals(500, armaniAccount.checkbalance());

    }
}