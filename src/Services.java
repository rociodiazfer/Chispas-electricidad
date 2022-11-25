public class Services implements Sales_Line {

    private Integer serviceCode;
    private String name;
    private Integer price;
    private Integer typeIVA;


    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setTypeIVA(Integer typeIVA) {
        this.typeIVA = typeIVA;
    }

    @Override
    public Integer getSalesCode() {
        return this.serviceCode;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public Integer getTypeIVA() {
        return this.typeIVA;
    }

    @Override
    public Integer getTotal() {
        return this.price+typeIVA;
    }

}

