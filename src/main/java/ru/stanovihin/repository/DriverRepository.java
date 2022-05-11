package ru.stanovihin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stanovihin.model.database.Driver;

public interface DriverRepository extends JpaRepository<Long, Driver> {
}
