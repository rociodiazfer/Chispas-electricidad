public class Products implements Sales_Line{

    private Integer productCode;
    private String name;
    private String brand;
    private String model;
    private Integer price;
    private Integer typeIVA;

    public Integer getProductCode() {
        return productCode;
    }

    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTypeIVA() {
        return typeIVA;
    }

    public void setTypeIVA(Integer typeIVA) {
        this.typeIVA = typeIVA;
    }
    public void price() {
        price();
    }
    public void typeIVA() {
        typeIVA();
    }
    public void name() {
        name();
    }
    public void totalIVA() {
        totalIVA();
    }
    public void code() {
        code();
    }
}
