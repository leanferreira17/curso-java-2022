package clasesestaticas;

class Indices {
    public static final int CANTIDAD_DE_PERSONAS = 7;

    public static float getIndiceDeInflacion() {
        return 60.00F;
    }

    static class SubIndices {
        public int cantidadDeSubIndices() {
            return 6;
        }
    }

    private Indices() {}
}
