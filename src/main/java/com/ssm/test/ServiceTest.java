package com.ssm.test;

import com.ssm.dao.AccountDao;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/*
 *@Author liaochen
 *@Date 2020/7/2
 * 测试类
 */
public class ServiceTest {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }

    /**
     * 测试mybatis的findAll方法
     * @throws IOException
     */
    @Test
    public void run2() throws IOException {
        //加载配置文件
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
        //制造session对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AccountDao mapper = session.getMapper(AccountDao.class);
        //调用查询方法
        List<Account> accounts = mapper.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        //释放资源
        session.close();
        resource.close();
    }

    /**
     * 测试插入方法
     * @throws IOException
     */
    @Test
    public void run3() throws IOException {
        Account account = new Account();
        account.setName("啊福");
        account.setMoney(15000d);
        InputStream resource = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        mapper.saveAccount(account);

        //提交事务
        session.commit();
        session.close();
        resource.close();
    }
}
