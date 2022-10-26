import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.print("Ingrese valor numerico entero (entre 1 y 99):");

        Scanner scanner = new Scanner(System.in);
        int valorIngresado = scanner.nextInt();

        if (valorIngresado < 0 || valorIngresado > 100) {
            System.out.println("El valor ingresado no está dentro del límite permitido");
        } else if (valorIngresado > 0 && valorIngresado % 2 == 0) {
            System.out.println("El número ingresado es positivo y par");
        } else if (valorIngresado > 0 && valorIngresado % 2 != 0) {
            System.out.println("El valor ingresado es positivo e impar");
        }

        // ampliar agregando un bucle
    }
}
