public class Main {


    public static void main(String[] args) {

        Autonomo cl = new Autonomo();
        System.out.println("Bienvenido a Chispas esta es la información a contemplar:");
        //Class autonomo
        Autonomo autonomo = new Autonomo();
        System.out.println("____________Los datos del cliente Autonomo:__________________ ");
        autonomo.setNameClient("Lorenzo");
        autonomo.setNif("73982654S");
        autonomo.setSurname("Gutierrez");
        autonomo.setPopulation("Ávila");
        autonomo.setProvince("Ávila");
        autonomo.setMailingAdress("05240");
        autonomo.setEmail("lorenzogut@educa.jcyl.es");
        autonomo.setPhone("652358634");

        printClient(autonomo);

        //Class Society
        Society soc = new Society();
        System.out.println("__________________Los datos del cliente Sociedad:__________________________ ");
        soc.setName("L.S LicoresPerez");
        soc.setCif("71673456");
        soc.setPopulation("Madrid");
        soc.setProvince("Madrid");
        soc.setMailingAdress("02390");
        soc.setEmail("licorsls@gmail.com");
        soc.setPhone("653428709");
        printClient(soc);

        Services serv1 = new Services();
        System.out.println("___________________Los datos del servicio 1 son:_______________________ ");
        serv1.setName("Reparación de Cableado");
        serv1.setPrice(50);
        serv1.setServiceCode(3);
        serv1.setTypeIVA(21);
        printServ1(serv1);

        Services serv2 = new Services();
        System.out.println("___________________Los datos del servicio 2 son:________________________");
        serv2.setName("Entrega de Bombillas");
        serv2.setPrice(36);
        serv2.setTypeIVA(21);
        serv2.setServiceCode(2);
        printServ2(serv2);

        Product product = new Product();
        System.out.println("_____________________Los datos del producto 1 son:________________________");
        product.setName("Interruptores");
        product.setBrand("Simon");
        product.setProductCode(5);
        product.setModel("Rectangular,Blanco");
        product.setPrice(55);
        product.setTypeIVA(21);
        printProduct1(product);

        Product product2 = new Product();
        System.out.println("________________________Los datos del producto 2 son:______________________");
        product2.setProductCode(2);
        product2.setName("Bombillas");
        product2.setBrand("E27");
        product2.setModel("Florescente");
        product2.setPrice(15);
        product2.setTypeIVA(21);
        printProduct2(product2);

        Invoice invoice1 = new Invoice();
        System.out.println("______________La factura de Autonomo es la siguiente:__________________________");
        invoice1.setDate("24/11/2022");
        invoice1.setInvoiceCode(34);

        printInvoice(invoice1,product2,serv1,autonomo);


    }
        //Class Client:Autonomo y Sociedad.
    public static void printClient(Client client) {
        System.out.println("COD: " + client.getClientCode() + "\nNombre: " + client.getNameClient());
        System.out.println("Apellido:" + client.getSurname() + "\nPoblación: " + client.getPopulation());
        System.out.println("Provincia: " + client.getProvince() + "\nCodigo Postal: " + client.getMailingAdress());
        System.out.println("Email: " + client.getEmail() + "\nTelefono: " + client.getPhone());

    }

    //Service1:
    public static void printServ1(Services services) {
        System.out.println("Tipo de reparación: " + services.getName() + "\n Precio del servicio: " + services.getPrice());
        System.out.println("Codigo del servicio: " + services.getSalesCode() + "\n Tipo de IVA: " + services.getTypeIVA());

    }
    //Service2:
    public static void printServ2(Services services) {
        System.out.println("Tipo de reparación: " + services.getName() + "\n Precio del servicio: " + services.getPrice());
        System.out.println("Codigo del servicio: " + services.getSalesCode() + "\n Tipo de IVA: " + services.getTypeIVA());

    }
    //Product1:
    public static void printProduct1(Product product) {
        System.out.println("COD: " + product.getSalesCode() + "\nNombre: " + product.getName());
        System.out.println("Marca: " + product.getBrand() + "\nModelo: " + product.getModel());
        System.out.println("Precio: " + product.getPrice() + "\nTipo de IVA: " + product.getTypeIVA());
    }
    //Product2:
    public static void printProduct2(Product product2){
        System.out.println("COD: " + product2.getSalesCode() + "\nNombre: " + product2.getName());
        System.out.println("Marca: " + product2.getBrand() + "\nModelo: " + product2.getModel());
        System.out.println("Precio: " + product2.getPrice() + "\nTipo de IVA: " + product2.getTypeIVA());



}
    //First Invoice, with Autonomo(Client) ,one services and one product.
    public static void printInvoice(Invoice invoice,Sales_Line sales_line, Services serv1,Autonomo autonomo) {
        //INVOICE AND CUSTOMER DATA
        System.out.println("COD De Factura: "+ invoice.getInvoiceCode()+"\nFecha: "+invoice.getDate());
        System.out.println("_______________________________________________________________________________");
        System.out.println("Nombre del Cliente: "+ autonomo.getNameClient() +"\nCodigo de Cliente: "+ autonomo.getClientCode());
        System.out.println("Poblacion del Cliente: "+ autonomo.getPopulation()+"\nDirección: "+autonomo.getMailingAdress());
        System.out.println("Provincia del Cliente: "+ autonomo.getProvince()+"\nEmail: "+ autonomo.getEmail());
        System.out.println("_____________________________________________________________________________________________________");
        //Product data:
        System.out.println("Codigo del producto: "+ sales_line.getSalesCode()+"\nNombre del Producto: "+sales_line.getName());
        System.out.println("Precio del Producto: "+sales_line.getPrice()+"\nTipo de IVA del Producto: "+sales_line.getTypeIVA());
        System.out.println("_______________________________________________________________________________________________________");
        //Service data:
        System.out.println("Total de producto: "+sales_line.getTotal());
        System.out.println("Codigo del servicio: "+sales_line.getSalesCode());
        //ACABAR



    }


}
