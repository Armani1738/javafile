import Chapter4.GasMileage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GasMileageTest {
@Test
    public void testGasMileage(){
    GasMileage mygas = new GasMileage();
    assertNotNull(mygas);
}
@Test
    public void testMilesDriven(){
    int myGas = GasMileage.setMilesDriven(10);
    assertEquals(10, myGas);
}
@Test
    public void testGallon(){
    int myGas = GasMileage.setGallonsTanks(25);
    assertEquals(25, myGas);
}
@Test
    public void testCalculations(){
    double myGas = GasMileage.setCalculator(25,2);
    assertEquals(12.5, myGas);

}
}
