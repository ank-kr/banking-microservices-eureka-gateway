package com.bank.customer.service;

import java.util.List;

import com.bank.customer.entity.Customer;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    Customer getCustomerById(Long customerId);

    List<Customer> getAllCustomers();
}