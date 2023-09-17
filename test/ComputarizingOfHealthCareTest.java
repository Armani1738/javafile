import Chapter3.ComputarizingOfHealthCare317;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ComputarizingOfHealthCareTest {
   @Test
    void  userIsNotNull(){
       ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7, 51.2);
        assertNotNull(healthCare);
    }
    @Test
    void userGetGender(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7,51.2);
        healthCare.setGender("male");
        assertEquals("male", healthCare.getGender());
    }
    @Test
    void userdob(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq","male","August/02/2021",5.7,51.2);
        healthCare.setDob("August",10,1990);
        assertEquals("August/10/1990", healthCare.getDob());
    }
    @Test
    void userHeight(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7, 51.2);
        healthCare.setHeight(6.5);
        assertEquals(6.5, healthCare.getHeight());
    }
    @Test
    void userWeight(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7, 51.2);
        healthCare.setWeight(69.2);
        assertEquals(69.2, healthCare.getWeight());
    }
    @Test
    void userAge(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7, 51.2);
        healthCare.setAge(1992);
        assertEquals(31, healthCare.getAge());
    }
    @Test
    void userMaximiumHeartRate(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7, 51.2);
        healthCare.setMaximiumHeartRate(29);
        assertEquals(191.0, healthCare.getMaximiumHeartRate());
    }
    @Test
    void userTargetRate(){
        ComputarizingOfHealthCare317 healthCare = new ComputarizingOfHealthCare317("john", "sodiq", "male", "August/02/2021", 5.7, 51.2);
        healthCare.setMaximiumHeartRate(29);
        healthCare.setTargetRate(25);
        assertEquals(47.0, healthCare.getTargetRate());
    }
}

