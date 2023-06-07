package com.bamba.crm.controllers;


import com.bamba.crm.model.Customer;
import com.bamba.crm.services.I_CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

  private final I_CustomerService customerService;

    public CustomerController(I_CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping //api/customer
    public ResponseEntity<?>getAllCustomers(){
      return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }


    @PostMapping //api/customer
     public  ResponseEntity<?> AddBook(@RequestBody Customer customer){
      Customer newCustomer = customerService.saveCustomer(customer);
      return new ResponseEntity<>(newCustomer,HttpStatus.CREATED);
    }


    @DeleteMapping("{id}") //api/customer/{id}
    public ResponseEntity <?> deleteCustomer(@PathVariable("id") Long id){
      customerService.deleteCustomer(id);
      return new ResponseEntity<>(HttpStatus.OK);
    }


}
