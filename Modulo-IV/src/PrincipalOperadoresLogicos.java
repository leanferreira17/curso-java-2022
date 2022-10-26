public class PrincipalOperadoresLogicos {
    public static void main(String[] args) {
        boolean esArgentino = true;
        int edad = 19;
        int edadMaxima = 75;

        if (edad < edadMaxima || edad > 18) {
            System.out.println("Otorgar licencia.");
        } else {
            System.out.println("No se le otorga.");
        }
    }
}
