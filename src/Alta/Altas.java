package Alta;

import Alumnos.Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

public class Altas {
    private ArrayList<Alumnos> listaAlumnos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void registrarAlumnos() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Introduce los datos del alumno " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume el salto de línea
            System.out.print("Nombre completo: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consume el salto de línea
            System.out.print("Fecha de nacimiento (dd-mm-aaaa): ");
            String fechaNacimiento = scanner.nextLine();
            System.out.print("Asignatura 1: ");
            String asignatura1 = scanner.nextLine();
            System.out.print("Nota de Asignatura 1: ");
            float nota1 = scanner.nextFloat();
            scanner.nextLine();  // Consume el salto de línea
            System.out.print("Asignatura 2: ");
            String asignatura2 = scanner.nextLine();
            System.out.print("Nota de Asignatura 2: ");
            float nota2 = scanner.nextFloat();
            scanner.nextLine();  // Consume el salto de línea

            Alumnos alumno = new Alumnos(id, nombre, edad, fechaNacimiento, asignatura1, nota1, asignatura2, nota2);
            listaAlumnos.add(alumno);
        }
    }

    public void mostrarListado() {
        System.out.println("Listado de alumnos:");
        for (Alumnos alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    public ArrayList<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }
}
