package org.marsRover;

public class Coordinate {
    private int x;

    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void initCoordinate() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
