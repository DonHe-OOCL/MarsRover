package org.marsRover.action;

import org.marsRover.MarsRover;

public class WestAction extends BaseAction{
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setDirection("S");
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setDirection("N");
    }

    @Override
    public void forward(MarsRover marsRover) {
        marsRover.setX(marsRover.getX() - 1);
    }
}
