package com.bamba.crm.services;

import com.bamba.crm.model.Customer;
import com.bamba.crm.repository.I_CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices implements I_CustomerService {


    private final I_CustomerRepository ICustomer;

    public CustomerServices(I_CustomerRepository iCustomer) {

        ICustomer = iCustomer;
    }

    @Override
    public Customer saveCustomer(Customer customer){
        return ICustomer.save(customer);
    }

    @Override
    public void  deleteCustomer(Long id){
        ICustomer.deleteById(id);
    }


    @Override
    public Customer updateCustomer(Customer customer){
        return ICustomer.save(customer);
    }


    @Override
    public List<Customer> getAllCustomer(){
        return ICustomer.findAll();
    }

    @Override
    public List<Customer> searchByName() {
        return null;
    }


}
