package app;

public class Curso {
    private short cantidadDeAlumnos;

    public short getCantidadDeAlumnos() {
        return cantidadDeAlumnos;
    }

    public void setCantidadDeAlumnos(short cantidadDeAlumnos) {
        this.cantidadDeAlumnos = cantidadDeAlumnos;
    }

    public int getDuracionDelCurso() {
        return duracionDelCurso;
    }

    public void setDuracionDelCurso(int duracionDelCurso) {
        this.duracionDelCurso = duracionDelCurso;
    }

    public boolean esPresencial() {
        return esPresencial;
    }

    public void setEsPresencial(boolean esPresencial) {
        this.esPresencial = esPresencial;
    }

    public String getNombreDelCurso() {
        return nombreDelCurso;
    }

    public void setNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    private int duracionDelCurso;
    private boolean esPresencial;
    private String nombreDelCurso;

    public Curso(short cantidadDeAlumnos, int duracionDelCurso, boolean esPresencial, String nombreDelCurso) {
        this.cantidadDeAlumnos = cantidadDeAlumnos;
        this.duracionDelCurso = duracionDelCurso;
        this.esPresencial = esPresencial;
        this.nombreDelCurso = nombreDelCurso;
    }
}
