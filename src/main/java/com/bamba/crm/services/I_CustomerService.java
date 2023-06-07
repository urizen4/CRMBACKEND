package com.bamba.crm.services;

import com.bamba.crm.model.Customer;

import java.util.List;

public interface I_CustomerService {
    Customer saveCustomer(Customer customer);

    void  deleteCustomer(Long id);

    Customer updateCustomer(Customer customer);

    List<Customer> getAllCustomer();

    List<Customer> searchByName();
}
