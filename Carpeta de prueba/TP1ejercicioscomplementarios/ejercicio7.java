package TP1ejercicioscomplementarios;
import java.util.*;

public class ejercicio7{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String palabra = scan.nextLine();
        scan.close();
        
        HashMap<String, String> letraMayus = new HashMap<String, String>();

        letraMayus.put("a", "A");
        letraMayus.put("b", "B");
        letraMayus.put("c", "C");
        letraMayus.put("d", "D");
        letraMayus.put("e", "E");
        letraMayus.put("f", "F");
        letraMayus.put("g", "G");
        letraMayus.put("h", "H");
        letraMayus.put("i", "I");
        letraMayus.put("j", "J");
        letraMayus.put("k", "K");
        letraMayus.put("l", "L");
        letraMayus.put("m", "M");
        letraMayus.put("n", "N");
        letraMayus.put("o", "O");
        letraMayus.put("p", "P");
        letraMayus.put("q", "Q");
        letraMayus.put("r", "R");
        letraMayus.put("s", "S");
        letraMayus.put("t", "T");
        letraMayus.put("u", "U");
        letraMayus.put("v", "V");
        letraMayus.put("w", "W");
        letraMayus.put("x", "X");
        letraMayus.put("y", "Y");
        letraMayus.put("z", "Z");

        String nuevaPalabra = "";

        for(int i = 1; i <= palabra.length(); i = i + 1){

            String var = "";
            var = Character.toString(palabra.charAt(i - 1));
            if ( letraMayus.containsKey(var) ) {
                nuevaPalabra = nuevaPalabra + letraMayus.get(var);
            } else {
                nuevaPalabra = nuevaPalabra + palabra.charAt(i - 1);
            }

        }

        System.out.println(nuevaPalabra);
/*         System.out.println(palabra.charAt(5));
        System.out.println(Character.toString(palabra.charAt(5)));
        System.out.println(letraMayus.containsKey(palabra.charAt(5)));
        System.out.println(letraMayus.containsKey("a"));
        System.out.println(letraMayus.containsKey(Character.toString(palabra.charAt(5)))); */
    }
}