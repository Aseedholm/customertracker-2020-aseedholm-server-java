package com.customertracker.CustomerTracker.Repositories;

import com.customertracker.CustomerTracker.Models.Account;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * This interface represents the CRUD operations that will be done on the Account model, the CRUD
 * operations are extended from the CrudRepository.
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
  /**
   * This method returns all Accounts stored in the database according to the Customer information
   * passed.
   *
   * @param cid an Integer representing the Customer's ID.
   * @return a list of all accounts for the Customer.
   */
  @Query("SELECT account FROM Account account WHERE account.customer.id=:cid")
  List<Account> findAccountsByCustomerId(@Param("cid") Integer cid);

}
