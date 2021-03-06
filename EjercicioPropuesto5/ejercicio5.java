package EjercicioPropuesto5;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        
        //MI LISTA DE EMPLEADOS
        List<Empleado> empleados = new ArrayList<Empleado>();

        //TRATAMIENTO DEL ARCHIVO
        String path = "D:\\INFORMATORIO\\ETAPA 3\\JAVA\\ejercicios\\JAVAINFO2021\\EjercicioPropuesto5\\empleado.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path)))  {
            String line = br.readLine();

            //CARGA DE LA LISTA DE EMPLEADOS
            while (line != null) {
                empleados.add(crearEmpleado(line));
                line = br.readLine(); 
            }

        System.out.println("");
        //EMPLEADOS CUYO APELLIDO ARRANCAN CON UNA LETRA DADA

        String letra = new String("F");
        System.out.println("EMPLEADOS CUYO APELLIDO ARRANCA CON " + letra);
        List<Empleado> nuevaLista = new ArrayList<Empleado>(letraApellido(empleados, letra));
        
        for (Empleado emp : nuevaLista) {
            System.out.println(emp.nombre);
        }
        System.out.println("");

        //EMPLEADO MAS JOVEN
        System.out.println("EMPLEADO MAS JOVEN");
        System.out.println(empleadoMasJoven(empleados).apellido);
        System.out.println("");

        //EMPLEADO MAS VIEJO
        System.out.println("EMPLEADO MAS VIEJO");
        System.out.println(empleadoMasViejo(empleados).apellido);
        System.out.println("");

        //EMPLEADO QUE MAS COBRA
        System.out.println("EMPLEADO QUE MAS COBRA");
        System.out.println(empleadoMasGana(empleados).apellido);
        System.out.println("");

        //EMPLEADO QUE MENOS COBRA
        System.out.println("EMPLEADO QUE MENOS COBRA");
        System.out.println(empleadoMenosGana(empleados).apellido);
        System.out.println("");

        }
    }

    public static Empleado crearEmpleado(String line) {

        //SPLIT DE LA CADENA POR COMAS QUE DEVUELVE UNA LISTA
        String cadena = line;
        String[] parts = cadena.split("\\,");
        List<String> listLinea = new ArrayList<String>();
        listLinea = Arrays.asList(parts);
        
        //SE OBTIENE LA FECHA Y SE LA FORMATEA A LOCALDATE
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(listLinea.get(2), formatter);
        
        //SE CONVIERTE SUELDO A BIGDECIMAL
        BigDecimal num = new BigDecimal(listLinea.get(3));
        
        //INSTANCIA EMPLEADO Y AGREGADO A LISTA DE EMPLEADOS
        Empleado empleado = new Empleado(listLinea.get(0), listLinea.get(1), localDate, num);
        
        return empleado;
    }

    public static List<Empleado> letraApellido( List<Empleado> listaEmpleados, String letraDada ) {

        List<Empleado> listaEmpleadosApellidoxLetra = new ArrayList<Empleado>();
        for (Empleado emp : listaEmpleados){
            if ( (emp.apellido).charAt(0) ==  letraDada.charAt(0)) {
                listaEmpleadosApellidoxLetra.add(emp);
            }
        }
        return listaEmpleadosApellidoxLetra;
    }

    public static Integer edadEmpleado(Empleado emp) {
        LocalDate now = LocalDate.now();
        int edad;
        if ((emp.fechaNacimiento).getMonthValue() < now.getMonthValue()) {
            //EL MES DE NACIMIENTO ES MENOR AL ACTUAL Y YA CUMPLIO A??OS
            edad = now.getYear() - (emp.fechaNacimiento).getYear();

        } else if (  (emp.fechaNacimiento).getMonthValue() == now.getMonthValue()  ) {

            //EL MES DE NACIMIENTO ES IGUAL AL ACTUAL Y HAY QUE CONTROLAR EL DIA
            if ( (emp.fechaNacimiento).getDayOfMonth() <= now.getDayOfMonth()  ) {
                
                //YA PASO O ES EL DIA DE SU CUMPLEA??OS
                edad = now.getYear() - (emp.fechaNacimiento).getYear();

            } else {

                //ES EL MES DE SU CUMPLEA??OS PERO TODAVIA NO CUMPLIO
                edad = now.getYear() - (emp.fechaNacimiento).getYear() - 1;

            }

        } else {

            //EL MES DE NACIMIENTO ES MAYOR AL ACTUAL Y TODAVIA NO CUMPLIO A??OS
            edad = now.getYear() - (emp.fechaNacimiento).getYear() - 1;
        }

        return edad;
    }

    public static Empleado empleadoMasJoven(List<Empleado> listaEmpleados) {

        int edad = 200;
        Empleado empJoven = listaEmpleados.get(0);

        for (Empleado emp : listaEmpleados) {

            if ( edadEmpleado(emp) < edad ) {
                empJoven = emp;
                edad = edadEmpleado(emp);
            }
        }

        return empJoven;

    }

    public static Empleado empleadoMasViejo(List<Empleado> listaEmpleados) {

        int edad = 0;
        Empleado empViejo = listaEmpleados.get(0);

        for (Empleado emp : listaEmpleados) {

            if ( edadEmpleado(emp) > edad ) {
                empViejo = emp;
                edad = edadEmpleado(emp);
            }
        }

        return empViejo;

    }

    public static Empleado empleadoMasGana(List<Empleado> listaEmpleados) {
        
        Empleado empMasRemunerado = listaEmpleados.get(0);

        for (Empleado emp : listaEmpleados) {

            if ( (emp.sueldo).compareTo(empMasRemunerado.sueldo) > 0 ) {
                empMasRemunerado = emp;
            }
        }

        return empMasRemunerado;
    }

    public static Empleado empleadoMenosGana(List<Empleado> listaEmpleados) {
        
        Empleado empMenosRemunerado = listaEmpleados.get(0);

        for (Empleado emp : listaEmpleados) {

            if ( (emp.sueldo).compareTo(empMenosRemunerado.sueldo) < 0 ) {
                empMenosRemunerado = emp;
            }
        }

        return empMenosRemunerado;
    }



}
