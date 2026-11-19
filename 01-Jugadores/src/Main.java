public class Main {
    public static void main(String[] args) {
        Jugador primero = new Jugador("Lucas");
        Jugador segundo = new Jugador("Sofía");

        System.out.println("Estado inicial");
        mostrar(primero);
        mostrar(segundo);

        primero.ganarPuntos(25);
        segundo.ganarPuntos(15);
        System.out.println("\nDespués de sumar puntos");
        mostrar(primero);
        mostrar(segundo);

        primero.ganarPuntos(-10);
        System.out.println("\nDespués de intentar sumar -10 a Lucas");
        mostrar(primero);

        segundo.subirNivel();
        System.out.println("\nEstado final");
        mostrar(primero);
        mostrar(segundo);
    }

    private static void mostrar(Jugador jugador) {
        System.out.println(jugador.getNombre() + " | nivel " + jugador.getNivel()
                + " | puntos " + jugador.getPuntos());
    }
}
