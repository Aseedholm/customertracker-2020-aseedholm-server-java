package com.customertracker.CustomerTracker.Repositories;

import com.customertracker.CustomerTracker.Models.Customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * This interface represents the CRUD operations that will be done on the Customer model, the CRUD
 * operations are extended from the CrudRepository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

  @Query("SELECT customer FROM Customer customer")
  List<Customer> findAllCustomers();

  @Query("SELECT customer FROM Customer customer where customer.id=:cid")
  Customer findCustomerById(@Param("cid") Integer cid);

}
