package EjerciciosComplementariosLevel1;
import java.util.*;

public class ejercicio5{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para realizar la multiplicacion por SUMAS SUCESIVAS: ");
        int numero1 = scan.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scan.nextInt();

        scan.close();
        int multiplicacion = numero1;

        if (numero1 == 0 || numero2 == 0) {

            System.out.println(numero1 + " X " + numero2 + " es " + 0);

        } else {

            for(int i = 1; i < numero2; i = i + 1){

                multiplicacion = multiplicacion + numero1;

            }
            System.out.println(numero1 + " X " + numero2 + " es " + multiplicacion);
        }

    }
}