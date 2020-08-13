package com.iflyteck.service.impl;

import com.iflyteck.dao.AccountDao;
import com.iflyteck.domain.Account;
import com.iflyteck.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
