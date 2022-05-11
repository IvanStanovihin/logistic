package ru.stanovihin.model.database;

import ru.stanovihin.model.database.Truck;

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
