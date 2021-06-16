package EjercicioPropuesto5;
import java.util.*;
import java.io.*;

public class ejercicio5{
    public static void main(String[] args) throws IOException {

        String path = "C:\\TACCA\\INFORMATORIO\\ETAPA 3\\INFORMATORIOJAVA2021\\JAVAINFO2021\\EjercicioPropuesto5\\alumnos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path)))  {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();

            }

        }
    }
}
