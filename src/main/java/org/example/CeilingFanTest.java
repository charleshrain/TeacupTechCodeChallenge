package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CeilingFanTest {

    private CeilingFan fan;

    @BeforeEach
    public void setUp() {
        fan = new CeilingFan();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, fan.getSpeed(), "Initial speed should be 0 (off)");
        assertEquals("Clockwise", fan.getDirection(), "Initial direction should be clockwise");
    }

    @Test
    public void testSpeedCordPull() {
        fan.pullSpeedCord();
        assertEquals(1, fan.getSpeed(), "Speed should be 1 after one pull");

        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed(), "Speed should be 2 after two pulls");

        fan.pullSpeedCord();
        assertEquals(3, fan.getSpeed(), "Speed should be 3 after three pulls");

        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed(), "Speed should return to 0 after pulling on speed 3");
    }

    @Test
    public void testDirectionCordPull() {

        fan.pullDirectionCord();
        assertEquals("Counterclockwise", fan.getDirection(), "Direction should be counterclockwise after one pull");

        fan.pullDirectionCord();
        assertEquals("Clockwise", fan.getDirection(), "Direction should return to clockwise after another pull");
    }

    @Test
    public void testSpeedAndDirectionTogether() {

        fan.pullSpeedCord();

        fan.pullDirectionCord();
        assertEquals(1, fan.getSpeed(), "Speed should be 1 after one speed pull");
        assertEquals("Counterclockwise", fan.getDirection(), "Direction should be counterclockwise after one direction pull");

        fan.pullSpeedCord();
        assertEquals(2, fan.getSpeed(), "Speed should be 2 after two speed pulls");
        assertEquals("Counterclockwise", fan.getDirection(), "Direction should remain counterclockwise");

        fan.pullSpeedCord();

        fan.pullDirectionCord();
        assertEquals(3, fan.getSpeed(), "Speed should be 3 after three speed pulls");
        assertEquals("Clockwise", fan.getDirection(), "Direction should be clockwise after another direction pull");

        fan.pullSpeedCord();
        assertEquals(0, fan.getSpeed(), "Speed should return to 0 after four speed pulls");
    }
}
