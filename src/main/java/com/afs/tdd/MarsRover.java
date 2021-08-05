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
        else if ("R".equals(command))
        {
            turnRight();
        }

    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if("N".equals(roverStatus.getDirection())) {
            if ("N".equals(direction)) {
                newDirection = "E";
            } else if ("E".equals(direction)) {
                newDirection = "S";
            } else if ("W".equals(direction)) {
                newDirection = "N";
            }
        }
        else if ("S".equals(roverStatus.getDirection()))
        {
            if ("E".equals(direction)) {
                newDirection = "S";
            } else if ("W".equals(direction)) {
                newDirection = "N";
            } else if ("S".equals(direction)) {
                newDirection = "W";
            }
        }

        roverStatus = new RoverStatus(locationX,locationY, newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if("N".equals(roverStatus.getDirection())) {
            if ("N".equals(direction)) {
                newDirection = "W";
            } else if ("E".equals(direction)) {
                newDirection = "N";
            } else if ("W".equals(direction)) {
                newDirection = "S";
            }
        }
        else if ("S".equals(roverStatus.getDirection()))
        {
            if ("E".equals(direction)) {
                newDirection = "N";
            } else if ("W".equals(direction)) {
                newDirection = "S";
            } else if ("S".equals(direction)) {
                newDirection = "E";
            }
        }
        else if ("E".equals(roverStatus.getDirection()))
        {
            if ("N".equals(direction)) {
                newDirection = "W";
            } else if ("E".equals(direction)) {
                newDirection = "N";
            } else if ("S".equals(direction)) {
                newDirection = "E";
            }
        }

        roverStatus = new RoverStatus(locationX,locationY, newDirection);

    }

    private void move() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        if("N".equals(roverStatus.getDirection())) {
            roverStatus = new RoverStatus(locationX, locationY + 1, direction);
        }
        else if("S".equals(roverStatus.getDirection())) {
            roverStatus = new RoverStatus(locationX, locationY -1, direction);
        }
        else if("E".equals(roverStatus.getDirection())) {
            roverStatus = new RoverStatus(locationX + 1, locationY , direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
