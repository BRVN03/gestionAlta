package Main;

import Alta.Altas;
import Baja.Bajas;

public class Main {
    public static void main(String[] args) {
        Altas altas = new Altas();
        Bajas bajas = new Bajas(altas);

        altas.registrarAlumnos();

        altas.mostrarListado();

        bajas.eliminarAlumno();

        altas.mostrarListado();
    }
}


