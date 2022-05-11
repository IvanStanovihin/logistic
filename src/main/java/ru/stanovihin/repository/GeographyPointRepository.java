package ru.stanovihin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stanovihin.model.database.GeographyPoint;

public interface GeographyPointRepository extends JpaRepository<Long, GeographyPoint> {
}
