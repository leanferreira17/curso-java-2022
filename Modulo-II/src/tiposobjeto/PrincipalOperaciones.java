package tiposobjeto;

public class PrincipalOperaciones {
    // miembros: atributos y metodos

    public static void main(String[] args) {

        Operacion operacionSumar = new Operacion();

        //int resultadoA = operacionSumar.sumar(4, 9);
        //int resultadoB = operacionSumar.sumar(89, 1);

        operacionSumar.setOperandoA(2);
        operacionSumar.setOperandoB(3);

        int resultadoDeLaSuma = operacionSumar.sumar();

        operacionSumar.imprimirResultado(resultadoDeLaSuma);
        //operacionSumar.imprimirResultado(resultadoB);

        operacionSumar.setOperandoA(70);
        operacionSumar.setOperandoB(765);

        operacionSumar.imprimirResultado(operacionSumar.sumar());

        System.out.println("El valor contenido en la variable operandoA es igual a: " + operacionSumar.getOperandoA());
        System.out.println("El valor contenido en la variable operandoB es igual a: " + operacionSumar.getOperandoB());
    }
}
