package com.customertracker.CustomerTracker.Services;

import com.customertracker.CustomerTracker.Daos.CustomerDao;
import com.customertracker.CustomerTracker.Models.Customer;
import com.customertracker.CustomerTracker.Repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements CustomerDao {
  List<Customer> customerList = new ArrayList<Customer>();

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
  public Customer updateCustomer(Customer customer) {
    return customerRepository.save(customer);
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

  public Iterable<Customer> list() {
    return customerRepository.findAll();
  }

  public Iterable<Customer> save(List<Customer> customers) {
    return customerRepository.saveAll(customers);
  }
}
