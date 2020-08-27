package com.customertracker.CustomerTracker.Services;

import com.customertracker.CustomerTracker.Daos.AccountDao;
import com.customertracker.CustomerTracker.Models.Account;
import com.customertracker.CustomerTracker.Repositories.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This class represents the services for the Account model. It allows the creation, deletion, and
 * reading of Account object information from the database or to the database.
 */
@Service
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
  public int deleteAccount(Integer id) {
    try{
      accountRepository.deleteById(id);
      return 1;
    }catch (EmptyResultDataAccessException e) {
      return 0;
    }
  }

  /**
   * This method saves a passed list of Account objects to the database.
   *
   * @param accounts a List of Account objects that will be saved in the database.
   * @return an Iterable<Account> object.
   */
  public Iterable<Account> save(List<Account> accounts) {
    return accountRepository.saveAll(accounts);
  }
}
