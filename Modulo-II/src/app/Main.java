package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // definimos un array de 2 elementos porque sabemos la cantidad total que queremos persistir

        imprimirMensaje("Bienvenido");
        imprimirMensaje("Ingrese la cantidad de cursos que desea crear: ");

        // cantidadDeCursos > 10 o < 1 -> "No se pueden crear cursos para los valores ingresados"

        short cantidadDeCursos = scanner.nextShort();

        if (cantidadDeCursos > 10) {
            imprimirMensaje("No se pueden crear cursos para los valores ingresados");
        } else if (cantidadDeCursos < 1) {
            imprimirMensaje("No se pueden crear cursos para los valores ingresados");
        }

        Curso[] arrayDeCursos = new Curso[cantidadDeCursos];

        imprimirMensaje("Ingrese nombre del curso: ");

        String nombreDelCurso = scanner.nextLine(); // capturar el nombre del curso

        imprimirMensaje("Ingrese cantidad de alumnos: ");

        short cantidadDeAlumnos = scanner.nextShort(); // captura la cantidad de alumnos

        imprimirMensaje("Duración del curso (dias): ");

        int duracionDelCurso = scanner.nextInt(); // captura la duración del curso en dias

        imprimirMensaje("Es presencial (true o false):");

        boolean esPresencial = scanner.nextBoolean();
        scanner.nextLine(); // fix

        // creamos la instancia de Curso
        Curso curso = new Curso(cantidadDeAlumnos, duracionDelCurso, esPresencial, nombreDelCurso);

        // asigno el 1er curso al array
        arrayDeCursos[0] = curso;

        imprimirMensaje("Ahora cargue el 2do curso");
        imprimirMensaje("Ingrese nombre del curso: ");
        
        nombreDelCurso = scanner.nextLine(); // capturar el nombre del curso y pisa lo anterior

        imprimirMensaje("Ingrese cantidad de alumnos: ");

        cantidadDeAlumnos = scanner.nextShort(); // captura la cantidad de alumnos

        imprimirMensaje("Duración del curso (dias): ");

        duracionDelCurso = scanner.nextInt(); // captura la duración del curso en dias

        imprimirMensaje("Es presencial (true o false):");

        esPresencial = scanner.nextBoolean();

        // creamos la instancia de Curso
        Curso curso2 = new Curso(cantidadDeAlumnos, duracionDelCurso, esPresencial, nombreDelCurso);

        arrayDeCursos[1] = curso2;

        imprimirMensaje("Ahora seleccione cual curso desea mostrar: 1 o 2?");
        int indiceDelCursoAMostrar = scanner.nextInt();

        Curso cursoSeleccionado = arrayDeCursos[indiceDelCursoAMostrar - 1]; // [0, 1] n = 2

        imprimirDetalle(cursoSeleccionado);

        /*System.out.println("Ingrese nueva cantidad de alumnos: ");

        short nuevaCantidadDeAlumnos = scanner.nextShort();
        curso.setCantidadDeAlumnos(nuevaCantidadDeAlumnos);

        System.out.println("Detalles del curso creado:");
        System.out.println("Nombre: " + curso.getNombreDelCurso());
        System.out.println("Cantidad de alumnos: " + curso.getCantidadDeAlumnos());
        System.out.println("Duracion (dias): " + curso.getDuracionDelCurso());
        System.out.println("Es presencial? " + curso.esPresencial());*/
    }

    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void imprimirDetalle(Curso cursoSeleccionado) {
        System.out.println("Detalles del curso creado:");
        System.out.println(cursoSeleccionado.toString());
    }

    public static void persistirEnMemoria() {
        // estructuras de datos

        // Array (vector)
        String[] arrayDeNombres = new String[3];

        //System.out.println(arrayDeNombres);

        // [1, 2, 3] indices -> 0 a n-1 (n es el total de elementos que admite)
        // [0, 1, 2] el primer elemento de un array se encuentra en el índice 0

        arrayDeNombres[0] = "Martina";
        arrayDeNombres[1] = "Pedro";
        arrayDeNombres[2] = "Agustina";

        System.out.println(arrayDeNombres[1]);

        float[] pesos = new float[5];
        pesos[0] = 45.67f;
        pesos[1] = 67.89f;

        boolean[] arrayDeBooleans = new boolean[78];
        arrayDeBooleans[77] = false;

        int[] edades = {2, 4, 5, 6, 7, 89, 54, 32, 675};
        System.out.println(edades[2]);

        // Listas: ArrayList
        ArrayList listaDeNombres = new ArrayList();
        listaDeNombres.add("Sergio"); // 0
        listaDeNombres.add("Juana");
        listaDeNombres.add("Pedro");
        listaDeNombres.add("Anastasia");
        listaDeNombres.add("Marcos"); // 4 (n - 1)

        System.out.println(listaDeNombres.get(4));
    }

}
