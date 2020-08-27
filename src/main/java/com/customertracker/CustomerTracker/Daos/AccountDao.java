package com.customertracker.CustomerTracker.Daos;

import com.customertracker.CustomerTracker.Models.Account;

import java.util.List;

/**
 * This interface represents the Account's Data Access Object and with it the applicable methods
 * associated with the DAO.
 */

public interface AccountDao {
  /**
   * This method creates a Account model object that is to be stored in a database, based on the
   * passed in Account object. Then returns the created Account object.
   *
   * @param account an Account class object.
   * @return the Account class object that was created.
   */
  Account createAccount(Account account);

  /**
   * This method returns all Accounts present in the database.
   *
   * @return a list of all Accounts in the database. If no Accounts are present in the database,
   * null is returned.
   */
  List<Account> findAllAccounts();

  /**
   * This method returns a specific Account according to their unique ID.
   *
   * @param id an Integer representing the ID of the Account to be returned.
   * @return a Account object that has the corresponding id, if no Account is found null will be
   * returned.
   */
  Account findAccountById(Integer id);

  /**
   * This method returns all Accounts for the provided Customer ID.
   *
   * @param cid an Integer representing the ID of a Customer.
   * @return a list of Account objects belonging to the Customer.
   */
  List<Account> findAccountsByCustomerId(Integer cid);

  /**
   * This method deletes a pre-existing Account from the database. It returns a 1 upon successful
   * deletion and a 0 upon a failed deletion.
   *
   * @param id an Integer representing the ID of the Account to be deleted.
   * @return an int representing if the deletion was successful or not, 1 for successful or 0 for
   * the id not being found and no deletion occurring.
   */
  int deleteAccount(Integer id);
}
