package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio3{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero1 = scan.nextInt();
        scan.close();

        for(int i = 1; i <= numero1; i = i + 1){

            for(int d = 1; d <= i; d = d + 1){

                if (d == i) {
                    System.out.println(d + " ");
                } else {
                    System.out.print(d + " ");
                }

            }
        }
    }
}