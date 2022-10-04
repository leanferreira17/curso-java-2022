package tiposobjeto;

public class Operacion {
    // variables globales o de instancia
    private int operandoA;
    private int operandoB;

    /*protected int sumar(int operandoA, int operandoB) {
        return operandoA + operandoB;
    }*/

    protected int sumar() {
        return operandoA + operandoB;
    }

    protected void imprimirResultado(int resultadoAImprimir) {
        System.out.println(resultadoAImprimir);
    }

    public Operacion() {

    }

    // setters
    public void setOperandoA(int nuevoValorParaElOperandoA) {
        operandoA = nuevoValorParaElOperandoA;
    }

    public void setOperandoB(int nuevoValorParaElOperandoB) {
        operandoB = nuevoValorParaElOperandoB;
    }

    // getters
    public int getOperandoA() {
        return operandoA;
    }

    public int getOperandoB() {
        return operandoB;
    }

}
