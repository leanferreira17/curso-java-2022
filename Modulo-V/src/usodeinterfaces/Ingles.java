package usodeinterfaces;

public class Ingles extends Persona implements Accionable, Detallable {

    @Override
    public String saludar() {
        return "Good morning!";
    }

    @Override
    public String brindarDatos() {
        return this.getClass().getCanonicalName();
    }
}
