package herencia.polimorfismo;

public class PrincipalPersonas {

    public static void main(String[] args) {
        // Polimorfismo: la capacidad de responder de manera personalizada ante el mismo mensaje
        PersonaArgentina argentina = new PersonaArgentina();

        short resultado = (argentina instanceof Persona) ? 10 : (short) -5;
        System.out.println(resultado);


        // instanceof
        if (argentina instanceof Persona) {
            System.out.println("es instancia de Persona");
        } else {
            System.out.println("No es instancia");
        }

        argentina.sexo = AuxPersona.SEXO_FEMENINO;

        System.out.println(AuxPersona.SEXO_FEMENINO);


        // uso del indice static
        AuxPersona auxPersona = new AuxPersona();
        System.out.println(AuxPersona.indice);

        auxPersona.setIndice(1000);

        AuxPersona auxPersona1 = new AuxPersona();
        System.out.println(AuxPersona.indice);


        // polimorfismo
        PersonaInglesa inglesa = new PersonaInglesa();

        PersonaBrasilera brasilera = new PersonaBrasilera();

        Persona[] personas = {argentina, inglesa, brasilera};

        for (Persona persona : personas) {
            persona.saludar();
        }

    }

}
