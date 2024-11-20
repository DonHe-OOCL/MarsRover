package org.marsRover;

import org.marsRover.action.BaseAction;

public class MarsRover {

    private final Coordinate coordinate;

    private BaseAction action;

    public MarsRover() {
        coordinate = new Coordinate();
    }

    public String showStatus() {
        return String.format("%d:%d:%s", coordinate.getX(), coordinate.getY(), action.getDirection().name());
    }

    public int getX() {
        return coordinate.getX();
    }

    public int getY() {
        return coordinate.getY();
    }

    public void updateCoordinate(int x, int y) {
        coordinate.setX(x);
        coordinate.setY(y);
    }

    public void setAction(BaseAction action) {
        this.action = action;
    }

    public BaseAction getAction() {
        return action;
    }
}
