public class Casilla {
    private int x;
    private int y;
    private Pieza pieza;

    public Casilla(int x, int y) {
        this.x = x;
        this.y = y;
        this.pieza = null;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        if (pieza == null) {
            return "|   |";
        } else {
            return "| " + pieza + " |";
        }
    }
}
