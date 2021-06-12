package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese uno de 5 numeros enteros a continuacion.");
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
        int entero = 0;
        for(int i = 1; i <= 4; i = i + 1){
            entero = scan.nextInt();
            listaEnteros.add(entero);
            System.out.println("Ingrese el siguiente entero.");
        }
        entero = scan.nextInt();
        listaEnteros.add(entero);

        System.out.println("Ingrese otro entero mas por favor.");
        entero = scan.nextInt();
        listaEnteros.add(0, entero);

        System.out.println("El ultimo y no te jodo mas.");
        entero = scan.nextInt();
        listaEnteros.add(entero);

        
        for(int i = 1; i <= listaEnteros.size(); i = i + 1){
            System.out.print(listaEnteros.get(i - 1));
        }

        System.out.println("");
        System.out.println("Longitud de la lista con elementos es " + listaEnteros.size());
        System.out.println("A continuacion la lista sin los ultimos 2 elementos...");
        
        for(int i = 1; i < listaEnteros.size(); i = i + 1){
            System.out.print(listaEnteros.get(i));
        }

        System.out.println("");
        System.out.println("Longitud de la lista sin elementos es " + (listaEnteros.size()-2));

        scan.close();
    }
    
}
