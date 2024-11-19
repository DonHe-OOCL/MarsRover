package org.marsRover.action;

import org.marsRover.MarsRover;

public class SouthAction extends BaseAction{
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setDirection("E");
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setDirection("W");
    }

    @Override
    public void forward(MarsRover marsRover) {
        marsRover.setY(marsRover.getY() - 1);
    }
}