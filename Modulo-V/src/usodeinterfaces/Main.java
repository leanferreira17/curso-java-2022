package usodeinterfaces;

public class Main {

    public static void main(String[] args) {
        Pc pc = new Pc();
        YerbaMate yerbaMate = new YerbaMate();
        Cerveza cerveza = new Cerveza();

        yerbaMate.vender();
        cerveza.vender();
        pc.vender();
    }

}
