package precedencia;

public class Principal {
    public static void main(String[] args) {
        // revisar las operaciones en base al orden de precedencia
        int resultadoDeLaOperacion = (98 - 76) * ((45 % 4) * (678 - (56 / 34))) + (34 / 7) + 67 - 45 - 78 * 5 / 34 - 23;
        System.out.println(resultadoDeLaOperacion);
    }
}
