package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio1{
    public static void main(String[] args) {

        Scanner inputNombreUsuario = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");

        String nombreUsuario = inputNombreUsuario.nextLine();
        System.out.println("HOLA: " + nombreUsuario + " !!!");

        inputNombreUsuario.close();
    }
}
