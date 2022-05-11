package ru.stanovihin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.stanovihin.model.database.Truck;
import ru.stanovihin.service.database.TruckService;

@RestController
@RequestMapping("/logistic")
public class EntityController {

    @Autowired
    private TruckService truckService;

    @GetMapping
    public HttpStatus getStatus(){
        return HttpStatus.OK;
    }

    @PostMapping
    public HttpStatus createTruck(@RequestBody Truck truckForSave){
        truckService.createTruck(truckForSave);
        return HttpStatus.OK;
    }
}
