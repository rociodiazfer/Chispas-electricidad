package com.iesamd.chispas.domain.models;

public class Product implements Sales_Line {

    private String productCode;
    private String name;
    private String brand;
    private String model;
    private double price;
    private double typeIVA;

    @Override
    public double getTotal() {
        return this.price*1.21;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSalesCode() {
        return this.productCode;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getTypeIVA() {
        return this.typeIVA/100;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTypeIVA(double typeIVA) {
        this.typeIVA = typeIVA;
    }

}
