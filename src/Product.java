public class Product implements Sales_Line {

    private Integer productCode;
    private String name;
    private String brand;
    private String model;
    private Integer price;
    private Integer typeIVA;


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
    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setTypeIVA(Integer typeIVA) {
        this.typeIVA = typeIVA;
    }

    @Override
    public Integer getTotal() {
        return this.price+typeIVA;
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
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public Integer getTypeIVA() {
        return this.typeIVA;
    }
}
