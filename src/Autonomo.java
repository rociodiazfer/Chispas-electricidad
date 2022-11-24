public class Autonomo implements Client {

    private String nif;
    private String name;
    private String surname;
    private String mailingAdress;
    private String population;
    private String province;
    private String emiail;
    private String phone;

    public void setNif(String nif) {
        this.nif = nif;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMailingAdress(String surname) {
        this.mailingAdress = mailingAdress;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmiail(String email) {
        this.emiail = emiail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String getClientCode() {
        return this.nif;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMailingAdress() {
        return this.mailingAdress;
    }

    @Override
    public String getPopulation() {
        return this.population;
    }

    @Override
    public String getProvince() {
        return null;
    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public String getPhone() {
        return null;
    }
}

