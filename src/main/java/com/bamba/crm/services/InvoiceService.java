package com.bamba.crm.services;

import com.bamba.crm.model.Invoice;
import com.bamba.crm.repository.I_InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InvoiceService  implements  I_InvoiceService{

    private final I_InvoiceRepository invoiceRepository;


    public InvoiceService(I_InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice saveInvoice(Invoice invoice){
        return invoiceRepository.save(invoice);
    }


    @Override
    public  void deleteInvoice(Long id){
        invoiceRepository.deleteById(id);
    }

    @Override
    public List<Invoice> getAllInvoice(){
        return invoiceRepository.findAll();
    }


}
