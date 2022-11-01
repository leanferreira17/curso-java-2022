package herencia;

public class Principal {
    public static void main(String[] args) {
        //System.out.println("Herencia");

        // padre -> hijo // super clase -> sub clase

        // Vehiculo vehiculo = new Vehiculo();

        Auto auto = new Auto(true, 3000.56f, 2000000d, 4, (byte) 5);
        Moto moto = new Moto(true, 140.45f, 500000d, 2, (byte) 0);

        Vehiculo[] listadoVehiculos = {new Auto(true, 3000.56f, 2000000d, 4, (byte) 5),
                                       new Moto(true, 140.45f, 500000d, 2, (byte) 0),
                                       new Camion(30000f, 1000000d, 8, (byte) 4)};

        // Object
        // Vehiculo
        // Auto

        System.out.println(listadoVehiculos[2].getPeso());

    }
}
