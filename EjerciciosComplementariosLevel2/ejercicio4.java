package EjerciciosComplementariosLevel2;
import java.util.*;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido, ingrese el nombre de 12 alumnos.");
        String alumno = "";

        ArrayList<String> alumnosList = new ArrayList<String>();

        for (int i = 1; i <= 12 ; i = i + 1){
            alumno = scan.nextLine();
            alumnosList.add(alumno);

            System.out.println("Ingrese otro alumno por favor.");
        }

        for (int i = 0; i < alumnosList.size() ; i = i + 1){
            System.out.print("# "+ alumnosList.get(i) + " ");
        }
        
        ArrayList<String> curso1ArrayList = new ArrayList<String>(alumnosList.subList(0, 3));
        ArrayList<String> curso2ArrayList = new ArrayList<String>(alumnosList.subList(4, 8));
        ArrayList<String> curso3ArrayList = new ArrayList<String>(alumnosList.subList(9, 12));

        System.out.println("");

        System.out.println("Alumnos del curso 1:");

        for (int i = 0; i < curso1ArrayList.size() ; i = i + 1){
            System.out.print("# "+ curso1ArrayList.get(i) + " ");
        }
        System.out.println("");


        System.out.println("Alumnos del curso 2:");

        for (int i = 0; i < curso2ArrayList.size() ; i = i + 1){
            System.out.print("# "+ curso2ArrayList.get(i) + " ");
        }
        System.out.println("");


        System.out.println("Alumnos del curso 3:");

        for (int i = 0; i < curso3ArrayList.size() ; i = i + 1){
            System.out.print("# "+ curso3ArrayList.get(i) + " ");
        }
        System.out.println("");

        scan.close();
    }
    
}
