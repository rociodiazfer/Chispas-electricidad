package com.iesamd.chispas.data;
import com.iesamd.chispas.domain.models.Invoice;


import java.util.List;

public interface InvoiceDataStore {

    void saveInvoice (Invoice invoice);
    void updateInvoice(Invoice invoice);

    List<Invoice> getAllInvoice();

    Invoice findBy (String invoiceCode);
}
