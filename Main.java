import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Lucía Gómez", 8.5));
        alumnos.add(new Alumno("Mateo Pérez", 7.0));
        alumnos.add(new Alumno("Valentina Ruiz", 9.5));

        alumnos.add(new Alumno("Lucía Gómez", 8.5));

        System.out.println("Listado de alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
