package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio9{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un texto: ");
        String palabra = scan.nextLine();

        System.out.println("Ingrese letra a buscar: ");
        String busca = scan.nextLine();

        scan.close();

        int cantVeces = 0;

        for(int i = 1; i <= palabra.length(); i = i + 1){
            if ( palabra.charAt(i - 1) == busca.charAt(0) ) {
                cantVeces = cantVeces + 1;
            }
        }

        System.out.println(cantVeces);
    }
}