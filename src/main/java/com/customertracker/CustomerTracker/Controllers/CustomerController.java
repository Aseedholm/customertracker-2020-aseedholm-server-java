package com.customertracker.CustomerTracker.Controllers;

import com.customertracker.CustomerTracker.Models.Customer;
import com.customertracker.CustomerTracker.Services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//Specify the specific website here instead of the general *.
@CrossOrigin(origins = "*")
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @PostMapping("api/customer")
  public Customer createCustomer(@RequestBody Customer customer){
    return customerService.createCustomer(customer);
  }

  @GetMapping("/api/customers")
  public List<Customer> findAllCustomers() {
    return customerService.findAllCustomers();
  }

  @GetMapping("/api/customer/{cid}")
  public Customer findCustomerById(@PathVariable Integer cid){
    return customerService.findCustomerById(cid);
  }

  @DeleteMapping("/api/customer/{cid}")
  public int deleteCustomerById(@PathVariable Integer cid) {
    return customerService.deleteCustomer(cid);
  }
}
