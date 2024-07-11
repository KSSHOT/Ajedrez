# Proyecto de Ajedrez en Java

Este proyecto implementa un juego de ajedrez en Java utilizando programación orientada a objetos. El juego incluye todas las reglas estándar del ajedrez, con movimientos válidos para cada tipo de pieza y validaciones de jugadas legales.

## Características

- Implementación de todas las piezas del ajedrez: Rey, Reina, Torre, Alfil, Caballo y Peón.
- Movimientos válidos según las reglas del ajedrez, incluyendo el movimiento especial del Peón al inicio.
- Verificación de jaque mate y restriccion de saltos legales para cada pieza.
- Interfaz de consola para la interacción entre jugadores.

- **Jugador y Turnos:** Sistema para alternar los turnos entre jugadores y permitir que cada jugador realice sus movimientos.

## Estructura del Proyecto

El proyecto está organizado en las siguientes clases principales:

- `Tablero.java`: Clase que representa el tablero de ajedrez y gestiona las casillas.
- `Pieza.java`: Clase abstracta que define las características básicas y métodos comunes para todas las piezas.
- `Jugador.java`: Clase que modela a los jugadores y gestiona sus movimientos.
- `Casilla.java`: Clase que representa cada casilla del tablero y puede contener una pieza.
- Clases individuales para cada tipo de pieza: `Rey.java`, `Reina.java`, `Torre.java`, `Alfil.java`, `Caballo.java`, `Peon.java`.

## Uso

Para ejecutar el juego, abre el proyecto en NetBeans en la importacion de proyectos .zip y ejecuta la clase `Jugar.java`. Esto iniciará una partida de ajedrez donde podrás interactuar con el tablero mediante la consola, donde las piezas se muestran con la inicial de la correspondiente, Blanca minusculas y Negras mayusculas, cada interaccion debe contener 2 entradas por parte del usuario, la casilla que desea mover y la casilla destino, donde cada entrada es de 2 caracteres: fila(1-8) y columna(a-h), si es un movimiento ilegal o la entrada es invalida, se hara mension y se repetira el intento, para luego actualizar el tablero e intercalando intentos entre jugadores. el juego finaliza cuando alguna de las callias del rey es comido.

## Capturas

![image](https://github.com/KSSHOT/Ajedrez/assets/101493968/72120321-f97b-4948-9bca-9efdaa155020)
![image](https://github.com/KSSHOT/Ajedrez/assets/101493968/2352151b-036c-4e16-bc69-7e1c3ded65c6)

![image](https://github.com/KSSHOT/Ajedrez/assets/101493968/eafaeca5-4478-43e1-b716-81febcb342e2)


## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor envía un pull request detallando tus cambios propuestos.

## Autor

Este proyecto fue desarrollado por Oscar David García Badillo.

## Licencia

Este proyecto está bajo la Licencia Unlicense. Consulta el archivo `LICENSE` para más detalles.
