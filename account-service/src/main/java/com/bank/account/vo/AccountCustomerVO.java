package com.bank.account.vo;

import com.bank.account.entity.Account;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountCustomerVO {

    private Account account;

    private Customer customer;
}