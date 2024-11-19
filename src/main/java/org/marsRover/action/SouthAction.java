package org.marsRover.action;

import org.marsRover.MarsRover;
import org.marsRover.common.DirectionEnum;

public class SouthAction extends BaseAction{
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setDirection(DirectionEnum.E.name());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setDirection(DirectionEnum.W.name());
    }

    @Override
    public void forward(MarsRover marsRover) {
        marsRover.setY(marsRover.getY() - 1);
    }
}
