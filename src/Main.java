
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Autonomo cl = new Autonomo();
        System.out.println("Bienvenido al Programa Chispas.Por favor introduzca los datos necesarios:");
        //Class autonomo
        Autonomo autonomo = new Autonomo();
        System.out.println("____________Los datos del cliente Autonomo:__________________ ");
        autonomo.setName("Lorenzo");
        autonomo.setNif("73982654S");
        autonomo.setSurname("Gutierrez");
        autonomo.setPopulation("Ávila");
        autonomo.setProvince("Ávila");
        autonomo.setMailingAdress("05240");
        autonomo.setEmiail("lorenzogut@educa.jcyl.es");
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
    }
    public static void printClient(Client client){
        System.out.println("COD: " + client.getClientCode()+"\nNombre: " +client.getName());
        System.out.println("Apellido:" + client.getSurname()+"\nPoblación: "+ client.getPopulation());
        System.out.println("Provincia: "+ client.getProvince()+"\nCodigo Postal: "+ client.getMailingAdress());
        System.out.println("Email: "+client.getEmail()+"\nTelefono: "+client.getPhone());

        }
    public static void printServ1(Services services) {
        System.out.println("Tipo de reparación: "+ services.getName()+"\n Precio del servicio: "+ services.getPrice());
        System.out.println("Codigo del servicio: "+services.getServiceCode()+"\n Tipo de IVA: "+ services.getTypeIVA());

    }
    public static void printServ2(Services services){
        System.out.println("Tipo de reparación: "+ services.getName()+"\n Precio del servicio: "+ services.getPrice());
        System.out.println("Codigo del servicio: "+services.getServiceCode()+"\n Tipo de IVA: "+ services.getTypeIVA());

    }


}
