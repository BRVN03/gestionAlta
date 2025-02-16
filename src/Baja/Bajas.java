package Baja;

import Alta.Altas;

import java.util.Scanner;

public class Bajas {
    private Scanner scanner = new Scanner(System.in);
    private Altas altas;

    public Bajas(Altas altas) {
        this.altas = altas;
    }

    public void eliminarAlumno() {
        System.out.println("Introduce el ID del alumno que se dara de baja:");
        int id = scanner.nextInt();
        altas.getListaAlumnos().removeIf(alumno -> alumno.getId() == id);
    }
}
