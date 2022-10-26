public class Main {
    public static void main(String[] args) {
        // && AND

        Persona persona = new Persona();
        persona.setEdad((short) 20);
        persona.setSexo('f');
        persona.setEstudiante(false);

        if (persona.getEdad() > 30 && persona.isEstudiante()) {
            System.out.println("Otorgar una beca, un abono estudiantil");
        }

        // false && false -> false

        if (persona.getSexo() == 'f' && persona.getEdad() > 50) {
            System.out.println("Acceder a ciertos beneficios");
        }

        // true && false -> false

        if (persona.getEdad() < 12 && persona.isEstudiante() == false) {
            System.out.println("Lo mandamos a la escuela o viene un asistente social");
        }

        // false && true -> false

        // || OR

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        Persona persona1 = new Persona();
        persona1.setEdad((short) 39);

        if (!(persona1.getEdad() > 18) || !(persona1.getEdad() < 40)) {
            System.out.println("La edad " + persona1.getEdad() + " se encuentra entre 18 y 40");
        }

        if (cantidadDeAlumnos > cantidadMinimaDeAlumnos(10) || cantidadDeAlumnos < cantidadMaxima) {
            System.out.println("La cantidad de alumnos es inferior al limite establecido");
        }

    }
}

class Persona {
    private boolean estudiante = true;
    private char sexo = 'm';
    private short edad = 28;

    public boolean isEstudiante() {
        return estudiante;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

}
