import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class PrincipalArrays {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        Articulo articulo1 = new Articulo("Escoba", 4, 1.98F);
        Articulo articulo2 = new Articulo("Vaso", 2, 134.54F);
        Articulo articulo3 = new Articulo("Plato", 3, 12.76F);
        Articulo articulo4 = new Articulo("Tacho", 1, 500.0F);

        Moto moto = new Moto("BMW");
        Moto moto2 = new Moto("Honda");

        arrayList.add(articulo1);
        arrayList.add(articulo2);
        arrayList.add(moto2);
        arrayList.add(articulo3);
        arrayList.add(articulo4);
        arrayList.add(moto);
        arrayList.add(moto);

        for (Object elemento : arrayList) {
            if (elemento instanceof Articulo) {
                System.out.println(((Articulo) elemento).getNombre());
            } else {
                System.out.println(((Moto) elemento).getMarca());
            }
        }

        System.out.println(arrayList);

        TreeSet<Articulo> articulos = new TreeSet<>();

        articulos.add(articulo1);
        articulos.add(articulo2);
        articulos.add(articulo3);
        articulos.add(articulo4);
        articulos.add(articulo1);

        System.out.println("El tamaño del TreeSet es de " + articulos.size() + " cuando le insertamos 5 articulos.");
        System.out.println("Primer elemento: " + articulos.first().getNombre());

        HashMap<Integer, Double> integerStringHashMap = new HashMap<>(5);
        integerStringHashMap.put(1, 34D);
        integerStringHashMap.put(2, 567D);
        integerStringHashMap.put(3, 6D);

        System.out.println(integerStringHashMap.put(4, 43D));
        System.out.println(integerStringHashMap.get(1));
    }
}

class Articulo implements Comparable {
    private String nombre;
    private int indice;
    private float precio;

    public Articulo(String nombre, int indice, float precio) {
        this.nombre = nombre;
        this.indice = indice;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getIndice() {
        return this.indice;
    }

    public float getPrecio() {
        return this.precio;
    }

    @Override
    public int compareTo(Object o) {
        //return Integer.compare(this.indice, ((Articulo) o).getIndice());
        return Float.compare(this.precio, ((Articulo) o).getPrecio());
    }
}

class Moto {

    private String marca;

    public Moto(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
