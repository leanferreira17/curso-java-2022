package usodeinterfaces;

public class Principal {
    public static void main(String[] args) {
        Argentino argentino = new Argentino();
        Ingles ingles = new Ingles();

        Persona [] personas = {argentino, ingles};

        for (Persona persona : personas) {
            System.out.println(persona.saludar());
        }

    }
}
