package ru.stanovihin.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.stanovihin.model.Order;
import ru.stanovihin.rest.model.RouteRequest;
import ru.stanovihin.rest.model.RouteResponse;
import ru.stanovihin.rest.service.RoutingService;
import ru.stanovihin.rest.service.WeightService;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RestController
public class MainController {


    private RoutingService routingService;
    private WeightService weightService;

    public MainController(){
    }

    @PostConstruct
    public void initializing(){
        this.routingService = new RoutingService();
        this.weightService = new WeightService();
    }

    @PostMapping("/getRoute")
    public RouteResponse calculateRoute(@RequestBody RouteRequest routeRequest){
        System.out.println("Received /getRoute request: " + routeRequest);
        RouteResponse response = null;
        Order[]rawOrders = routeRequest.getRawOrders();
        Arrays.stream(rawOrders).forEach(System.out::println);
        routingService.calculateRoute(rawOrders);
        return response;
    }
}
