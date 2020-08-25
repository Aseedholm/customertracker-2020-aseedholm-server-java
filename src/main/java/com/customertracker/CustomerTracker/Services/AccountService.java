package com.customertracker.CustomerTracker.Services;

import com.customertracker.CustomerTracker.Daos.AccountDao;
import com.customertracker.CustomerTracker.Models.Account;
import com.customertracker.CustomerTracker.Repositories.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountService implements AccountDao {
  @Autowired
  private AccountRepository accountRepository;

  @Override
  public Account createAccount(Account account) {
    return accountRepository.save(account);
  }

  @Override
  public List<Account> findAllAccounts() {
    return accountRepository.findAllAccounts();
  }

  @Override
  public Account findAccountById(Integer id) {
    return accountRepository.findAccountById(id);
  }

  @Override
  public List<Account> findAccountsByCustomerId(Integer cid) {
    return accountRepository.findAccountsByCustomerId(cid);
  }

  @Override
  public Account updateAccount(Account account) {
    return accountRepository.save(account);
  }

  @Override
  public int deleteAccount(Integer id) {
    try{
      accountRepository.deleteById(id);
      return 1;
    }catch (IllegalArgumentException e) {
      return 0;
    }
  }
}
