
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Autonomo cl = new Autonomo();
        System.out.println("Bienvenido al Programa Chispas.Por favor introduzca los datos necesarios:");
        //Class autonomo
        Autonomo autonomo = new Autonomo();
        System.out.println("Por Favor Introduzca los datos necesarios del cliente:");
        System.out.println("El nombre del autonomo: ");
        autonomo.setName("Lorenzo");
        System.out.println("El nif del autonomo: ");
        autonomo.setNif("73982654S");
        System.out.println("El apellido del autonomo: ");
        autonomo.setSurname("Gutierrez");
        System.out.println("La población del autonomo: ");
        autonomo.setPopulation("Ávila");
        System.out.println("La provincia del autonomo: ");
        autonomo.setProvince("Ávila");
        System.out.println("El codigo postal del autonomo: ");
        autonomo.setMailingAdress("05240");
        System.out.println("El correo electrónico del autonomo: ");
        autonomo.setEmiail("lorenzogut@educa.jcyl.es");
        System.out.println("Introduce el telefono del autonomo: ");
        autonomo.setPhone("652358634");

        printClient(autonomo);
        //Class Society
        Society soc = new Society();
        System.out.println("Por Favor Introduzca los datos necesarios de la sociedad:");
        System.out.println("El nombre de la sociedad: ");
        soc.setName("L.S LicoresPerez");
        System.out.println("El cif de la sociedad: ");
        soc.setCif("71673456");
        System.out.println("La población de la sociedad: ");
        soc.setPopulation("Madrid");
        System.out.println("La provincia de la sociedad: ");
        autonomo.setProvince("Madrid");
        System.out.println("El codigo postal de la sociedad: ");
        autonomo.setMailingAdress("02390");
        System.out.println("El correo electrónico de la sociedad: ");
        autonomo.setEmiail("licorsls@gmail.com");
        System.out.println("El telefono de la sociedad: ");
        autonomo.setPhone("653428709");
    }
               public static void printClient(Client client){
                   System.out.println("COD: "+ client.getClientCode()+ "nombre: "+client.getName());


        }




}
