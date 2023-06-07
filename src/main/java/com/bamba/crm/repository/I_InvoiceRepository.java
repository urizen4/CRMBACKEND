package com.bamba.crm.repository;

import com.bamba.crm.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface I_InvoiceRepository  extends JpaRepository<Invoice,Long> {
}
