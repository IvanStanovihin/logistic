package ru.stanovihin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.stanovihin.model.database.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
