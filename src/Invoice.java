public class Invoice {

    public Integer invoiceCode;
    public String date;
    public String clientCif;
    public String clientNif;
    public Products products;
    public Services services;
    public Integer taxBase;
    public Integer total;

    public Integer getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(Integer invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientCif() {
        return clientCif;
    }

    public void setClientCif(String clientCif) {
        this.clientCif = clientCif;
    }

    public String getClientNif() {
        return clientNif;
    }

    public void setClientNif(String clientNif) {
        this.clientNif = clientNif;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Integer getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(Integer taxBase) {
        this.taxBase = taxBase;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
