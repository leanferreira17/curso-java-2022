package herencia.polimorfismo;

public class PrincipalPersonas {

    public static void main(String[] args) {
        // Polimorfismo: la capacidad de responder de manera personalizada ante el mismo mensaje

        PersonaArgentina argentina = new PersonaArgentina();
        argentina.sexo = AuxPersona.femenino;

        AuxPersona auxPersona = new AuxPersona();
        // auxPersona.masculino;

        PersonaInglesa inglesa = new PersonaInglesa();

        PersonaBrasilera brasilera = new PersonaBrasilera();

        Persona[] personas = {argentina, inglesa, brasilera};

        for (Persona persona : personas) {
            persona.saludar();
        }

    }

}
