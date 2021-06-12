package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {


        ArrayList<Integer> barajaFrancesa = new ArrayList<Integer>();

        for (int i = 1; i <= 10 ; i = i + 1){
            barajaFrancesa.add(i);
        }

        System.out.println("Numeracion de cartas de la baraja francesa.");

        for (int i = 0; i <= 9 ; i = i + 1){
            System.out.print("# "+ barajaFrancesa.get(i) + " ");
        }

        System.out.println("");

        Collections.reverse(barajaFrancesa);

        System.out.println("Numeracion de cartas de la baraja francesa de manera INVERSA.");

        for (int i = 0; i <= 9 ; i = i + 1){
            System.out.print("# "+ barajaFrancesa.get(i) + " ");
        }

        System.out.println("");

        Collections.shuffle(barajaFrancesa);

        System.out.println("Numeracion de cartas de la baraja francesa de manera RANDOM.");

        for (int i = 0; i <= 9 ; i = i + 1){
            System.out.print("# "+ barajaFrancesa.get(i) + " ");
        }

        System.out.println("");
        
    }
    
}
