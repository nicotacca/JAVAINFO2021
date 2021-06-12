package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido, comience a ingresar ciudades!.");
        ArrayList<String> listaCiudades = new ArrayList<String>();

        String var = "1";
        while (var.charAt(0) == '1') {

            System.out.println("Por favor, ingrese una ciudad...");
            String ciudad = scan.nextLine();
            listaCiudades.add(ciudad);

            System.out.println("Desea continuar ingresando ciudades? Ingrese 1 para continuar o cualquier otra tecla para abortar.");
            var = scan.nextLine();

            /* System.out.println(((Object)var).getClass().getSimpleName()); */

        }

        for (int i=0; i<listaCiudades.size(); i++) {
            System.out.println("#" + (i+1) + " " + listaCiudades.get(i));
          }
        
        scan.close();
    }
    
}
