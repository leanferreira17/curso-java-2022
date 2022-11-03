package herencia.polimorfismo;

public class PersonaArgentina extends Persona {

    char sexo;

    @Override
    protected void saludar() {
        System.out.println("Hola que tal");
    }

    @Override
    protected String decirSuNombre() {
        return "Damian";
    }

    @Override
    protected int darNumeroDeDocumento() {
        return 34567890;
    }

}
