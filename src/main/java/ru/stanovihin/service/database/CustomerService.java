package ru.stanovihin.service.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stanovihin.model.database.Customer;
import ru.stanovihin.repository.CustomerRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer>findAll(){
        return customerRepository.findAll();
    }

    public Customer findById(Long customerId){
        return customerRepository.findById(customerId).orElse(null);
    }



}
