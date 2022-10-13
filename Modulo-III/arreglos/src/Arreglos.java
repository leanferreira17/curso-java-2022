public class Arreglos {
    public static void main(String[] args) {
        // ejemplos de arreglos
        // tipo de dato + nombre de la variable + [] = new tipo de dato [cantidad de elementos];

        int valores[] = new int[10]; // n -> 0 a 9 (n - 1)
        Auto autos[] = new Auto[10];

        int numeros[] = {4, 5, 7, 8, 2, 4, 6, 7, 6};

        Auto auto1 = new Auto();
        auto1.setMarca("BMW");

        Auto arregloDeAutos[] = {auto1, new Auto(), new Auto()};

        int numero = numeros[0];
        Auto auto = arregloDeAutos[0];

        System.out.println("El numero es: " + numero);
        System.out.println(auto.toString());

        System.out.println(valores);
        System.out.println(autos);
    }
}

class Auto {
    private float precio;
    private String marca;

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + " Precio: " + this.precio;
    }
}
