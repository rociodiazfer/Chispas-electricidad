
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        String respuesta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al menú del Programa Chispas.Selecciona que quieres rellenar:");
        System.out.print("cliente,producto,facturas");
        respuesta = sc.nextLine();
        switch (respuesta) {

            case "cliente":
                //Class autonomous
                Client cl = new Client();
                System.out.println("Por Favor Introduzca los datos necesarios del cliente:");
                System.out.println("Introduce el codigo del cliente");
                String clientCode = sc.next();
                cl.setClientCode();
                System.out.println("Introduce el nombre del cliente");
                String name = sc.next();
                cl.setName();
                System.out.println("Introduce el  cif o nif en caso de que sea autonmo");
                String nif = sc.next();
                cl.setNif();
                System.out.println("Introduce el apellido(si es autonomo)");
                String surname = sc.next();
                cl.setSurname();
                System.out.println("Introduce la población del cliente");
                String population = sc.next();
                cl.setPopulation();
                System.out.println("Introduce la provincia del cliente");
                String province = sc.next();
                cl.setProvince();
                System.out.println("Introdue el codigo postal del cliente");
                String mailingAdress = sc.next();
                cl.setMailingAdress();
                System.out.println("Introduce el correo electrónico del cliente");
                String email = sc.next();
                cl.setEmiail();
                System.out.println("Introduce el telefono del cliente");
                String phone = sc.next();
                cl.setPhone();

                System.out.println("El codigo de cliente introducido es " + clientCode);// comprobación de que los datos se han introducido correctamente


                //Class Products


        }}
    }