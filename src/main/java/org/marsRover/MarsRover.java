package org.marsRover;

import org.marsRover.action.BaseAction;
import org.marsRover.common.DirectionEnum;

public class MarsRover {

    private int x;

    private int y;

    private String direction;

    public MarsRover() {
        this.x = 0;
        this.y = 0;
        this.direction = DirectionEnum.N.toString();
    }

    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
