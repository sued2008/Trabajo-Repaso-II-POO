public class Preceptor extends Persona {
    private final String cursoAsignado;

    public Preceptor(String nombre, int edad, String cursoAsignado) {
        super(nombre, edad);
        this.cursoAsignado = cursoAsignado;
    }

    public void mostrarInformacion() {
        System.out.println("Preceptor: " + getNombre() + " | edad: " + getEdad()
                + " | curso: " + cursoAsignado);
    }
}
