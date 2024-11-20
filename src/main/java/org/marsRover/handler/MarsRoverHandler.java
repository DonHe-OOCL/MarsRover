package org.marsRover.handler;

import org.marsRover.MarsRover;
import org.marsRover.action.ActionConfig;
import org.marsRover.action.BaseAction;
import org.marsRover.common.CommandEnum;
import org.marsRover.common.DirectionEnum;

public class MarsRoverHandler extends ActionConfig {

    public static void initMarRover(MarsRover marsRover) {
        marsRover.setAction(actionMap.get(DirectionEnum.N));
        marsRover.updateCoordinate(0, 0);
    }

    public static void executeCommand(MarsRover marsRover, String command) {
        CommandEnum commandEnum = CommandEnum.valueOf(command);
        BaseAction action = marsRover.getAction();
        action.execute(marsRover, commandEnum);
    }
}
