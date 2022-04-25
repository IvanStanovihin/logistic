package ru.stanovihin.rest.model;

public class Driver {

    private String name;
    private Truck truck;

    public Driver(String name, Truck truck) {
        this.name = name;
        this.truck = truck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }
}
