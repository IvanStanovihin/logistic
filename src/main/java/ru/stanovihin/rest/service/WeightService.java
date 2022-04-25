package ru.stanovihin.rest.service;

import ru.stanovihin.model.Order;
import ru.stanovihin.rest.model.Driver;
import ru.stanovihin.rest.model.OrdersList;

import java.util.ArrayList;
import java.util.Collections;

public class WeightService {


    public WeightService(){

    }

    public ArrayList<OrdersList>splitByWeight(ArrayList<Driver>freeDrivers, ArrayList<Order> routeForOrders){
        ArrayList<OrdersList>allOrdersList = new ArrayList<>();
        ArrayList<Order>ordersForSplitting = new ArrayList<>(routeForOrders);
        ArrayList<Driver>driversForSplitting = new ArrayList<>(freeDrivers);
        int pointer = 0;
        while(ordersForSplitting.size() != 0){
            ordersForSplitting.stream().forEach(System.out::println);
            Driver currentDriver = driversForSplitting.get(0);
            driversForSplitting.remove(0);
            OrdersList ordersList = getOrdersList(currentDriver, ordersForSplitting);
            allOrdersList.add(ordersList);
        }
        return allOrdersList;
    }

    private OrdersList getOrdersList(Driver driver, ArrayList<Order>ordersForSplitting){
        OrdersList ordersList = new OrdersList();
        double truckWeightLimit = driver.getTruck().getMaxWeight();
        Order currentOrder = ordersForSplitting.get(0);
        double orderWeight = currentOrder.getCargoWeight();
        double routeWeight = 0;
        while(routeWeight + orderWeight <= truckWeightLimit && ordersForSplitting.size() != 0){
            currentOrder = ordersForSplitting.get(0);
            ordersForSplitting.remove(0);
            routeWeight += orderWeight;
            ordersList.addOrder(currentOrder);
            orderWeight = currentOrder.getCargoWeight();
        }
        return ordersList;
    }
}
