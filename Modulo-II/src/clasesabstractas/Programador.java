package clasesabstractas;

public class Programador extends Persona{
    /*
    * Este método debe ser sobreescrito por heredarlo de su superclase
    * */
    @Override
    public void saludar(String saludo) {
        // aca es dónde le agregamos comportamiento al método heredado
    }

    public Programador(String name) {

    }

    public Programador(String direccion, int numeracion) {

    }

    public Programador(int numeracion, String direccion) {

    }

    public Programador(int numeracion) {

    }
}
