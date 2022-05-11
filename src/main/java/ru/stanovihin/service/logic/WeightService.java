package ru.stanovihin.service.logic;

import ru.stanovihin.model.database.Order;
import ru.stanovihin.model.database.Driver;
import ru.stanovihin.model.database.OrderList;

import java.util.ArrayList;

public class WeightService {


    public WeightService(){

    }

    public ArrayList<OrderList>splitByWeight(ArrayList<Driver>freeDrivers, ArrayList<Order> routeForOrders){
        ArrayList<OrderList> allOrderList = new ArrayList<>();
        ArrayList<Order>ordersForSplitting = new ArrayList<>(routeForOrders);
        ArrayList<Driver>driversForSplitting = new ArrayList<>(freeDrivers);
        int pointer = 0;
        while(ordersForSplitting.size() != 0){
            ordersForSplitting.stream().forEach(System.out::println);
            Driver currentDriver = driversForSplitting.get(0);
            driversForSplitting.remove(0);
            OrderList orderList = getOrdersList(currentDriver, ordersForSplitting);
            allOrderList.add(orderList);
        }
        return allOrderList;
    }

    private OrderList getOrdersList(Driver driver, ArrayList<Order>ordersForSplitting){
        OrderList orderList = new OrderList();
        double truckWeightLimit = driver.getTruck().getMaxWeight();
        Order currentOrder = ordersForSplitting.get(0);
        double orderWeight = currentOrder.getCargoWeight();
        double routeWeight = 0;
        while(routeWeight + orderWeight <= truckWeightLimit && ordersForSplitting.size() != 0){
            currentOrder = ordersForSplitting.get(0);
            ordersForSplitting.remove(0);
            routeWeight += orderWeight;
            orderList.addOrder(currentOrder);
            orderWeight = currentOrder.getCargoWeight();
        }
        return orderList;
    }
}
