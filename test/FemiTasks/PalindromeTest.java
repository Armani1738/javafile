package FemiTasks;


import org.junit.jupiter.api.Test;

import static FemiTasks.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testisPalindrome(){
        String name = "madam";
        boolean result = isPalindrome(name);
        assertTrue(result);
    }
    @Test
    public void testAnagam(){


    }

}