public class Jugador {
    private final String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        nivel = 1;
        puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
        }
    }

    public void subirNivel() {
        nivel++;
    }
}
