package com.customertracker.CustomerTracker.Controllers;

import com.customertracker.CustomerTracker.Models.Customer;
import com.customertracker.CustomerTracker.Services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class represents the controller for CustomerService that allows a user to do operations on
 * the database though the API provided by the controller.
 */
@RestController
//Specify the specific website here instead of the general *.
@CrossOrigin(origins = "*")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  /**
   * This method provides an API for a user to create a Customer entry in the applicable database
   * through a PostMapping.
   *
   * @param customer a Customer object that will be stored in the database.
   * @return a Customer object that was added to the database.
   */
  @PostMapping("api/customer")
  public Customer createCustomer(@RequestBody Customer customer){
    return customerService.createCustomer(customer);
  }

  /**
   * This method provides an API for a user to find all Customer entries stored in the applicable
   * database, does this through a GetMapping.
   *
   * @return a List object containing Customer objects that represent all the stored Customers in
   * the database.
   */
  @GetMapping("/api/customers")
  public List<Customer> findAllCustomers() {
    return customerService.findAllCustomers();
  }

  /**
   * This method provides an API for a user to find a specific Customer entry, according to the
   * passed identification number, stored in the applicable database, does this through a
   * GetMapping.
   *
   * @param cid an Integer representing the identification number for the customer to be retrieved.
   * @return a Customer object that has the passed identification number.
   */
  @GetMapping("/api/customer/{cid}")
  public Customer findCustomerById(@PathVariable Integer cid){
    return customerService.findCustomerById(cid);
  }


  /**
   * This method provides an API for a user to delete a specific Customer entry, according to the
   * passed identification number, does this through a DeleteMapping.
   *
   * @param cid an Integer representing the identification number for the customer to be deleted.
   * @return a int representing 1 for a successful deletion or 0 for unsuccessful.
   */
  @DeleteMapping("/api/customer/{cid}")
  public int deleteCustomerById(@PathVariable Integer cid) {
    return customerService.deleteCustomer(cid);
  }
}
