package primitivos;

public class PrincipalTiposPrimitivos {
    public static void main(String[] args) {
        /* Tipos primitivos en Java

        Para declarar un tipo primitivo la sintaxis es la siguiente:
        [tipo primitivo] + [nombre];

        Para inicializarlo le asignamos un valor:
        [nombre] = [valor];

        También podemos declarar e inicializar en un solo paso:
        [tipo primitivo] + [nombre] = [valor];

        */

        /* Para imprimir en la consola y poder comprobar el valor de una variable
        utilizamos la siguiente sintaxis:

        System.out.println();

        Dentro de este método podemos agregar una cadena de caracteres que nos permita detallar lo
        que se está imprimiendo:

        System.out.println("El valor de la variable es:" + variable);

        */

        // byte
        byte edadDelInfante = 1;
        System.out.println("La edad del infante es: " + edadDelInfante);

        // short
        short edadDeLaPersonaAdulta = 67;
        System.out.println("La edad de la persona adulta es: " + edadDeLaPersonaAdulta);

        // int
        int cantidadDe; // declaración de variable
        cantidadDeArticulos = 13465; // inicialización una variable

        int cantidadDeArticulosVendidos = 45; // declaración e inicialización en un solo paso

        System.out.println("Cantidad de articulos: " + cantidadDeArticulos);
        System.out.println("Cantidad de articulos vendidos: " + cantidadDeArticulosVendidos);

        // long
        long cantidadDeHabitantesEnArgentina = 50000000L;
        System.out.println("Habitantes del territorio argentino: " + cantidadDeHabitantesEnArgentina);
        //System.out.println("Maximo valor para Long: " + Long.MAX_VALUE);

        // float
        float distanciaEntreBuenosAiresYCordobaEnKilometros = 699.45F;
        System.out.println("Distancia entre Bs As y Cba (en kms): " + distanciaEntreBuenosAiresYCordobaEnKilometros);

        // double
        double pesoDeUnAutomovilPromedio = 2987.4765D;
        System.out.println("Peso promedio de un automovil: " + pesoDeUnAutomovilPromedio);

        // char
        char primeraLetraDelAlfabetoEnMayúscula = 'A';
        System.out.println("Primera letra del alfabeto (en mayúscula): " + primeraLetraDelAlfabetoEnMayúscula);

        // boolean
        boolean esCovidPositivo = true;
        System.out.println(esCovidPositivo);
    }
}
