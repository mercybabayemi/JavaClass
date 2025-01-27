package Assignments.AutomaticBikeScenerio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    private AutomaticBike bike;

    @BeforeEach
    void setUp() {
        bike = new AutomaticBike();
    }

    @Test
    public void test_thatBikeIsOffByDefault() {
        assertFalse(bike.isOn());
    }

    @Test
    public void test_thatBikeIsOnWhenTurnedOn() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void test_thatBikeIsOffWhenTurnedOff() {
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void testThat_bikeCannotAccelerateWhenTurnedOff() {
        bike.turnOff();
        assertFalse(bike.isOn());
        assertThrows(IllegalStateException.class, () -> bike.accelerate());
    }

    @Test
    public void testThat_bikeSpeedIncreasesWhenAccelerated() {
        bike.turnOn();
        assertTrue(bike.isOn());
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }

    @Test
    public void testThat_bikeGearUpdatesAfterAcceleration() {
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testThat_bikeCannotDecelerateWhenTurnedOff() {
        bike.turnOff();
        assertFalse(bike.isOn());
        assertThrows(IllegalStateException.class, () -> bike.decelerate());
    }

    @Test
    public void testThat_bikeSpeedDecreasesWhenDecelerated() {
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        assertEquals(6, bike.getSpeed());
        bike.decelerate();
        assertEquals(5, bike.getSpeed());
    }

    @Test
    public void testThat_bikeGearSetsToGear() {
        bike.turnOff();
        bike.setGear(3);
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testThat_bikeGearUpdatesAfterDeceleration() {
        bike.turnOn();
        bike.setGear(3);
        assertEquals(3, bike.getGear());
        assertEquals(31, bike.getSpeed());
        bike.decelerate();
        assertEquals(28, bike.getSpeed());
    }

}
