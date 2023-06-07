package com.bamba.crm.controllers;


import com.bamba.crm.model.Customer;
import com.bamba.crm.model.Invoice;
import com.bamba.crm.services.I_InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {


    private final I_InvoiceService invoiceService;


    public InvoiceController(I_InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }


    @GetMapping //api/invoice
    public ResponseEntity<?> getAllInvoices(){
        return new ResponseEntity<>(invoiceService.getAllInvoice(), HttpStatus.OK);
    }

    @PostMapping //api/invoice
    public  ResponseEntity<?> CreateInvoice(@RequestBody Invoice invoice){
        Invoice newInvoice = invoiceService.saveInvoice(invoice);
        return new ResponseEntity<>(newInvoice,HttpStatus.CREATED);
    }

    @DeleteMapping("{id}") //api/customer/{id}
    public ResponseEntity <?> deleteCustomer(@PathVariable("id") Long id){
        invoiceService.deleteInvoice(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
