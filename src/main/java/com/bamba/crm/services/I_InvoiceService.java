package com.bamba.crm.services;

import com.bamba.crm.model.Invoice;

import java.util.List;

public interface I_InvoiceService {
    Invoice saveInvoice(Invoice invoice);

    void deleteInvoice(Long id);

    List<Invoice> getAllInvoice();
}
