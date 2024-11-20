package org.marsRover.action;

import org.marsRover.common.DirectionEnum;

import java.util.HashMap;
import java.util.Map;

public class ActionConfig {
    protected static Map<DirectionEnum, BaseAction> actionMap = new HashMap<>();

    static {
        actionMap.put(DirectionEnum.N, new NorthAction());
        actionMap.put(DirectionEnum.S, new SouthAction());
        actionMap.put(DirectionEnum.W, new WestAction());
        actionMap.put(DirectionEnum.E, new EastAction());
    }
}
