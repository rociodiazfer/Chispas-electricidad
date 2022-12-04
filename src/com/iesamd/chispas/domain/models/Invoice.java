package com.iesamd.chispas.domain.models;

public class Invoice {

    public String invoiceCode;
    public String date;

    public String getInvoiceCode() {
        return this.invoiceCode;
    }
    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
