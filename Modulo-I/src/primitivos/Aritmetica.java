package primitivos;

public class Aritmetica {
    public static void main(String[] args) {
        // suma
        float a = 34.67f;
        double b = 456.98d;

        double resultadoSuma = a + b;

        System.out.println("El resultado de la suma es: " + resultadoSuma);

        // resta
        short c = 56;
        short d = 98;

        int resultadoResta = c - d;

        System.out.println("El resultado de la resta es: " + resultadoResta);

        // multiplicación
        byte e = 122;
        byte f = 2;

        int resultadoMultiplicacion = e * f;

        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);

        // división
        int g = 456;
        int h = 32;

        long resultadoDivision = g / h;

        System.out.println("El resultado de la división es: " + resultadoDivision);

        // módulo
        long i = 300;
        long j = 300;

        long resultadoModulo = i % j;

        System.out.println("El resultado del módulo es: " + resultadoModulo);
    }
}