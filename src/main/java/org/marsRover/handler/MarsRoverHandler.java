package org.marsRover.handler;

import org.marsRover.MarsRover;
import org.marsRover.action.BaseAction;
import org.marsRover.common.CommandEnum;
import org.marsRover.common.DirectionEnum;

public class MarsRoverHandler {

    public static void executeCommand(MarsRover marsRover, String command) {
        CommandEnum commandEnum = CommandEnum.valueOf(command);
        DirectionEnum directionEnum = DirectionEnum.valueOf(marsRover.getDirection());
        BaseAction action = BaseAction.getAction(directionEnum);
        action.execute(marsRover, commandEnum);
    }
}
