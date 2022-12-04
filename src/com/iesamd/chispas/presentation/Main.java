package com.iesamd.chispas.presentation;

import com.iesamd.chispas.data.*;
import com.iesamd.chispas.domain.models.*;
import com.iesamd.chispas.domain.usecase.*;

import java.util.List;

public class Main {


    public static void main(String[] args) {


        System.out.println("Bienvenido a Chispas esta es la información a contemplar:");
        //AUTONOMO
        Autonomo autonomo = new Autonomo();
        System.out.println("____________Los datos del cliente com.iesamd.chispas.domain.models.Autonomo:__________________ ");
        autonomo.setName("Lorenzo");
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
        serv1.setServiceCode("3");
        serv1.setTypeIVA(10.0);
        printSales_Line(serv1);
        //SERVICE 2
        Services serv2 = new Services();
        System.out.println("___________________Los datos del servicio 2 son:________________________");
        serv2.setName("Entrega de Bombillas");
        serv2.setPrice(36);
        serv2.setTypeIVA(10.0);
        serv2.setServiceCode("6");
        printSales_Line(serv2);
        //PRODUCT 1
        Product product = new Product();
        System.out.println("_____________________Los datos del producto 1 son:________________________");
        product.setName("Interruptores");
        product.setBrand("Simon");
        product.setProductCode("5");
        product.setModel("Rectangular,Blanco");
        product.setPrice(55);
        product.setTypeIVA(21);
        printSales_Line(product);
        //PRODUCT 2
        Product product2 = new Product();
        System.out.println("________________________Los datos del producto 2 son:______________________");
        product2.setProductCode("2");
        product2.setName("Bombillas");
        product2.setBrand("E27");
        product2.setModel("Florescente");
        product2.setPrice(15);
        product2.setTypeIVA(21);
        printSales_Line(product2);
        //INVOICE 1
        Invoice invoice1 = new Invoice();
        System.out.println("______________FACTURA DEL CLIENTE AUTONOMO__________________________");
        invoice1.setDate("24/11/2022");
        invoice1.setInvoiceCode("34");

        printInvoice(invoice1, product2, serv1, autonomo);
        //INVOICE 2
        Invoice invoice2 = new Invoice();
        System.out.println("\n______________FACTURA DEL CLIENTE SOCIEDAD:__________________________");
        invoice2.setDate("2/6/2022");
        invoice2.setInvoiceCode("20");
        printInvoice(invoice2, product, serv2, soc);

        //Uses Case CLIENT

        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        //ADD CLIENT(autonomo)
        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        System.out.println("___________________USE CASE________________________________");
        addCustomerUseCase.execute(soc);
        //GET CLIENT
        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);
        List<Client> customers = getCustomerUseCase.execute();
        for (int i = 0; i < customers.size(); i++) {
            printClient(customers.get(i));
        }
        //UPDATE CLIENT
        System.out.println("____________________________UPDATE...______________________________________");
        soc.setEmail("licoresSociety@gmail.com");
        UpdateCustumerUseCase updateCustumerUseCase = new UpdateCustumerUseCase(customerDataStore);
        updateCustumerUseCase.execute(soc);
        List<Client> customers2 = getCustomerUseCase.execute();
        for (int i = 0; i < customers2.size(); i++) {
            printClient(customers2.get(i));
        }
        //DELETE CLIENT
        System.out.println("____________________________DELETE....______________________________________");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(autonomo);
        List<Client> customers3 = getCustomerUseCase.execute();
        for (int i = 0; i < customers3.size(); i++) {
            printClient(customers3.get(i));

        }
        //USES CASES SALES_LINE
        Sales_LineDataStore sales_lineDataStore = new MemSales_LineDataStore();

