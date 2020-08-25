package com.customertracker.CustomerTracker.Daos;

import com.customertracker.CustomerTracker.Models.Customer;

import java.util.List;
/**
 * */
public interface CustomerDao {
  /**
   * This method creates a Customer model object that is to be stored in a database, based on the
   * passed in Customer object. Then returns the created Customer object.
   *
   * @param customer a Customer class object.
   * @return the Customer class objected that was created.
   */
  Customer createCustomer(Customer customer);

  /**
   * This method returns all Customers present in the database.
   *
   * @return a list of all Customers in the database. If no Customers are present in the database,
   * null is returned.
   */
  List<Customer> findAllCustomers();

  /**
   * This method returns a specific Customer according to their unique ID.
   *
   * @param id an Integer representing the ID of the Customer to be returned.
   * @return a Customer object that has the corresponding id, if no Customer is found null will be
   * returned.
   */
  Customer findCustomerById(Integer id);

  /**
   * This method updates a Customer's information stored in the database, if the passed Customer is
   * not found in the database, a new entry is made.
   *
   * @param customer a Customer object that contains the updated information that is to be added to
   *                 the database.
   * @return a Customer object that has been updated.
   */
  Customer updateCustomer(Customer customer);

  /**
   * This method deletes a pre-existing Customer from the database. It returns a 1 upon successful
   * deletion and a 0 upon a failed deletion.
   *
   * @param id an Integer representing the ID of the Customer to be deleted.
   * @return a Integer representing if the deletion was successful or not, 1 for successful or 0 for
   * the id not being found and no deletion occurring.
   */
  int deleteCustomer(Integer id);
}
