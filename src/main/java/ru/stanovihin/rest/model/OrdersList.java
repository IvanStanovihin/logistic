package ru.stanovihin.rest.model;

import ru.stanovihin.model.Order;

import java.util.ArrayList;

public class OrdersList {

    private ArrayList<Order> groupOrder;
    private Double summaryWeight;

    public OrdersList(){
        this.groupOrder = new ArrayList<>();
        this.summaryWeight = 0.0;
    }

    public OrdersList(ArrayList<Order> groupOrder, Double summaryWeight) {
        this.groupOrder = groupOrder;
        this.summaryWeight = summaryWeight;
    }

    public void addOrder(Order order){
        groupOrder.add(order);
        this.summaryWeight+=order.getCargoWeight();
    }

    public ArrayList<Order> getGroupOrder() {
        return groupOrder;
    }

    public void setGroupOrder(ArrayList<Order> groupOrder) {
        this.groupOrder = groupOrder;
    }

    public Double getSummaryWeight() {
        return summaryWeight;
    }

    public void setSummaryWeight(Double summaryWeight) {
        this.summaryWeight = summaryWeight;
    }

    @Override
    public String toString() {
        return "\nOrdersList{" +
                "groupOrder=" + groupOrder +
                ", summaryWeight=" + summaryWeight +
                '}';
    }
}
