package org.marsRover;

public class MarsRover {

    private int x;

    private int y;

    private String direction;

    public MarsRover() {
    }

    public String showStatus() {
        return x + ":" + y + ":" + direction;
    }

    public String executeCommand(String command) {
        String direction = this.direction;
        if (command.equals("L")) {
            direction = "W";

        } else if (command.equals("R")) {
            direction = "E";
        }
        this.direction = direction;
        return showStatus();
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
