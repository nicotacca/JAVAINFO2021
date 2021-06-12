package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();

        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);

        valorPorHora.add(100);
        valorPorHora.add(100);
        valorPorHora.add(100);
        valorPorHora.add(100);
        valorPorHora.add(100);

        ArrayList<Integer> remuneracionPorDia = new ArrayList<Integer>();

        for (int i = 0; i < horasTrabajadas.size() ; i = i + 1){

            remuneracionPorDia.add((horasTrabajadas.get(i)*valorPorHora.get(i)));
            
        }

        System.out.println("");

        System.out.println("La remuneracion diaria fue de:");

        for (int i = 0; i < remuneracionPorDia.size() ; i = i + 1){

            System.out.print("# "+ remuneracionPorDia.get(i) + " ");
            
        }

        System.out.println("");
        
        Integer total = 0;

        for (int i = 0; i < remuneracionPorDia.size() ; i = i + 1){

            total = total + remuneracionPorDia.get(i);
            
        }

        System.out.println("La remuneracion total fue de: " + total);

    }
    
}