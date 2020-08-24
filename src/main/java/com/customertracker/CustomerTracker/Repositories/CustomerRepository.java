package com.customertracker.CustomerTracker.Repositories;

import com.customertracker.CustomerTracker.Models.Customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This interface represents the CRUD operations that will be done on the Customer model, the CRUD
 * operations are extended from the CrudRepository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {


}
