package com.frogdev.accountservice.service;

import com.frogdev.accountservice.model.Account;
import com.frogdev.accountservice.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccount(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Long accountId, Account account) {
        if (!accountRepository.existsById(accountId)) {
            throw new RuntimeException("Account not found");
        }
        account.setId(accountId);
        return accountRepository.save(account);
    }

    public void deleteAccount(Long accountId) {
        if (!accountRepository.existsById(accountId)) {
            throw new RuntimeException("Account not found");
        }
        accountRepository.deleteById(accountId);
    }
}
