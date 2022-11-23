
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        //Class autonomous
        Autonomous aut = new Autonomous();
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el nif del autonomo:");
        String nif = sc.next();
        aut.setNif(nif);
        System.out.println("Introduce el nombre del autonomo:");
        System.out.println("Introduce el apellido del autonomo:");
        String surname = sc.next();
        aut.setSurname(surname);

        System.out.println("El nombre introducido es " + aut.getNif());//comprobacion de que se ha guardado bien.
        
        }
}