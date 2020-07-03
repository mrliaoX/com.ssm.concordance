package com.ssm.dao;

import com.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 */
@Repository
public interface AccountDao {
    //保存账户
    @Insert(value = "insert into account2(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
    //查询所有账户
    @Select(value = "select * from account2")
    public List<Account> findAll();
}
