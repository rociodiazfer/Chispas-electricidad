public class Main {


    public static void main(String[] args) {


        System.out.println("Bienvenido a Chispas esta es la información a contemplar:");
        //AUTONOMO
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

        //SOCIETY
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
        //SERVICE 1
        Services serv1 = new Services();
        System.out.println("___________________Los datos del servicio 1 son:_______________________ ");
        serv1.setName("Reparación de Cableado");
        serv1.setPrice(50);
        serv1.setServiceCode(3);
        serv1.setTypeIVA(10);
        printServ1(serv1);
        //SERVICE 2
        Services serv2 = new Services();
        System.out.println("___________________Los datos del servicio 2 son:________________________");
        serv2.setName("Entrega de Bombillas");
        serv2.setPrice(36);
        serv2.setTypeIVA(10);
        serv2.setServiceCode(6);
        printServ2(serv2);
        //PRODUCT 1
        Product product = new Product();
        System.out.println("_____________________Los datos del producto 1 son:________________________");
        product.setName("Interruptores");
        product.setBrand("Simon");
        product.setProductCode(5);
        product.setModel("Rectangular,Blanco");
        product.setPrice(55);
        product.setTypeIVA(21);
        printProduct1(product);
        //PRODUCT 2
        Product product2 = new Product();
        System.out.println("________________________Los datos del producto 2 son:______________________");
        product2.setProductCode(2);
        product2.setName("Bombillas");
        product2.setBrand("E27");
        product2.setModel("Florescente");
        product2.setPrice(15);
        product2.setTypeIVA(21);
        printProduct2(product2);
        //INVOICE 1
        Invoice invoice1 = new Invoice();
        System.out.println("______________La factura de Autonomo:__________________________");
        invoice1.setDate("24/11/2022");
        invoice1.setInvoiceCode(34);

        printInvoice(invoice1,product2,serv1,autonomo);
        //INVOICE 2
        Invoice invoice2 = new Invoice();
        System.out.println("\n______________La factura de la Sociedad:__________________________");
        invoice2.setDate("2/6/2022");
        invoice2.setInvoiceCode(20);
        printInvoice(invoice2,product,serv2,soc);



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
    public static void printInvoice(Invoice invoice1,Sales_Line sales_line, Services serv1,Autonomo autonomo) {
        //INVOICE AND CUSTOMER DATA
        System.out.println("FACTURA:");
        System.out.println("COD De Factura: "+ invoice1.getInvoiceCode()+"\nFecha: "+invoice1.getDate());
        System.out.println("_________________________DATOS DEL CLIENTE______________________________________________________");
        System.out.println("Nombre del Cliente: "+ autonomo.getNameClient() +"\nCodigo de Cliente: "+ autonomo.getClientCode());
        System.out.println("Poblacion del Cliente: "+ autonomo.getPopulation()+"\nDirección: "+autonomo.getMailingAdress());
        System.out.println("Provincia del Cliente: "+ autonomo.getProvince()+"\nEmail: "+ autonomo.getEmail());
        System.out.println("_________________________LINEA DE VENTA__________________________________________________");
        //Product data:
        System.out.println("Codigo del producto: "+ sales_line.getSalesCode()+"\nNombre del Producto: "+sales_line.getName());
        System.out.println("Precio del Producto: "+sales_line.getPrice()+"\nTipo de IVA del Producto: "+sales_line.getTypeIVA());
        System.out.println("Total de producto: "+sales_line.getTotal());
        System.out.println("_______________________________________________________________________________________________________");
        //Service data:
        System.out.println("Codigo del servicio: "+serv1.getSalesCode()+"\nNombre del servicio: "+serv1.getName());
        System.out.println("Precio del Servicio: "+serv1.getPrice()+"\nTipo de IVA del Servicio: "+serv1.getTypeIVA());//TypeIVA=0.1
        System.out.println("Total del Servicio: "+ (int) serv1.getTotal());
        //TOTAL:
        System.out.println("_________________________________TOTAL_________________________________________________________________________");
        System.out.println("Base Imponible:________________________________________________________________________________________"+(sales_line.getPrice()+serv1.getPrice())+" euros");
        System.out.printf("TOTAL:__________________________________________________________________________________________________"+(sales_line.getTotal()+serv1.getTotal())+" euros");

    }
    //The Second invoice with a society, one a product and one a service.
   public static void printInvoice(Invoice invoice2, Sales_Line sales_line, Services serv2, Society soc) {
       //INVOICE AND CUSTOMER DATA
       System.out.println("FACTURA:");
       System.out.println("COD De Factura: "+ invoice2.getInvoiceCode()+"\nFecha: "+invoice2.getDate());
       System.out.println("_________________________DATOS DEL CLIENTE______________________________________________________");
       System.out.println("Nombre del Cliente: "+ soc.getNameClient() +"\nCodigo de Cliente: "+ soc.getClientCode());
       System.out.println("Poblacion del Cliente: "+ soc.getPopulation()+"\nDirección: "+soc.getMailingAdress());
       System.out.println("Provincia del Cliente: "+ soc.getProvince()+"\nEmail: "+ soc.getEmail());
       System.out.println("_________________________LINEA DE VENTA__________________________________________________");
       //Product data:
       System.out.println("Codigo del producto: "+ sales_line.getSalesCode()+"\nNombre del Producto: "+sales_line.getName());
       System.out.println("Precio del Producto: "+sales_line.getPrice()+"\nTipo de IVA del Producto: "+sales_line.getTypeIVA());
       System.out.println("Total de producto: "+sales_line.getTotal());
       System.out.println("_______________________________________________________________________________________________________");
       //Service data:
       System.out.println("Codigo del servicio: "+serv2.getSalesCode()+"\nNombre del servicio: "+serv2.getName());
       System.out.println("Precio del Servicio: "+serv2.getPrice()+"\nTipo de IVA del Servicio: "+serv2.getTypeIVA());//TypeIVA=0.1
       System.out.println("Total del Servicio: "+ (int) serv2.getTotal());
       //TOTAL:
       System.out.println("_________________________________TOTAL_________________________________________________________________________");
       System.out.println("Base Imponible:________________________________________________________________________________________"+(sales_line.getPrice()+serv2.getPrice())+" euros");
       System.out.println("TOTAL:__________________________________________________________________________________________________"+(sales_line.getTotal()+serv2.getTotal())+" euros ");

   }


}
