package herencia;

public class Moto extends Vehiculo {

    private boolean patita;

    public Moto(boolean patita, float peso, double precio, int cantidadDeRuedas, byte cantidadDePuertas) {
        super(peso, precio, cantidadDeRuedas, cantidadDePuertas);
        this.patita = patita;
    }

}
