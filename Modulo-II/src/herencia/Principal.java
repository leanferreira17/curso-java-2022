package herencia;

import herencia.modelos.Humano;
import herencia.modelos.Persona;
import herencia.modelos.Programador;
import herencia.modelos.Trabajador;

public class Principal {
    public static void main(String[] args) {
        /*
        * Recordemos que una clase abstract no puede ser instanciada
        * */
        // Humano humano = new Humano();

        /*
        * Analicemos como le pasamos una edad a esta persona pero en realidad estamos
        * asignando el valor a su superclase, de ella hereda la edad
        * */
        Persona persona = new Persona("Andrea", 23, "Negro");
        System.out.println("La edad de " + persona.getNombre() + " es " + persona.getEdad() + " años.");

        float salario = 23456.56F;
        int cantidadDeDiasDeVacaciones = 30;
        int antiguedadEnLaCompania = 20;

        Trabajador trabajador = new Trabajador(salario, cantidadDeDiasDeVacaciones, antiguedadEnLaCompania);
        trabajador.setNombre("Pedro");

        System.out.println("El trabajador se llama " + trabajador.getNombre() + ", y en las próximas vacaciones" +
                " gozará de " + trabajador.getCantidadDeDiasDeVacaciones() + " días.");

        /*
        * Por qué no podemos imprimir el nombre del trabajador pero sí la cantidad de días?
        * Modificando algo deberiamos poder. Realizar las modificaciones necesarias.
        * */

        Programador programador = new Programador("Alan", 22, "Azul", 1000F, 15, 1);
        System.out.println(programador.toString());

        /*
         * Revisar el método toString() en la clase Programador. Por qué está marcado con @Override?
         * Por qué no podemos imprimir el colorDeOjos del programador pero sí la cantidad de días de vacaciones?
         *
         * Necesitamos agregar un atributo nuevo: lenguaje preferido, debemos poder instanciar un objeto Programador
         * con este nuevo atributo de clase y poder imprimirlo en el método toString()
         * Realizar las modificaciones necesarias.
         * */
    }
}
