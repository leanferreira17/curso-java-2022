package usodeinterfaces;

public class YerbaMate extends Producto implements Tomable, Vendible {
    @Override
    public boolean vender() {
        System.out.println("vender la yerba...");

        return true;
    }
}
