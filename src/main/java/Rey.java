public class Rey extends Pieza {

    public Rey(boolean esBlanca, int x, int y) {
        super(esBlanca, x, y);
    }

    @Override
    public boolean Validar(Tablero tablero, int fromX, int fromY, int toX, int toY) {
        int deltaX = Math.abs(toX - fromX);
        int deltaY = Math.abs(toY - fromY);
        return (deltaX <= 1 && deltaY <= 1);
    }

    @Override
    public String toString() {
        return esBlanca() ? "K" : "k";
    }
}
