public class Product implements Sales_Line {

    private Integer productCode;
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
    public Integer getSalesCode() {
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

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
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
