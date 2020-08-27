package com.customertracker.CustomerTracker.Controllers;

import com.customertracker.CustomerTracker.Models.Account;
import com.customertracker.CustomerTracker.Services.AccountService;

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
 * This class represents the controller for AccountServices that allows a user to do operations on
 * the database though the API provided by the controller.
 */
@RestController
//Specify the specific website here instead of the general *.
@CrossOrigin(origins = "*")
public class AccountController {

  @Autowired
  private AccountService accountService;

  /**
   * This method provides an API for a user to create an Account entry in the applicable database
   * through a PostMapping.
   *
   * @param account an Account object that will be stored in the database.
   * @return an Account object that was added to the database.
   */
  @PostMapping("/api/account")
  public Account createAccount(@RequestBody Account account) {
    return accountService.createAccount(account);
  }

  /**
   * This method provides an API for a user to find all Account entries stored in the applicable
   * database, does this through a GetMapping.
   *
   * @return a List object containing Account objects that represent all the stored Accounts in the
   * database.
   */
  @GetMapping("/api/accounts")
  public List<Account> findAllAccounts() {
    return accountService.findAllAccounts();
  }

  /**
   * This method provides an API for a user to find a specific Account entry, according to the
   * passed identification number, stored in the applicable database, does this through a
   * GetMapping.
   *
   * @param aid an Integer representing the identification number for the account to be retrieved.
   * @return an Account object that has the passed identification number.
   */
  @GetMapping("/api/account/{aid}")
  public Account findAccountById(@PathVariable Integer aid) {
    return accountService.findAccountById(aid);
  }

  /**
   * This method provides an API for a user to delete a specific Account entry, according to the
   * passed identification number, does this through a DeleteMapping.
   *
   * @param aid an Integer representing the identification number for the account to be deleted.
   * @return a int representing 1 for a successful deletion or 0 for unsuccessful.
   */
  @DeleteMapping("/api/account/{aid}")
  public int deleteAccountById(@PathVariable Integer aid) {
    return accountService.deleteAccount(aid);
  }

  /**
   * This method provides an API for a user to find all Account entries for a Customer according to
   * the Customer's identification number. Does this through a GetMapping.
   *
   * @param cid an Integer representing a Customer's identification number.
   * @return a List object containing Account objects that represent all the accounts for a
   * particular customer.
   */
  @GetMapping("/api/accounts/customer/{cid}")
  public List<Account> findAccountsByCustomerId(@PathVariable Integer cid) {
    return accountService.findAccountsByCustomerId(cid);
  }
}
