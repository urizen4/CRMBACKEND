package com.bamba.crm.repository;

import com.bamba.crm.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface I_CustomerRepository extends JpaRepository<Customer,Long> {


}
