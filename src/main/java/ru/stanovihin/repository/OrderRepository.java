package ru.stanovihin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stanovihin.model.database.Order;

public interface OrderRepository extends JpaRepository<Long, Order> {
}
