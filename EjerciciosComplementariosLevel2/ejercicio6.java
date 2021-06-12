package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio6 {
    //usar static sino hay que declararla fuera en un archivo
    public static class Empleado {

        String nombre;
        int dni;
        int horasTrabajadas;
        int valorPorHora;

        public Empleado(String nombre, int dni, int horasTrabajadas, int valorPorHora) {
            this.nombre = nombre;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }
    
    }
    
    
    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("Ricardo", 37520542, 5, 1000);
        Empleado emp2 = new Empleado("Pablo", 37322959, 5, 4000);
        Empleado emp3 = new Empleado("Checho", 165482, 5, 6000);
        Empleado emp4 = new Empleado("Juan", 589, 5, 1000);
        Empleado emp5 = new Empleado("Adrian", 90009000, 5, 1000);

        HashSet<Empleado> empleados = new HashSet<Empleado>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        empleados.add(emp5);

        HashMap<Integer, Integer> dniXsueldoHashMap = new HashMap<Integer, Integer>();

        for (Empleado temp: empleados){

            dniXsueldoHashMap.put(temp.dni, (temp.horasTrabajadas*temp.valorPorHora));
            
        }

        System.out.println(dniXsueldoHashMap);

    }
    
}