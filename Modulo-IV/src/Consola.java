import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consola {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Bienvenido");

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listaDeHistorico = new ArrayList();

        String mensaje1 = "El valor ingresado no está dentro del límite permitido";
        String mensaje2 = "El número ingresado es positivo y par";
        String mensaje3 = "El valor ingresado es positivo e impar";

        while(flag) {
            System.out.print("Ingrese valor numerico entero (entre 1 y 99):" + "\n");

            int valorIngresado = scanner.nextInt();

            if (valorIngresado < 0 || valorIngresado > 100) { // 1 -> false || false -> false
                listaDeHistorico.add(valorIngresado + mensaje1);
                System.out.println(mensaje1);
            } else if (valorIngresado > 0 && valorIngresado % 2 == 0) { // 1 -> true && false -> false
                listaDeHistorico.add(valorIngresado + mensaje2);
                System.out.println(mensaje2);
            } else if (valorIngresado > 0 && valorIngresado % 2 != 0) { // 1 -> true && true -> true
                listaDeHistorico.add(valorIngresado + mensaje3);
                System.out.println(mensaje3);
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

        // -7 -> El valor ingresado no está dentro del límite permitido
        // 2 -> El valor es par ...
        // 7 -> El valor impar...
    }
}
