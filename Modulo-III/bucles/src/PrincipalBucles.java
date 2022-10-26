public class PrincipalBucles {
    public static void main(String[] args) {
        // for
        // lo usamos cuando conocemos la cantidad de iteraciones a realizar
/*
        int[] arreglo = {1, 2, 3, 4, 5, 6};
        int acumulador = 0;

        // i++ -> i = i + 1

        for (int i = 0; i < arreglo.length; i = i + 1) {
            acumulador = acumulador + arreglo[i];
        }


        // Decremento
        int[] arregloDecremento = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // i-- -> i = i - 1

        for (int i = arregloDecremento.length - 1; i > - 1; i = i - 1) {
            System.out.println(arregloDecremento[i]);
        }



        // Imprimir solo valores pares

        int[] arregloPares = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int y = 1; y < arregloPares.length; y = y + 2) {
            System.out.println(arregloPares[y]);
        }

        for (double y = 4.56; y <= 5.01; y = y + 0.01) {
            System.out.println(y);
        }

        // nombres
        String[] nombres = {"Matias", "Ana", "Pedro", "Laura", "Maria"};

        // edades
        short[] edades = {23, 43, 67, 42, 11};

        // Imprimir en consola cada nombre con su edad
        // Matias 11, Ana 42, Pedro 67, ...

        // Resolver implementando 2 bucles si se puede

        // while
        // lo usamos cuando no conocemos la cantidad de iteraciones a realizar

        int valor = 17;

        while (valor < 10) {
            System.out.println("El valor es: " + valor);
            valor++;
        }

        // do while
        int valor2 = 5;

        do { // por mas que la condicion sea falsa, el cuerpo se ejecutará al menos 1 vez
            System.out.println("El valor es: " + valor2);
            valor2++;
        }
        while (valor2 > 10);

        // uso del break
        for (int i = 0; i < 10000; i++) {
            if (i == 5) {
                System.out.println("Fin del bucle for.");
                break;
            }
            System.out.println("El valor de i es: " + i);
        }


        // uso del continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("El valor de i es: " + i);
        }*/

        // foreach
        //Persona [] arregloDePersonas = {new Persona("Marta"), new Persona("Dario"), new Persona("Adrian")};
        // arregloDePersonas[0] = new Persona("Leandro");
        // arregloDePersonas[1] = new Persona("Ana");

        //for (Persona persona : arregloDePersonas) {
        //    System.out.println(persona.toString());
        //}


        int[] numberList = {1, 2, 3, 4, 5};

        for (int number : numberList) {
            //System.out.println(number);
        }

    }
}

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
