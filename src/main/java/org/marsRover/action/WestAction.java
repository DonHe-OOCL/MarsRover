package org.marsRover.action;

import org.marsRover.MarsRover;
import org.marsRover.common.DirectionEnum;

public class WestAction extends BaseAction{
    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setDirection(DirectionEnum.S.name());
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setDirection(DirectionEnum.N.name());
    }

    @Override
    public void forward(MarsRover marsRover) {
        marsRover.setX(marsRover.getX() - 1);
    }
}
