package herencia.polimorfismo;

public class PersonaBrasilera extends Persona {

    @Override
    protected void saludar() {
        System.out.println("Bom dia!");
    }

    @Override
    protected String decirSuNombre() {
        return "Joao";
    }

    @Override
    protected int darNumeroDeDocumento() {
        return 0;
    }

}
