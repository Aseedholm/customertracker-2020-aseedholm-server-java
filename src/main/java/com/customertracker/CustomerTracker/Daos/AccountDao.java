package com.customertracker.CustomerTracker.Daos;

import com.customertracker.CustomerTracker.Models.Account;

import java.util.List;

/**
 *
 */

public interface AccountDao {
  /**
   * This method creates a Account model object that is to be stored in a database, based on the
   * passed in Account object. Then returns the created Account object.
   *
   * @param account a Account class object.
   * @return the Account class objected that was created.
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
   * This method updates a Account's information stored in the database, if the passed Account is
   * not found in the database, a new entry is made.
   *
   * @param account a Account object that contains the updated information that is to be added to
   *                 the database.
   * @return a Account object that has been updated.
   */
  Account updateAccount(Account account);

  /**
   * This method deletes a pre-existing Account from the database. It returns a 1 upon successful
   * deletion and a 0 upon a failed deletion.
   *
   * @param id an Integer representing the ID of the Account to be deleted.
   * @return a Integer representing if the deletion was successful or not, 1 for successful or 0 for
   * the id not being found and no deletion occurring.
   */
  int deleteAccount(Integer id);
}
