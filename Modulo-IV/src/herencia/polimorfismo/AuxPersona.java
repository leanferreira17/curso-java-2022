package herencia.polimorfismo;

public class AuxPersona {
    public static final char SEXO_MASCULINO = 'M';
    public static final char SEXO_FEMENINO = 'F';
    public static int indice;

    public AuxPersona() {
        this.indice++;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public static String apellido;
}
