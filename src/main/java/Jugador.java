import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private boolean esBlanco;
    private List<Pieza> piezas;

    public Jugador(boolean esBlanco) {
        this.esBlanco = esBlanco;
        this.piezas = new ArrayList<>();
        inicializarPiezas();
    }

    private void inicializarPiezas() {
        int filaPeones = esBlanco ? 6 : 1;
        int filaOtras = esBlanco ? 7 : 0;

        // Inicializar peones
        for (int i = 0; i < 8; i++) {
            piezas.add(new Peon(esBlanco, filaPeones, i));
        }

        // Inicializar otras piezas
        piezas.add(new Torre(esBlanco, filaOtras, 0));
        piezas.add(new Torre(esBlanco, filaOtras, 7));
        piezas.add(new Caballo(esBlanco, filaOtras, 1));
        piezas.add(new Caballo(esBlanco, filaOtras, 6));
        piezas.add(new Alfil(esBlanco, filaOtras, 2));
        piezas.add(new Alfil(esBlanco, filaOtras, 5));
        piezas.add(new Reina(esBlanco, filaOtras, 3));
        piezas.add(new Rey(esBlanco, filaOtras, 4));
    }

    public void colocarPiezas(Tablero tablero) {
        for (Pieza pieza : piezas) {
            tablero.getCasilla(pieza.getX(), pieza.getY()).setPieza(pieza);
        }
    }

    public boolean esBlanco() {
        return esBlanco;
    }
}
