public class PersonaSubClase extends Humano {
    public static void main(String[] args) {
        PersonaSubClase personaSubClase = new PersonaSubClase();

        //Ingrediente[] ingredientes = {new Ingrediente(), new Agua(), new Acido()};
        Acido acido = new Acido();
        Ingrediente ingrediente = new Ingrediente();

        System.out.println(acido instanceof Ingrediente);

        // (condicion) ? valor a asignar si es true : valor a asignar si es false;

        int resultado = (34 >= 90) ? 1 : 0;
        boolean resultadoBooleano = ("palabra".contains("b")) ? true : false;
        System.out.println("El resultado: " + resultado);

    }

    public PersonaSubClase() {
        //super.raza = "nueva raza humana";
        //Humano.EDAD;
    }
}

class Ingrediente {

}

class Acido extends Ingrediente {

}

class Agua extends Ingrediente{

}