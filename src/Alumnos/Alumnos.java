package Alumnos;

public class Alumnos {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String asignatura1;
    private float nota1;
    private String asignatura2;
    private float nota2;

    public Alumnos(int id, String nombre, int edad, String fechaNacimiento, String asignatura1, float nota1, String asignatura2, float nota2) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignatura1 = asignatura1;
        this.nota1 = nota1;
        this.asignatura2 = asignatura2;
        this.nota2 = nota2;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Asignatura 1: " + asignatura1 + " (Nota: " + nota1 + "), Asignatura 2: " + asignatura2 + " (Nota: " + nota2 + ")";
    }
}




