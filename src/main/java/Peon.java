public class Peon extends Pieza {

    public Peon(boolean esBlanca, int x, int y) {
        super(esBlanca, x, y);
    }

    @Override
    public boolean Validar(Tablero tablero, int fromX, int fromY, int toX, int toY) {
        int direction = esBlanca() ? -1 : 1; // Blancos se mueven hacia arriba (-1), negros hacia abajo (+1)
        int startRow = esBlanca() ? 6 : 1; // Fila inicial para blancos y negros

        // Movimiento de una casilla hacia adelante
        if (toX == fromX + direction && fromY == toY && tablero.getCasilla(toX, toY).getPieza() == null) {
            return true;
        }
        // Movimiento de dos casillas hacia adelante desde la fila inicial
        if (fromX == startRow && toX == fromX + 2 * direction && fromY == toY &&
            tablero.getCasilla(fromX + direction, fromY).getPieza() == null &&
            tablero.getCasilla(toX, toY).getPieza() == null) {
            return true;
        }
        // Captura en diagonal
        if (toX == fromX + direction && (toY == fromY + 1 || toY == fromY - 1) && tablero.getCasilla(toX, toY).getPieza() != null &&
            tablero.getCasilla(toX, toY).getPieza().esBlanca() != esBlanca()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return esBlanca() ? "P" : "p";
    }
}
