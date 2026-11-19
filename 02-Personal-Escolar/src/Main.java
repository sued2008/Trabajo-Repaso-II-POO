public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Ana", 38, "Programación");
        Preceptor preceptor = new Preceptor("Martín", 31, "5° 3°");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        preceptor.setEdad(32);
        System.out.println("\nDespués de actualizar la edad del preceptor");
        preceptor.mostrarInformacion();
    }
}
