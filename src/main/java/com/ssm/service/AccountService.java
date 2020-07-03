package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

/**
 * 账户的service接口
 */
public interface AccountService {
    //查询所有用户
    public List<Account> findAll();
    //保存用户
    public void saveAccount(Account account);
}
