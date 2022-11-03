package herencia.polimorfismo;

public class PersonaInglesa extends Persona {

    @Override
    protected void saludar() {
        System.out.println("Good morning!");
    }

    @Override
    protected String decirSuNombre() {
        return "Jack";
    }

    @Override
    protected int darNumeroDeDocumento() {
        return 0;
    }

}
