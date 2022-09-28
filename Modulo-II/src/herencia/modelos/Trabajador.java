package herencia.modelos;

public class Trabajador extends Persona {
    private float salario;
    private int cantidadDeDiasDeVacaciones;
    private int antiguedad;

    public Trabajador(float salario, int cantidadDeDiasDeVacaciones, int antiguedad) {
        this.salario = salario;
        this.cantidadDeDiasDeVacaciones = cantidadDeDiasDeVacaciones;
        this.antiguedad = antiguedad;
    }

    public Trabajador(String nombre, int edad, String colorDePelo, float salario, int cantidadDeDiasDeVacaciones, int antiguedad) {
        super(nombre, edad, colorDePelo);
        this.salario = salario;
        this.cantidadDeDiasDeVacaciones = cantidadDeDiasDeVacaciones;
        this.antiguedad = antiguedad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCantidadDeDiasDeVacaciones() {
        return cantidadDeDiasDeVacaciones;
    }

    public void setCantidadDeDiasDeVacaciones(int cantidadDeDiasDeVacaciones) {
        this.cantidadDeDiasDeVacaciones = cantidadDeDiasDeVacaciones;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "edad=" + edad +
                ", sexo=" + sexo +
                ", colorDeOjos='" + colorDeOjos + '\'' +
                ", tonoDePiel='" + tonoDePiel + '\'' +
                ", peso=" + peso +
                ", salario=" + salario +
                ", cantidadDeDiasDeVacaciones=" + cantidadDeDiasDeVacaciones +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
