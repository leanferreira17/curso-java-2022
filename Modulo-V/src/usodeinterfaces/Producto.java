package usodeinterfaces;

import java.util.Date;

public abstract class Producto {
    private String marca;
    private float peso;
    private float precio;
    protected String distribuidor;

    public short memoriaRam;

    private Date fechaDeVencimiento;

    public void catarSabor() {

    }

    public void testearVelocidadDelProcesador() {
        System.out.println("testeando...");
    }

    public String getMarca() {
        return "";
    };

}
