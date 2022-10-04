package ejemplo.clase.concreta;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int antiguedad;
    private float cuota;

    private float getValorCuota() {
        return antiguedad * cuota;
    }

    public Estudiante() {}

    public Estudiante(int antiguedad, float cuota) {
        this.antiguedad = antiguedad;
        this.cuota = cuota;
    }

    public Estudiante(float cuota, int antiguedad) {
        this.cuota = cuota;
        this.antiguedad = antiguedad;
    }

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante(int antiguedad, float cuota, String nombre, String apellido) {
        this.antiguedad = antiguedad;
        this.cuota = cuota;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Valor cuota: " + getValorCuota();
    }

}
