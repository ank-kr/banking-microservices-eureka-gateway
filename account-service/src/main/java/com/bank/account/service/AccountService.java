package com.bank.account.service;

import java.util.List;

import com.bank.account.entity.Account;
import com.bank.account.vo.AccountCustomerVO;

public interface AccountService {

    Account addAccount(Account account);

    Account getAccountById(Long accountId);

    List<Account> getAllAccounts();

    AccountCustomerVO getAccountWithCustomer(Long accountId);
}