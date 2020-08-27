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

  /**
   * This method returns all Customers stored in the database.
   *
   * @return a list of all Customers.
   */
  @Query("SELECT customer FROM Customer customer")
  List<Customer> findAllCustomers();

  /**
   * This method returns a customer object according to the customer's identification number..
   *
   * @param cid an Integer representing the customer's identification number.
   * @return a Customer object.
   */
  @Query("SELECT customer FROM Customer customer where customer.id=:cid")
  Customer findCustomerById(@Param("cid") Integer cid);

}
