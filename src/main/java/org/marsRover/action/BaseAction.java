package org.marsRover.action;

import org.marsRover.MarsRover;

public abstract class BaseAction {

    public static BaseAction getAction(String direction) {
        return switch (direction) {
            case "N" -> new NorthAction();
            case "S" -> new SouthAction();
            case "E" -> new EastAction();
            case "W" -> new WestAction();
            default -> null;
        };
    }

    public void execute(MarsRover marsRover, String command) {
        switch (command) {
            case "L":
                turnLeft(marsRover);
                break;
            case "R":
                turnRight(marsRover);
                break;
            case "M":
                forward(marsRover);
                break;
        }
    }

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void forward(MarsRover marsRover);
}
