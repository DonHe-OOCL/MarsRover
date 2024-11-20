package org.marsRover.action;

import org.marsRover.MarsRover;
import org.marsRover.common.DirectionEnum;

public class EastAction extends BaseAction {
    @Override
    public DirectionEnum getDirection() {
        return DirectionEnum.E;
    }

    @Override
    public void turnLeft(MarsRover marsRover) {
        marsRover.setAction(actionMap.get(DirectionEnum.N));
    }

    @Override
    public void turnRight(MarsRover marsRover) {
        marsRover.setAction(actionMap.get(DirectionEnum.S));
    }

    @Override
    public void forward(MarsRover marsRover) {
        marsRover.updateCoordinate(marsRover.getX() + 1, marsRover.getY());
    }

    @Override
    public void backward(MarsRover marsRover) {
        marsRover.updateCoordinate(marsRover.getX() - 1, marsRover.getY());
    }
}
