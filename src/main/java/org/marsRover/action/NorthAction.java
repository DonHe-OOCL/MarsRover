package org.marsRover.action;

import org.marsRover.MarsRover;
import org.marsRover.common.DirectionEnum;

public class NorthAction extends BaseAction{
    @Override
    public DirectionEnum getDirection() {
        return DirectionEnum.N;
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setAction(actionMap.get(DirectionEnum.W));
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setAction(actionMap.get(DirectionEnum.E));
    }

    @Override
    public void forward(MarsRover marsRover) {
        marsRover.updateCoordinate(marsRover.getX(), marsRover.getY() + 1);
    }

    @Override
    public void backward(MarsRover marsRover) {
        marsRover.updateCoordinate(marsRover.getX(), marsRover.getY() - 1);
    }
}
