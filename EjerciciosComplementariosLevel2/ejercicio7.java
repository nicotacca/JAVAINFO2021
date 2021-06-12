package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio7 {
    
    
    public static void main(String[] args) {

       System.out.print(funcionEjercicio7(1, 8));

    }

    public static ArrayList<String> funcionEjercicio7(Integer entero1, Integer entero2) {

        ArrayList<String> arrayRetornado = new ArrayList<String>();

        for (int i = entero1; i <= entero2; i = i + 1) {
            
            if ( i % 2 == 0 && i % 3 == 0 ) {

                arrayRetornado.add("FizzBuzz");
        
                } else if (i % 2 == 0){
        
                    arrayRetornado.add("Fizz");
        
                } else if (i % 3 == 0){
        
                    arrayRetornado.add("Buzz");
        
                } else {
                    String enteroString = String.valueOf(i);
                    arrayRetornado.add(enteroString);

                    }

        }

        return arrayRetornado;

    }
    
}


/* Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. 
Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es 
a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]

 */


