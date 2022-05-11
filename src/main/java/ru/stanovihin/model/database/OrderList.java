package ru.stanovihin.model.database;

import ru.stanovihin.model.database.Order;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<Order> groupOrder;
    private Double summaryWeight;

    public OrderList(){
        this.groupOrder = new ArrayList<>();
        this.summaryWeight = 0.0;
    }

    public OrderList(ArrayList<Order> groupOrder, Double summaryWeight) {
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
