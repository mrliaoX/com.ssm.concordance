package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
 *@Author liaochen
 *@Date 2020/7/2
 * 账户的控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        for (Account account : accounts) {
            System.out.println(account);
        }
        return "list";
    }
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        accountService.saveAccount(account);
        return "findAll";
    }
}
