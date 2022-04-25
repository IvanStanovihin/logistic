package ru.stanovihin.rest.service;

import ru.stanovihin.logic.MatrixProcessor;
import ru.stanovihin.model.GeographyPoint;
import ru.stanovihin.model.Order;
import ru.stanovihin.rest.model.Driver;
import ru.stanovihin.rest.model.OrdersList;
import ru.stanovihin.rest.model.Truck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public class RoutingService {

    private MatrixProcessor matrixProcessor;
    private GreedyAlgorithmService greedyService;
    private WeightService weightService;

    public RoutingService(){
        this.matrixProcessor = new MatrixProcessor();
        this.greedyService = new GreedyAlgorithmService();
        this.weightService = new WeightService();
    }

    public ArrayList<Order> calculateRoute(Order[]rawOrder){
        ArrayList<GeographyPoint>points = new ArrayList<>();
        Arrays.stream(rawOrder).forEach(o -> points.add(o.getPoint()));
        double[][] distanceMatrix = matrixProcessor.getDistanceMatrix(points);
        MatrixProcessor.printMatrix(distanceMatrix);
        ArrayList<Order>greedyRoute = greedyService.calculateRoute(rawOrder, distanceMatrix);
        greedyRoute.stream().forEach(System.out::println);
        System.out.println("Суммарное расстояние: " + greedyService.getSummaryDistance());
        ArrayList<Driver>testDrivers = getTestDrivers();
        ArrayList<OrdersList>ordersList = weightService.splitByWeight(testDrivers, greedyRoute);
        System.out.println("Маршрутные листы разбитые по весу: ");
        Stream.of(ordersList).forEach(System.out::println);
        return greedyRoute;
    }


    private ArrayList<Driver>getTestDrivers(){
        ArrayList<Driver>testDrivers = new ArrayList<Driver>();
        Truck truck1 = new Truck(1200, "КамАз");
        Truck truck2= new Truck(1900, "БелАз");
        Driver driver1 = new Driver("Иванов", truck1);
        Driver driver2 = new Driver("Петров", truck1);
        Driver driver3 = new Driver("Сидоров", truck2);
        testDrivers.add(driver1);
        testDrivers.add(driver2);
        testDrivers.add(driver3);
        return testDrivers;
    }

}
