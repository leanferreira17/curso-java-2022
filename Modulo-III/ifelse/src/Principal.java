public class Principal {
    public static void main(String[] args) {

        // estructura if

        // primitivos
        int a;
        float b;
        long c;

        // object
        String f;

        // wrappers
        // int -> Integer
        // long -> Long

        Integer edadDeLaPersona = new Integer(18);
        Long altura = new Long(12L);

        Integer edadMinimaParaObtenerLaLicenciaDeConducirObj = new Integer(18);


        if (5 == 5) {
            System.out.println("La condicion es verdadera");
        } else if (5 == 5) {
            System.out.println("La condicion es verdadera, 5 == 5");
        } else if (6 > 8) {
            System.out.println("Las condiciones son falsas");
        } else {
            //
        }

        /*
        int edad = 18;
        int edadMinimaParaObtenerLaLicenciaDeConducir = 18;

        if (edadDeLaPersona > edadMinimaParaObtenerLaLicenciaDeConducirObj) {
            // bloque
            System.out.println("Se le puede otorgar la licencia");
        } else if (edadDeLaPersona.compareTo(edadMinimaParaObtenerLaLicenciaDeConducirObj) == 0) {
            System.out.println("La edad es igual a la edad minima de otorgamiento. Se le puede otorgar la licencia");
        } else {
            System.out.println("No se le puede otorgar la licencia. Su edad es: " + edad + " y la edad minima" +
                    "permitida es de " + edadMinimaParaObtenerLaLicenciaDeConducir);
        }

        // switch
        int notaParcial = 0;
        String expresionString = "frase";

        switch(notaParcial) {
            case 0:
                System.out.println("Te voy a matar");
            case 1:
                System.out.println("Hay tabla");
            case 4:
                System.out.println("Zafaste");
                break;
            default:
                System.out.println("Entro por default");
        } */
    }


}
