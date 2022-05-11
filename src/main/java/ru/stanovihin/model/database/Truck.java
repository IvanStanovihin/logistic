package ru.stanovihin.model.database;

import com.carrotsearch.hppc.HashOrderMixing;

import javax.persistence.*;

@Entity
@Table(name = "truck")
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double maxWeight;

    @Column
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
