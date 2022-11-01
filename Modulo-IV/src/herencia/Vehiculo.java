package herencia;

public class Vehiculo extends Object {
    // atributos comunes para los vehiculos
    private float peso;
    private double precio;

    public Vehiculo(float peso, double precio, int cantidadDeRuedas, byte cantidadDePuertas) {
        this.peso = peso;
        this.precio = precio;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }

    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public byte getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(byte cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    private int cantidadDeRuedas;
    private byte cantidadDePuertas;
}
