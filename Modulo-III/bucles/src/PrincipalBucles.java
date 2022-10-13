public class PrincipalBucles {
    public static void main(String[] args) {
        // for
        // lo usamos cuando conocemos la cantidad de iteraciones a realizar

        int arreglo [] = {1, 2, 3, 4, 5, 6};
        int acumulador = 0;

        for (int i = 0 ; i < arreglo.length; i++) {
            acumulador += arreglo[i];
        }

        System.out.println("La suma es " + acumulador);

        // while
        // lo usamos cuando no conocemos la cantidad de iteraciones a realizar

        int valor = 5;

        while (valor < 10) {
            System.out.println("El valor es: " + valor);
            valor++;
        }

        // do while
        int valor2 = 5;

        do {
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
        }

        // foreach
        Persona [] arregloDePersonas = {new Persona("Marta"), new Persona("Dario"), new Persona("Adrian")};
        // arregloDePersonas[0] = new Persona("Leandro");
        // arregloDePersonas[1] = new Persona("Ana");

        for (Persona persona : arregloDePersonas) {
            System.out.println(persona.toString());
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
