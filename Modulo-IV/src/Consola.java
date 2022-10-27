import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Bienvenido");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaDeHistorico = new ArrayList();

        while(flag) {
            System.out.print("Ingrese valor numerico entero (entre 1 y 99):" + "\n");

            int valorIngresado = scanner.nextInt();

            if (valorIngresado < 0 || valorIngresado > 100) { // 1 -> false || false -> false
                listaDeHistorico.add(valorIngresado + " -> El valor ingresado no está dentro del límite permitido");
                System.out.println("El valor ingresado no está dentro del límite permitido");
            } else if (valorIngresado > 0 && valorIngresado % 2 == 0) { // 1 -> true && false -> false
                listaDeHistorico.add(valorIngresado + " -> El número ingresado es positivo y par");
                System.out.println("El número ingresado es positivo y par");
            } else if (valorIngresado > 0 && valorIngresado % 2 != 0) { // 1 -> true && true -> true
                listaDeHistorico.add(valorIngresado + " -> El valor ingresado es positivo e impar");
                System.out.println("El valor ingresado es positivo e impar");
            }

            // impresion del historico
            System.out.println("Historico" + "\n");
            for (Object resultado : listaDeHistorico) {
                System.out.println(resultado);
            }

            System.out.println("Desea salir?: S/N");
            scanner.nextLine();
            char respuestaSalida = scanner.nextLine().charAt(0);
            if (respuestaSalida == 'S') {
               break;
            }
        }

        // ampliar agregando un bucle

        // -7 -> El valor ingresado no está dentro del límite permitido
        // 2 -> El valor es par ...
        // 7 -> El valor impar...
    }
}
