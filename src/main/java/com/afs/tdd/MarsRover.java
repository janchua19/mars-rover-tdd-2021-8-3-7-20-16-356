package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if("M".equals(command)){
            move();
        }
        else if("L".equals(command))
        {
            turnLeft();
        }
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if("N".equals(direction)){
            newDirection = "W";
        }
        else if("E".equals(direction)){
            newDirection = "N";
        }
        else if("W".equals(direction)){
            newDirection = "S";
        }
        else if("S".equals(direction)){
            newDirection = "E";
        }

        roverStatus = new RoverStatus(locationX,locationY, newDirection);

    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        roverStatus = new RoverStatus(locationX,locationY + 1, direction);
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
