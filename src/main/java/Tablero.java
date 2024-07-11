public class Tablero {
    private Casilla[][] casillas;

    public Tablero() {
        casillas = new Casilla[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casillas[i][j] = new Casilla(i, j);
            }
        }
    }

    public Casilla getCasilla(int x, int y) {
        return casillas[x][y];
    }
    
    public boolean estaReyCapturado(boolean esBlanco) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Pieza pieza = casillas[i][j].getPieza();
                if (pieza instanceof Rey && pieza.esBlanca() == esBlanco) {
                    return false;
                }
            }
        }
        return true;
    }

    public void moverPieza(int x0, int y0, int x1, int y1) {
        Pieza pieza = casillas[x0][y0].getPieza();
        casillas[x1][y1].setPieza(pieza);
        casillas[x0][y0].setPieza(null);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n   a    b    c    d    e    f    g    h\n");
        for (int i = 0; i < 8; i++) {
            builder.append(i+1);
            for (int j = 0; j < 8; j++) {            
                builder.append(casillas[i][j]);
            }
            builder.append(i+1 +"\n\n");
        }
        builder.append("   a    b    c    d    e    f    g    h\n");
        return builder.toString();
    }
}
