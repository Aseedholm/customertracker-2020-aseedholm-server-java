package com.customertracker.CustomerTracker.Services;

import com.customertracker.CustomerTracker.Daos.CustomerDao;
import com.customertracker.CustomerTracker.Models.Customer;
import com.customertracker.CustomerTracker.Repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the services for the Customer model. It allows the creation, deletion, and
 * reading of Customer object information from the database or to the database.
 */
@Service
public class CustomerService implements CustomerDao {

  @Autowired
  private CustomerRepository customerRepository;

  public Customer createCustomer(Customer customer) {
    return customerRepository.save(customer);
  }

  @Override
  public List<Customer> findAllCustomers() {
    return customerRepository.findAllCustomers();
  }

  @Override
  public Customer findCustomerById(Integer id) {
    return customerRepository.findCustomerById(id);
  }


  @Override
  public int deleteCustomer(Integer id) {
    try{
      customerRepository.deleteById(id);
      return 1;
    }catch (EmptyResultDataAccessException e) {
      return 0;
    }
  }

  /**
   * This method saves a passed list of Customer objects to the database.
   *
   * @param customers a List of Customer objects that will be saved in the database.
   * @return an Iterable<Customer> object.
   */
  public Iterable<Customer> save(List<Customer> customers) {
    return customerRepository.saveAll(customers);
  }
}
