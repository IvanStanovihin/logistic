package ru.stanovihin.rest.model;

import ru.stanovihin.model.Order;

import java.util.Arrays;

public class RouteRequest {

    private Order[] rawOrders;

    public RouteRequest(Order[] rawOrders) {
        this.rawOrders = rawOrders;
    }

    public RouteRequest(){

    }

    public Order[] getRawOrders() {
        return rawOrders;
    }

    public void setRawOrders(Order[] rawOrders) {
        this.rawOrders = rawOrders;
    }

    @Override
    public String toString() {
        return "RouteRequest{" +
                "rawOrders=" + Arrays.toString(rawOrders) +
                '}';
    }
}
