package com.customertracker.CustomerTracker.Repositories;

import com.customertracker.CustomerTracker.Models.Account;

import org.springframework.data.repository.CrudRepository;

/**
 * This interface represents the CRUD operations that will be done on the Account model, the CRUD
 * operations are extended from the CrudRepository.
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
}
