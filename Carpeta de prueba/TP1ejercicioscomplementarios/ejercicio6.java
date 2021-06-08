package TP1ejercicioscomplementarios;
import java.util.*;

public class ejercicio6{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero base: ");
        int numero1 = scan.nextInt();

        System.out.println("Ingrese el exponente: ");
        int numero2 = scan.nextInt();

        scan.close();

        if (numero1 == 0 && numero2 == 0) {

        System.out.println("0 elevado a la 0 es una indeterminacion!");

        } else if (numero1 == 0 && numero2 > 0){

            System.out.println("0 elevado a CUALQUIER NUMERO es 0.");

        } else if (numero1 != 0 && numero2 == 0){

            System.out.println("Cualquier numero distinto de 0 elevado a 0 es 1 !");
            
        } else {
            int potencia = numero1;
            for(int i = 1; i < numero2; i = i + 1){
                potencia = potencia*numero1;
            }
            System.out.println(numero1 + " elevado a la " + numero2 + " es " + potencia);
        }
    }
}