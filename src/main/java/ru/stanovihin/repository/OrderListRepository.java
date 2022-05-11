package ru.stanovihin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stanovihin.model.database.OrderList;

public interface OrderListRepository extends JpaRepository<Long, OrderList> {
}
