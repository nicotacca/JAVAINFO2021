package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio2{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scan.nextInt();

        // Closing Scanner after the use
        scan.close();

        System.out.println("El primer numero es: " + numero1);
        System.out.println("El segundo es: " + numero2);

        System.out.println("La suma de ambos numeros es: " + (numero1+numero2));
        System.out.println("La resta del primer nro por el segundo es: " + (numero1-numero2));
        System.out.println("La multiplicacion de ambos es: " + (numero1*numero2));
        System.out.println("La division del primero por el segundo es: " + (numero1/numero2));
        System.out.println("El modulo de ambos es: " + (numero1%numero2));
    }
}