package ru.stanovihin.rest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.stanovihin.rest.model.RouteRequest;
import ru.stanovihin.rest.model.RouteResponse;
import ru.stanovihin.rest.service.RoutingService;

@RestController
public class MainController {

    private RoutingService routingService;

    public MainController(RoutingService routingService){

    }

    @PostMapping("/getRoute")
    public RouteResponse calculateRoute(@RequestBody RouteRequest routeRequest){
        RouteResponse response = null;
        System.out.println(routeRequest);
        return response;
    }
}
