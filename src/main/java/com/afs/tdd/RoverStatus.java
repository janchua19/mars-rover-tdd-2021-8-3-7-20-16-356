package com.afs.tdd;

public class RoverStatus {
    private final int locationX;
    private final int locationY;
    private final String direction;

    public RoverStatus(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }
}
