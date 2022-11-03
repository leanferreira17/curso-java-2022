package herencia.polimorfismo;

public abstract class Persona {

    String nombre;
    char sexo;

    protected abstract void saludar();
    protected abstract String decirSuNombre();
    protected abstract int darNumeroDeDocumento();

}
