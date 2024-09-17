package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CeilingFan fan = new CeilingFan();
        System.out.println("Initial speed: " + fan.getSpeed() + ", direction: " + fan.getDirection());

        fan.pullSpeedCord();
        System.out.println("Speed after pull 1: " + fan.getSpeed() + ", direction: " + fan.getDirection());

        fan.pullSpeedCord();
        System.out.println("Speed after pull 2: " + fan.getSpeed() + ", direction: " + fan.getDirection());

        fan.pullDirectionCord();
        System.out.println("Speed: " + fan.getSpeed() + ", direction after direction pull: " + fan.getDirection());

        fan.pullSpeedCord();
        System.out.println("Speed after pull 3: " + fan.getSpeed() + ", direction: " + fan.getDirection());

    }
}