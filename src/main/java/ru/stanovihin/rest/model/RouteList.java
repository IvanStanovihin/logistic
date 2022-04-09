package ru.stanovihin.rest.model;

import ru.stanovihin.model.Order;

public class RouteList {

    private Order[]groupOrder;
    private Double summaryWeight;

    public RouteList(Order[] groupOrder, Double summaryWeight) {
        this.groupOrder = groupOrder;
        this.summaryWeight = summaryWeight;
    }

    public Order[] getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(Order[] groupOrder) {
        this.groupOrder = groupOrder;
    }

    public Double getSummaryWeight() {
        return summaryWeight;
    }

    public void setSummaryWeight(Double summaryWeight) {
        this.summaryWeight = summaryWeight;
    }
}
