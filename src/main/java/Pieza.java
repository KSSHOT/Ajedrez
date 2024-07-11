public abstract class Pieza {
    private boolean esBlanca;
    private int x;
    private int y;

    public Pieza(boolean esBlanca, int x, int y) {
        this.esBlanca = esBlanca;
        this.x = x;
        this.y = y;
    }

    public boolean esBlanca() {
        return esBlanca;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract boolean Validar(Tablero tablero, int fromX, int fromY, int toX, int toY);

    @Override
    public abstract String toString();
}
