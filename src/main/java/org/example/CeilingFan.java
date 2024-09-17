package org.example;

public class CeilingFan {
    private int speed;
    private boolean directionClockwise;

    public CeilingFan() {
        this.speed = 0;
        this.directionClockwise = true;
    }

    public void pullSpeedCord() {
        if (speed == 3) {
            speed = 0;
        } else {
            speed++;
        }
    }

    public void pullDirectionCord() {
        directionClockwise = !directionClockwise;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDirection() {
        return directionClockwise ? "Clockwise" : "Counterclockwise";
    }
}
