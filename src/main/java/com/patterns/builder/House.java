package com.patterns.builder;

public class House {
    private int wallCount;
    private int square;
    private int countWindows;
    private String floorMaterial;

    public static class Builder{
        private House house;

        public Builder() {
            house = new House();
        }

        public Builder setWallCount(int count){
            house.setWallCount(count);
            return this;
        }

        public Builder setSquare(int count){
            house.setSquare(count);
            return this;
        }

        public Builder setCountWindows(int count){
            house.setCountWindows(count);
            return this;
        }

       /* public House build() {
            return House();
        }*/
    }

    public void setWallCount(int wallCount) {
        this.wallCount = wallCount;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setCountWindows(int countWindows) {
        this.countWindows = countWindows;
    }

    public void setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    public int getWallCount() {
        return wallCount;
    }

    public int getSquare() {
        return square;
    }

    public int getCountWindows() {
        return countWindows;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    private int countOfDoors;

    @Override
    public String toString() {
        return "house " + this.countWindows;
    }
}
