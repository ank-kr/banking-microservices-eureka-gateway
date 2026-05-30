package com.bank.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bank.account.entity.Account;
import com.bank.account.repository.AccountRepository;
import com.bank.account.vo.AccountCustomerVO;
import com.bank.account.vo.Customer;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account getAccountById(Long accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public AccountCustomerVO getAccountWithCustomer(Long accountId) {

        Account account = accountRepository.findById(accountId).orElse(null);

        if (account == null) {
            return null;
        }

        Customer customer = restTemplate.getForObject(
                "http://CUSTOMER-SERVICE/api/customers/" + account.getCustomerId(),
                Customer.class
        );

        AccountCustomerVO accountCustomerVO = new AccountCustomerVO();
        accountCustomerVO.setAccount(account);
        accountCustomerVO.setCustomer(customer);

        return accountCustomerVO;
    }
}