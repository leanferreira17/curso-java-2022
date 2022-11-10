package usodeinterfaces;

public class Pc extends Producto implements Encendible, Vendible {

    @Override
    public boolean encender() {
        System.out.println("Booting...");
        System.out.println("Corriendo proceso 1 de 567");
        System.out.println("...");
        System.out.println("Sistema listo.");

        // si el sistema falló por algo entonces -> false

        return true;
    }

    @Override
    public boolean vender() {
        System.out.println("vender la pc...");

        return true;
    }

}
