package usodeinterfaces;

public class Argentino extends Persona implements Accionable, Detallable {

    @Override
    public String saludar() {
        return "Hola que tal!";
    }

    @Override
    public String brindarDatos() {
        return this.getClass().getName();
    }
}
