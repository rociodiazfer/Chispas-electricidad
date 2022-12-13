package com.iesamd.chispas.data;

import com.iesamd.chispas.domain.models.Client;
import com.iesamd.chispas.domain.models.Invoice;
import com.iesamd.chispas.domain.models.Sales_Line;

import java.util.List;
import java.util.TreeMap;

public class MemInvoiceDatStore implements InvoiceDataStore{

    private TreeMap<String,Invoice> dataStore = new TreeMap<>();

    @Override
    public void saveInvoice(Invoice invoice) {
        dataStore.put(invoice.getInvoiceCode(),invoice);
    }

    @Override
    public void updateInvoice(Invoice invoice) {
    dataStore.replace(invoice.getInvoiceCode(), invoice);
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Invoice findBy(String invoiceCode) {
        return dataStore.get(invoiceCode);
    }
}
