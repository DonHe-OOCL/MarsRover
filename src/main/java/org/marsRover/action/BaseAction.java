package org.marsRover.action;

import org.marsRover.MarsRover;
import org.marsRover.common.CommandEnum;

public abstract class BaseAction {

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
        }
    }

    public abstract void turnLeft(MarsRover marsRover);

    public abstract void turnRight(MarsRover marsRover);

    public abstract void forward(MarsRover marsRover);
}
