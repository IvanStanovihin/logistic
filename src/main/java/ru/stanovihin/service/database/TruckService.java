package ru.stanovihin.service.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stanovihin.model.database.Truck;
import ru.stanovihin.repository.TruckRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TruckService {

    @Autowired
    private TruckRepository truckRepository;

    public void createTruck(Truck truck){
        truckRepository.save(truck);
    }

    public List<Truck>findAll(){
        return truckRepository.findAll();
    }


    public Truck findById(Long truckId){
        return truckRepository.findById(truckId).orElse(null);
    }
}
