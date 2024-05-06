import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class RangeInputTest {
    RangeInput personTemperature1, personTemperature2, driverTemperature;
    @BeforeEach
    void setUp() {
        personTemperature1 = new RangeInput(0, 100);
        personTemperature2 = new RangeInput(20, 40);
        driverTemperature = new RangeInput();
    }

    @Test
    void setPersonTemperature1() {
        personTemperature1.up();
        personTemperature1.up();
        personTemperature1.up();
        assertEquals(53, personTemperature1.getCurrentTemperature());
        personTemperature1.up();
        personTemperature1.down();
        personTemperature1.down();
        personTemperature1.down();
        assertEquals(51, personTemperature1.getCurrentTemperature());
    }

    @Test
    void setPersonTemperature2() {
        personTemperature2.up();
        personTemperature2.up();
        personTemperature2.up();
        assertEquals(33, personTemperature2.getCurrentTemperature());
        personTemperature2.up();
        personTemperature2.down();
        personTemperature2.down();
        personTemperature2.down();
        assertEquals(31, personTemperature2.getCurrentTemperature());
    }

    @Test
    void setDriverTemperature() {
       driverTemperature.up();
        driverTemperature.up();
        driverTemperature.up();
        assertEquals(73,driverTemperature.getCurrentTemperature());
    }
}