public class Reina extends Pieza {

    public Reina(boolean esBlanca, int x, int y) {
        super(esBlanca, x, y);
    }

    @Override
    public boolean Validar(Tablero tablero, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);

        if (deltaX == deltaY) {
            // Movimiento diagonal
            return validarMovimientoDiagonal(tablero, fromX, fromY, toX, toY);
        } else if (fromX == toX || fromY == toY) {
            // Movimiento recto
            return validarMovimientoRecto(tablero, fromX, fromY, toX, toY);
        }

        return false;
    }

    private boolean validarMovimientoRecto(Tablero tablero, int fromX, int fromY, int toX, int toY) {
        int stepX = Integer.signum(toX - fromX);
        int stepY = Integer.signum(toY - fromY);

        int x = fromX + stepX;
        int y = fromY + stepY;

        while (x != toX || y != toY) {
            if (tablero.getCasilla(x, y).getPieza() != null) {
                return false;
            }
            x += stepX;
            y += stepY;
        }

        return true;
    }

    private boolean validarMovimientoDiagonal(Tablero tablero, int fromX, int fromY, int toX, int toY) {
        int stepX = Integer.signum(toX - fromX);
        int stepY = Integer.signum(toY - fromY);

        int x = fromX + stepX;
        int y = fromY + stepY;

        while (x != toX || y != toY) {
            if (tablero.getCasilla(x, y).getPieza() != null) {
                return false;
            }
            x += stepX;
            y += stepY;
        }

        return true;
    }

    @Override
    public String toString() {
        return esBlanca() ? "Q" : "q";
    }
}
