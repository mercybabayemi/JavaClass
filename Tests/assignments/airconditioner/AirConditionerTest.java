package assignments.airconditioner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class AirConditionerTest {

    @Test
    public void testThatAc_isOnEqualsFalse_whichMeanItIsOff() {
            AirConditioner ac = new AirConditioner();
            assertFalse(ac.getIsOn());
        }

        @Test
        public void testThatAc_isOnEqualsTrue() {
            AirConditioner ac = new AirConditioner();
            assertFalse(ac.getIsOn());
            ac.setOn(true);
            assertTrue(ac.getIsOn());
        }

        @Test
        public void testThatAc_isOnEqualsFalseWhenAcIsTurnedOff() {
            AirConditioner ac = new AirConditioner();
            assertFalse(ac.getIsOn());
            ac.setOn(true);
            assertTrue(ac.getIsOn());
            ac.setOn(false);
            assertFalse(ac.getIsOn());
        }

        @Test
        public void testThatAc_temperatureIncreasesWhenAcIsTurnedOn() {
            AirConditioner ac = new AirConditioner();
            ac.increaseTemperature(true, 20);
            assertEquals(20, ac.getTemperature());
        }

        @Test
        public void testThatAc_temperatureDecreasesWhenAcIsTurnedOff() {
            AirConditioner ac = new AirConditioner();
            ac.decreaseTemperature(true, 28);
            assertEquals(28, ac.getTemperature());
        }

        @Test
        public void testThatAc_temperatureDoesNotIncreaseWhenAcIsIncreasedPast_16() {
            AirConditioner ac = new AirConditioner();
            ac.increaseTemperature(true, 15);
            assertEquals(16, ac.getTemperature());
        }

        @Test
        public void testThatAc_temperatureDoesNotDecreaseWhenAcIsDecreasedPast_30() {
            AirConditioner ac = new AirConditioner();
            ac.decreaseTemperature(true, 32);
            assertEquals(30, ac.getTemperature());
        }

}