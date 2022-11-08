package herencia.polimorfismo;

public abstract class Persona extends Humano {

    String nombre;
    char sexo;

    protected abstract void saludar();
    protected abstract String decirSuNombre();
    protected abstract int darNumeroDeDocumento();

    public void imprimirSecuenciaDeADNSinOverride() {
        System.out.println("ADN animal");
    }

}
