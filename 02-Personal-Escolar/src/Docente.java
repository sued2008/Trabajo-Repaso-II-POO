public class Docente extends Persona {
    private final String materia;

    public Docente(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public void mostrarInformacion() {
        System.out.println("Docente: " + getNombre() + " | edad: " + getEdad()
                + " | materia: " + materia);
    }
}
