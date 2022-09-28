package tiposobjeto;

public class Principal {
    public static void main(String[] args) {
        int edad = 78;
        int edadMayor = 101;

        System.out.println(edad - edadMayor);

        // Wrapper
        System.out.println(Integer.MIN_VALUE);

        // [tipo (clase)] + [nombre];
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora);

        short cantidadDeNucleos = 4;
        int ram = 1024;
        String marca = "HP"; // esta inicialización es válida aunque se trate de un objeto de la clase String
        boolean esNueva = true;

        // instanciación de un objeto
        Pc miPc = new Pc(cantidadDeNucleos, ram, "HP", true, 34.67F, 1003.56F);

        Pc miPc2 = new Pc();

        System.out.println(miPc.getIndiceDeInflacion());

        float nuevoValorIndice = 17.65F;
        miPc.setIndiceDeInflacion(nuevoValorIndice);

        System.out.println(miPc.getIndiceDeInflacion());
    }
}