        //Add Sales_Line(Producto)
        AddSales_LineUseCase addSales_lineUseCase = new AddSales_LineUseCase((sales_lineDataStore));
        addSales_lineUseCase.execute(product);
        System.out.println("______________________SALES_LINE_______________________________________________");
        addSales_lineUseCase.execute(serv1);
        //Get Sales_Line(Product)
        GetSales_LineUseCase getSales_lineUseCase = new GetSales_LineUseCase((sales_lineDataStore));
        List<Sales_Line> sales_lines = getSales_lineUseCase.execute();
        for (int j = 0; j < sales_lines.size(); j++) {
            printSales_Line(sales_lines.get(j));
        }
        //Update Sales_Line
        System.out.println("____________________________UPDATE...______________________________________");
        product.setProductCode("45");
        UpdateSales_LineUseCase updateSales_lineUseCase = new UpdateSales_LineUseCase(sales_lineDataStore);
        updateSales_lineUseCase.execute(product);
        List<Sales_Line> sales_lines2 = getSales_lineUseCase.execute();
        for (int j = 0; j < sales_lines2.size(); j++) {
            printSales_Line(sales_lines2.get(j));
        }
        //Delete Sales_Line
        System.out.println("____________________________DELETE....______________________________________");
        DeleteSales_LineUseCase deleteSales_lineUseCase = new DeleteSales_LineUseCase(sales_lineDataStore);
        deleteSales_lineUseCase.execute((serv1));
        List<Sales_Line> sales_lines3 = getSales_lineUseCase.execute();
        for (int j = 0; j < sales_lines3.size(); j++) {
            printSales_Line(sales_lines3.get(j));
        }
        //USE CASE INVOICE **Seguir Aqui***




    }
    //Impresión de las clases.
        //Class Client
    public static void printClient(Client client) {
        System.out.println("COD: " + client.getClientCode() + "\nNombre: " + client.getName());
        System.out.println("Población: " + client.getPopulation());
        System.out.println("Provincia: " + client.getProvince() + "\nCodigo Postal: " + client.getMailingAdress());
        System.out.println("Email: " + client.getEmail() + "\nTelefono: " + client.getPhone());

    }

    //Service1:
    public static void printSales_Line(Sales_Line sales_line) {
        System.out.println("Nombre del producto: " + sales_line.getName() + "\n Precio del servicio: " + sales_line.getPrice());
        System.out.println("Codigo del servicio: " + sales_line.getSalesCode() + "\n Tipo de IVA: " + sales_line.getTypeIVA());

    }
    //Product1:

    //First invoice
    public static void printInvoice(Invoice invoice1, Sales_Line sales_line, Services serv1, Autonomo autonomo) {
        //INVOICE AND CUSTOMER DATA
        System.out.println("FACTURA:");
        System.out.println("COD De Factura: "+ invoice1.getInvoiceCode()+"\nFecha: "+invoice1.getDate());
        System.out.println("_________________________DATOS DEL CLIENTE______________________________________________________");
        System.out.println("Nombre del Cliente: "+ autonomo.getName() +"\nCodigo de Cliente: "+ autonomo.getClientCode());
        System.out.println("Poblacion del Cliente: "+ autonomo.getPopulation()+"\nDirección: "+autonomo.getMailingAdress());
        System.out.println("Provincia del Cliente: "+ autonomo.getProvince()+"\nEmail: "+ autonomo.getEmail());
        System.out.println("_________________________LINEA DE VENTA__________________________________________________");
        //com.iesamd.chispas.domain.models.Product com.iesamd.chispas.data:
        System.out.println("Codigo del producto: "+ sales_line.getSalesCode()+"\nNombre del Producto: "+sales_line.getName());
        System.out.println("Precio del Producto: "+sales_line.getPrice()+"\nTipo de IVA del Producto: "+sales_line.getTypeIVA());
        System.out.println("Total de producto: "+sales_line.getTotal());
        System.out.println("_______________________________________________________________________________________________________");
        //Service com.iesamd.chispas.data:
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
       System.out.println("Nombre del Cliente: "+ soc.getName() +"\nCodigo de Cliente: "+ soc.getClientCode());
       System.out.println("Poblacion del Cliente: "+ soc.getPopulation()+"\nDirección: "+soc.getMailingAdress());
       System.out.println("Provincia del Cliente: "+ soc.getProvince()+"\nEmail: "+ soc.getEmail());
       System.out.println("_________________________LINEA DE VENTA__________________________________________________");
       //Product
       System.out.println("Codigo del producto: "+ sales_line.getSalesCode()+"\nNombre del Producto: "+sales_line.getName());
       System.out.println("Precio del Producto: "+sales_line.getPrice()+"\nTipo de IVA del Producto: "+sales_line.getTypeIVA());
       System.out.println("Total de producto: "+sales_line.getTotal());
       System.out.println("_______________________________________________________________________________________________________");
       //Service
       System.out.println("Codigo del servicio: "+serv2.getSalesCode()+"\nNombre del servicio: "+serv2.getName());
       System.out.println("Precio del Servicio: "+serv2.getPrice()+"\nTipo de IVA del Servicio: "+serv2.getTypeIVA());//TypeIVA=0.1
       System.out.println("Total del Servicio: "+ (int) serv2.getTotal());
       //TOTAL:
       System.out.println("_________________________________TOTAL_________________________________________________________________________");
       System.out.println("Base Imponible:________________________________________________________________________________________"+(sales_line.getPrice()+serv2.getPrice())+" euros");
       System.out.println("TOTAL:__________________________________________________________________________________________________"+(sales_line.getTotal()+serv2.getTotal())+" euros ");

   }

}
