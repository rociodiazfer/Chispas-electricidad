public class Services implements Sales_Line {

    private Integer serviceCode;
    private String name;
    private Integer price;
    private Double typeIVA;


    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setTypeIVA(Double typeIVA) {
        this.typeIVA = typeIVA;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getSalesCode() {
        return this.serviceCode;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getTypeIVA() {
        return typeIVA/100;
    }
    @Override
    public double getTotal() {
        return this.price*1.1;
    }

}

