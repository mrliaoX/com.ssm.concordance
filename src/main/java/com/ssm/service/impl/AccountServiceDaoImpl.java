package com.ssm.service.impl;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *@Author liaochen
 *@Date 2020/7/2
 * 账户的service实现类
 */
@Service("accountService")
public class AccountServiceDaoImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Account> findAll() {

        System.out.println("service执行查询方法");
        return accountDao.findAll();
    }

    /**
     * 保存账户
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }


}
