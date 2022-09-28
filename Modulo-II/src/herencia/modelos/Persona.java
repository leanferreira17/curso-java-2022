package herencia.modelos;

public class Persona extends Humano {
    private String nombre;
    private String colorDePelo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public int getEdad() {
        return super.edad;
    }

    /*
    * Constructor sin parámetros
    * */
    public Persona() {
    }

    /*
     * Constructor con parámetros
     * */
    public Persona(String nombre, int edad, String colorDePelo) {
        super.edad = edad;
        this.nombre = nombre;
        this.colorDePelo = colorDePelo;
    }
}
