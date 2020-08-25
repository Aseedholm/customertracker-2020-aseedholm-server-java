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

@RestController
//Specify the specific website here instead of the general *.
@CrossOrigin(origins = "*")
public class AccountController {

  @Autowired
  private AccountService accountService;

  @PostMapping("/api/account")
  public Account createAccount(@RequestBody Account account){
    return accountService.createAccount(account);
  }

  @GetMapping("/api/accounts")
  public List<Account> findAllAccounts() {
    return accountService.findAllAccounts();
  }

  @GetMapping("/api/account/{aid}")
  public Account findAccountById(@PathVariable Integer aid){
    return accountService.findAccountById(aid);
  }

  @DeleteMapping("/api/account/{aid}")
  public int deleteAccountById(@PathVariable Integer aid) {
    return accountService.deleteAccount(aid);
  }

  @GetMapping("/api/accounts/customer/{cid}")
  public List<Account> findAccountsByCustomerId(@PathVariable Integer cid) {
    return accountService.findAccountsByCustomerId(cid);
  }
}
