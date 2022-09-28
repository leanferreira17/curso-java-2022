package clasesestaticas;

public class Principal {
    public static void main(String[] args) {
        int cantidad = Indices.CANTIDAD_DE_PERSONAS;

        Indices.getIndiceDeInflacion();

        //Indices indices = new Indices();

        Indices.SubIndices  subIndices = new Indices.SubIndices();
        subIndices.cantidadDeSubIndices();
    }
}
