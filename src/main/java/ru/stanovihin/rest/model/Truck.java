package ru.stanovihin.rest.model;

public class Truck {

    private double maxWeight;
    private String modelName;

    public Truck(double maxWeight, String modelName) {
        this.maxWeight = maxWeight;
        this.modelName = modelName;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
