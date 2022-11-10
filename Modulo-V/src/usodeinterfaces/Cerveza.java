package usodeinterfaces;

public class Cerveza extends Producto implements Vendible {

    @Override
    public boolean vender() {
        // comprobar que la edad del comprador sea > 18 años
        /*
        if () {
        return false/true;
        }
         */
        System.out.println("vender la cerveza...");

        return true;
    }

}
