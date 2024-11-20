package org.marsRover.action;

import org.marsRover.MarsRover;
import org.marsRover.common.CommandEnum;
import org.marsRover.common.DirectionEnum;

public abstract class BaseAction extends ActionConfig{

    public void execute(MarsRover marsRover, CommandEnum command) {
        switch (command) {
            case L:
                turnLeft(marsRover);
                break;
            case R:
                turnRight(marsRover);
                break;
            case M:
                forward(marsRover);
                break;
            case B:
                backward(marsRover);
                break;
        }
    }

    public abstract DirectionEnum getDirection();

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void forward(MarsRover marsRover);

    public abstract void backward(MarsRover marsRover);
}
