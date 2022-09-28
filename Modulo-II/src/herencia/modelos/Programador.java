package herencia.modelos;

public class Programador extends Trabajador {
    public Programador(float salario, int cantidadDeDiasDeVacaciones, int antiguedad) {
        super(salario, cantidadDeDiasDeVacaciones, antiguedad);
    }

    public Programador(String nombre, int edad, String colorDePelo, float salario, int cantidadDeDiasDeVacaciones, int antiguedad) {
        super(nombre, edad, colorDePelo, salario, cantidadDeDiasDeVacaciones, antiguedad);
    }
}
