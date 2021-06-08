package EjerciciosComplementariosLevel1;

import java.util.* ; 
 
public class ejercicio8 { 
     
    public static void main(String[] arg) { 
                 
        Scanner scan = new Scanner(System.in); 
 
        System.out.println("ingrese los siguientes datos ..."); 
        System.out.println("Nombre y Apellido"); 
        System.out.println("Edad"); 
        System.out.println("Dirección"); 
        System.out.println("Ciudad"); 
         
        String nomyap = scan.nextLine(); 
        String edad = scan.nextLine(); 
        String dir = scan.nextLine(); 
        String city = scan.nextLine(); 
     
        System.out.println(nomyap + " - "+ edad + " - " +  dir + " - " + city) ; 
 
        scan.close(); 
      } 
    }