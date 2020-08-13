package com.iflyteck.controller;

import com.iflyteck.domain.Account;
import com.iflyteck.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("list", accounts);
        return "list";
    }
}
