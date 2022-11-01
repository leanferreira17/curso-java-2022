package herencia;

public class Auto extends Vehiculo {

    @Override
    public String toString() {
        return "Auto{" +
                "levantaCristales=" + levantaCristales +
                '}';
    }

    public boolean isLevantaCristales() {
        return levantaCristales;
    }

    public void setLevantaCristales(boolean levantaCristales) {
        this.levantaCristales = levantaCristales;
    }

    private boolean levantaCristales;

    public Auto(boolean levantaCristales, float peso, double precio, int cantidadDeRuedas, byte cantidadDePuertas) {
        super(peso, precio, cantidadDeRuedas, cantidadDePuertas);
        this.levantaCristales = levantaCristales;
    }

}
