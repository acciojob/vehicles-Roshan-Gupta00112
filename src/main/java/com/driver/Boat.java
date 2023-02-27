package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    // Constructor
    public Boat(String name, int capacity){
        this.name=name;
        this.capacity=capacity;
    }



    // Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }




    // Methods of Interface
    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
