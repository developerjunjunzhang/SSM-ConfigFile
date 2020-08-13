package com.iflyteck.service;

import com.iflyteck.domain.Account;

import java.util.List;

public interface AccountService {
    // 查询所有账户
    List<Account> findAll ();
    // 保存账户
    void saveAccount ();
}
