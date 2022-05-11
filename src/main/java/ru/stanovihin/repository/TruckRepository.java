package ru.stanovihin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stanovihin.model.database.Truck;

public interface TruckRepository extends JpaRepository<Truck, Long> {
}
