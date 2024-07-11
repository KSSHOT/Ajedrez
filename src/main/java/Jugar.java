import java.util.Scanner;

public class Jugar {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Jugador blanco = new Jugador(true);
        Jugador negro = new Jugador(false);
        
        blanco.colocarPiezas(tablero);
        negro.colocarPiezas(tablero);
        
        Scanner scanner = new Scanner(System.in);
        boolean turnoBlanco = true;
        
        while (true) {
            System.out.println(tablero);
            if (tablero.estaReyCapturado(!turnoBlanco)) {
                System.out.println("El jugador " + (turnoBlanco ? "Negro" : "Blanco") + " ha ganado!");
                break;
            }
            Jugador actual = turnoBlanco ? blanco : negro;
            System.out.println("Turno: " + (turnoBlanco ? "Blanco" : "Negro"));

            try {
                System.out.println("Ingrese la casilla de la pieza que desea mover (fila 1-8)(columna a-h):");
                String from = scanner.next();
                if (from.length() != 2 || !Character.isDigit(from.charAt(0)) || from.charAt(1) < 'a' || from.charAt(1) > 'h') {
                    throw new IllegalArgumentException("Entrada inválida para la casilla de origen.");
                }
                int x0 = Character.getNumericValue(from.charAt(0)) - 1; // Ajuste de 1-8 a 0-7
                int y0 = from.charAt(1) - 'a'; // Ajuste de 'a'-'h' a 0-7
                
                System.out.println("Ingrese la casilla a donde quiere mover (fila 1-8)(columna a-h):");
                String to = scanner.next();
                if (to.length() != 2 || !Character.isDigit(to.charAt(0)) || to.charAt(1) < 'a' || to.charAt(1) > 'h') {
                    throw new IllegalArgumentException("Entrada inválida para la casilla de destino.");
                }
                int x1 = Character.getNumericValue(to.charAt(0)) - 1; // Ajuste de 1-8 a 0-7
                int y1 = to.charAt(1) - 'a'; // Ajuste de 'a'-'h' a 0-7

                Pieza pieza = tablero.getCasilla(x0, y0).getPieza();
                
                if (pieza != null && pieza.Validar(tablero, x0, y0, x1, y1)) {
                    tablero.moverPieza(x0, y0, x1, y1);
                    
                    turnoBlanco = !turnoBlanco;
                } else {
                    System.out.println("Movimiento invalido, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, intente de nuevo. Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
