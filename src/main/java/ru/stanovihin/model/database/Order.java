package ru.stanovihin.model.database;

import ru.stanovihin.model.database.GeographyPoint;

public class Order {

    private GeographyPoint point;
    private Double cargoWeight;

    public Order(GeographyPoint point, Double cargoWeight) {
        this.point = point;
        this.cargoWeight = cargoWeight;
    }

    public Order(){}

    public GeographyPoint getPoint() {
        return point;
    }

    public void setPoint(GeographyPoint point) {
        this.point = point;
    }

    public Double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "point=" + point +
                ", cargoWeight=" + cargoWeight +
                '}';
    }
}
