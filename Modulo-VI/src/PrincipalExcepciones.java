import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrincipalExcepciones {
    public static void main(String[] args) {
        // unchequed exceptions (RuntimeException)
        int a = 79;
        // dividirPorCero(a);
        try {
            //System.out.println(dividirPorCero(a));
            //System.out.println("Ejecuto el try");
        } catch (ArithmeticException e) {
            //System.out.println("El mensaje del objeto exception es: " + e.getMessage());
        }

        //System.out.println(getValorPorIndice(-89));

        // chequed exceptions

//        try {
//            crearArchivoYAccederlo();
//        } catch (NullPointerException nullPointerException) {
//            // log "el obj era nulo"
//        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//            // log
//        } catch (FileNotFoundException fileNotFoundException) {
//            //
//        }

//        try {
//            lanzarExcepcionSiEsFalso(false);
//        } catch (CustomException customExcepcion) {
//
//        } catch (NullPointerException e) {
//            e.getMessage();
//        } catch (Exception e) {
//
//        }
        try {
            validarUsuario("common");
        } catch (CustomException e) {
            e.imprimirData();
        }

    }

    public static int dividirPorCero(int valor) {
        return valor / 0;
    }

    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    public static int getValorPorIndice(int indice) {
        int[] arreglo = {0, 4, 5};

        return arreglo[indice]; // 89
    }

    public static void crearArchivoYAccederlo() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        //file.createNewFile();
        FileInputStream stream = new FileInputStream(file);
        // stream.close();
    }

    public static void lanzarExcepcionSiEsFalso(boolean flag) throws Exception {
        if (!flag) {
            throw new CustomException();
        } else {
            throw new NullPointerException();
        }
    }

    public static void validarUsuario(String nivelUsuario) throws CustomException {
        if (nivelUsuario == "admin") {
            // accedo
        } else {
            throw new CustomException();
        }
    }
}
