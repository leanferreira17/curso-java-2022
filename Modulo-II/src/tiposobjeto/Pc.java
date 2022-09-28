package tiposobjeto;

public class Pc {
    // miembros de clase: metodos y atributos
    private short cantidadDeNucleos;
    private int ram;
    private String marca;
    private boolean esNueva; // valor por default: false
    private float precio;
    private float indiceDeInflacion; // valor por default: 0.0

    // this: variable que se crea en cada instanciacion de un objeto

    // constructor con parámetros de la clase
    public Pc(short cantidadDeNucleos, int ram, String marca, boolean esNueva, float indiceDeInflacion, float precio) {
        this.cantidadDeNucleos = cantidadDeNucleos;
        this.ram = ram;
        this.marca = marca;
        this.esNueva = esNueva;
        this.precio = precio;
        this.indiceDeInflacion = indiceDeInflacion;
    }

    // constructor sin parámetros
    public Pc() {

    }

    public float getPrecioTotal() {
        return precio * indiceDeInflacion;
    }

    // ¿Cómo se declara un método en Java?
    // modificador de acceso + tipo (primitivo u objeto o void) + nombre en cammel case + (parámetros formales) + {} +
    // return (opcional si no es void)

    // setters
    public void setIndiceDeInflacion(float nuevoValorDelIndice) {
        this.indiceDeInflacion = nuevoValorDelIndice;
    }

    // getters
    public float getIndiceDeInflacion() {
        return this.indiceDeInflacion;
    }
}
