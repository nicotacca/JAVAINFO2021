package EjercicioPropuesto5;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ejercicio5{

    public static class Empleado {

        String nombre;
        String apellido;
        LocalDate fechaNacimiento;
        BigDecimal sueldo;

        public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, BigDecimal sueldo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = fechaNacimiento;
            this.sueldo = sueldo;
        }
    
    }


    public static void main(String[] args) throws IOException {

        String path = "C:\\tacca\\ETAPA 3\\JAVAINFO2021\\JAVAINFO2021\\EjercicioPropuesto5\\empleado.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path)))  {

            String line = br.readLine();
            List<String> listLinea = new ArrayList<String>();
            List<Empleado> empleados = new ArrayList<Empleado>();

            while (line != null) {
                
                // System.out.println(line);

                String cadena = line;
                String[] parts = cadena.split("\\,");              

                listLinea = Arrays.asList(parts);
                System.out.println(listLinea.get(2));

                BigDecimal num = new BigDecimal(listLinea.get(3));

                System.out.println(num);

                // Empleado empleado = new Empleado(nombre, apellido, fechaNacimiento, sueldo)


                line = br.readLine();

            }

        }
    }
}
