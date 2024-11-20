package org.marsRover.handler;

import org.marsRover.MarsRover;
import org.marsRover.action.ActionConfig;
import org.marsRover.common.CommandEnum;
import org.marsRover.common.DirectionEnum;

public class MarsRoverHandler extends ActionConfig {

    public static void initMarRover(MarsRover marsRover) {
        marsRover.setAction(actionMap.get(DirectionEnum.N));
        marsRover.updateCoordinate(0, 0);
    }

    public static void executeCommand(MarsRover marsRover, String command) {
        command.chars()
                .mapToObj(i -> (char) i)
                .forEach(c -> marsRover.getAction()
                        .execute(marsRover, CommandEnum.valueOf(String.valueOf(c))));
    }
}
