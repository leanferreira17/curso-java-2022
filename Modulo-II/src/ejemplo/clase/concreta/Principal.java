package ejemplo.clase.concreta;

public class Principal {

    public static void main(String[] args) {

        // ejecutar lo necesario para que la app funcione
        Estudiante estudiante = new Estudiante(3, 345.78f);
        //Estudiante estudiante = new Estudiante("Pedro", "Perez");

        //Estudiante estudiante = new Estudiante(3, 456.78f, "Maria", "Perez");

        estudiante.setNombre("Ana");
        //estudiante.setApellido("Alvarez");
        System.out.println(estudiante.toString());
    }

}
