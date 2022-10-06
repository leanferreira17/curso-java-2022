package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Ingrese nombre del curso: ");

        String nombreDelCurso = scanner.nextLine(); // capturar el nombre del curso

        System.out.println("Ingrese cantidad de alumnos: ");

        short cantidadDeAlumnos = scanner.nextShort(); // captura la cantidad de alumnos

        System.out.println("Duración del curso (dias): ");

        int duracionDelCurso = scanner.nextInt(); // captura la duración del curso en dias

        System.out.println("Es presencial (true o false):");

        boolean esPresencial = scanner.nextBoolean();

        // creamos la instancia de Curso
        Curso curso = new Curso(cantidadDeAlumnos, duracionDelCurso, esPresencial, nombreDelCurso);

        System.out.println("Detalles del curso creado:");
        System.out.println("Nombre: " + curso.getNombreDelCurso());
        System.out.println("Cantidad de alumnos: " + curso.getCantidadDeAlumnos());
        System.out.println("Duracion (dias): " + curso.getDuracionDelCurso());
        System.out.println("Es presencial? " + curso.esPresencial());

        System.out.println("Ingrese nueva cantidad de alumnos: ");

        short nuevaCantidadDeAlumnos = scanner.nextShort();
        curso.setCantidadDeAlumnos(nuevaCantidadDeAlumnos);

        System.out.println("Detalles del curso creado:");
        System.out.println("Nombre: " + curso.getNombreDelCurso());
        System.out.println("Cantidad de alumnos: " + curso.getCantidadDeAlumnos());
        System.out.println("Duracion (dias): " + curso.getDuracionDelCurso());
        System.out.println("Es presencial? " + curso.esPresencial());
    }

}
