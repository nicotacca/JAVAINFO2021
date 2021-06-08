package TP1ejercicioscomplementarios;
import java.util.*;

public class ejercicio4{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para realizar el calculo del factorial: ");
        int numero1 = scan.nextInt();
        scan.close();
        int factorial = 1;
        for(int i = 1; i <= numero1; i = i + 1){

            factorial = factorial*i;

        }

        System.out.println("El factorial de " + numero1 + " es " + factorial);

    }
}