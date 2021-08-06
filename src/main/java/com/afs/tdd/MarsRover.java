package com.afs.tdd;

public class MarsRover {
    private RoverStatus roverStatus;

    public MarsRover(RoverStatus roverStatus) {
        this.roverStatus = roverStatus;
    }

    public void executeCommand(String command) {
        if ("M".equals(command)) {
            move();
        } else if ("L".equals(command)) {
            turnLeft();
        } else if ("R".equals(command)) {
            turnRight();
        }


    }
    public void executeCommands(String commands){
        for (char charCommand : commands.toCharArray())
        {
            executeCommand(String.valueOf(charCommand));
        }
    }

    private void turnRight() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;


            if ("E".equals(direction)) {
                newDirection = "S";
            } else if ("N".equals(direction)) {
                newDirection = "E";
            } else if ("S".equals(direction)) {
                newDirection = "W";
            }
            else if ("W".equals(direction)) {
                newDirection = "N";
            }

        roverStatus = new RoverStatus(locationX,locationY, newDirection);
    }

    private void turnLeft() {
        final int locationX = roverStatus.getLocationX();
        final int locationY = roverStatus.getLocationY();
        final String direction = roverStatus.getDirection();
        String newDirection = direction;

        if ("N".equals(direction)) {
            newDirection = "W";
        } else if ("E".equals(direction)) {
            newDirection = "N";
        } else if ("W".equals(direction)) {
            newDirection = "S";
        } else if ("S".equals(direction)) {
            newDirection = "E";
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
        else if("W".equals(roverStatus.getDirection())) {
            roverStatus = new RoverStatus(locationX - 1, locationY , direction);
        }
    }

    public RoverStatus getRoverStatus() {
        return roverStatus;
    }
}
