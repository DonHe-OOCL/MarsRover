package org.marsRover.handler;

import org.marsRover.MarsRover;
import org.marsRover.action.ActionConfig;
import org.marsRover.action.BaseAction;
import org.marsRover.common.CommandEnum;
import org.marsRover.common.DirectionEnum;

public class MarsRoverHandler extends ActionConfig {

    public static void executeCommand(MarsRover marsRover, String command) {
        CommandEnum commandEnum = CommandEnum.valueOf(command);
        DirectionEnum directionEnum = DirectionEnum.valueOf(marsRover.getDirection());
        BaseAction action = actionMap.get(directionEnum);
        if (action == null) {
            return;
        }
        action.execute(marsRover, commandEnum);
    }
}
