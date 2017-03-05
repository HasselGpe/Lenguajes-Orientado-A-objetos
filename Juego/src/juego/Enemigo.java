/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;

/**
 *
 * @author HasselOrtega
 */
public class Enemigo {
     /** Variables propias del enemigo para la posición y la dirección */
    protected int posicionX;
    protected int posicionY;
    protected int direccion;

    /** Constantes para las 4 direcciones posibles */
    protected static final int DIRECCION_ARRIBA = 0;
    protected static final int DIRECCION_ABAJO = 1;
    protected static final int DIRECCION_IZQUIERDA = 2;
    protected static final int DIRECCION_DERECHA = 3;

    /** Variable para el identificador único del enemigo */
    private final int idEnemigo;

    /** Contador estático para llevar la cuenta de cuántos enemigos se han creado hasta ahora */
    private static int contadorEnemigos = 0;

    /**
     * Constructor de un determinado enemigo. Cada enemigo tiene un identificador único, una
     * posición y una dirección inicial
     * @param posicionX Posición inicial X del enemigo
     * @param posicionY Posición inicial Y del enemigo
     * @param direccion Dirección inicial del enemigo
     */

    public Enemigo(int posicionX, int posicionY, int direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
        contadorEnemigos++;
        this.idEnemigo = contadorEnemigos;
    }

    /**
     * Método para indicar al enemigo que se mueva. Para ello se le indican las casillas
     * del tablero, el resto de enemigos y el protagonista
     * @param casillas Casillas del tablero
     * @param enemigos Todos los enemigos del juego
     * @param prota Protagonista
     */
    public void muevete(Casilla[][] casillas, Enemigo[] enemigos, Protagonista prota) {
        // Si ya está encima del protagonista, no se mueve
        if(coincide(prota.getPosicionX(), prota.getPosicionY())) {
            return;
        }

        int siguienteX = 0, siguienteY = 0;
        // Si no se puede mover en la dirección actual, la cambia
        // Intenta cambiar de dirección 4 veces aleatoriamente mientras no se pueda
        // mover en esa dirección
        // Si no lo consigue, intenta otras 4 veces, pero ahora todas las direcciones posibles

        for(int veces = 0; veces < 8; veces++) {
            switch(direccion) {
                case DIRECCION_ARRIBA:
                    siguienteX = posicionX;
                    siguienteY = posicionY-1;
                    break;
                case DIRECCION_ABAJO:
                    siguienteX = posicionX;
                    siguienteY = posicionY+1;
                    break;
                case DIRECCION_IZQUIERDA:
                    siguienteX = posicionX-1;
                    siguienteY = posicionY;
                    break;
                case DIRECCION_DERECHA:
                    siguienteX = posicionX+1;
                    siguienteY = posicionY;
                    break;
            }


            // Si no se puede avanzar a la siguiente casilla, cambia la dirección
            if(!esPisable(siguienteX, siguienteY, casillas, enemigos)) {
                // Las 4 primeras veces prueba aleatoriamente
                if(veces < 4) {
                    direccion = new Random(System.currentTimeMillis()).nextInt(4);
                }
                // las 4 siguientes veces prueba todas las direcciones
                else {
                    direccion++;
                    if(direccion > 4) {
                        direccion = 0;
                    }
                }
            } else {
                break;
            }
        }

        // Se mueve
        switch(direccion) {
            case DIRECCION_ARRIBA:
                if(casillas[posicionY-1][posicionX].esPisable()) {
                    posicionY = posicionY - 1;
                }
                break;
            case DIRECCION_ABAJO:
                if(casillas[posicionY+1][posicionX].esPisable()) {
                    posicionY = posicionY + 1;
                }
                break;
            case DIRECCION_IZQUIERDA:
                if(casillas[posicionY][posicionX-1].esPisable()) {
                    posicionX = posicionX - 1;
                }
                break;
            case DIRECCION_DERECHA:
                if(casillas[posicionY][posicionX+1].esPisable()) {
                    posicionX = posicionX + 1;
                }
                break;
        }
    }

    /**
     * Método privado que comprueba si una determinada casilla es pisable por el enemigo
     * Para ello comprueba que la casilla sea pisable, y además no haya ningún otro enemigo encima
     * @param x Posición x de la casilla a comprobar
     * @param y Posición y de la casilla a comprobar
     * @param casillas Casillas del tablero
     * @param enemigos Todos los enemigos del tablero
     * @return true si es pisable, false si no lo es
     */
    private boolean esPisable(int x, int y, Casilla[][] casillas, Enemigo[] enemigos) {
        boolean pisable = casillas[y][x].esPisable();
        for (Enemigo enemigo : enemigos) {
            if (enemigo.coincide(x, y)) {
                pisable = false;
                break;
            }
        }
        return pisable;
    }

    /**
     * Devuelve el identificador único del enemigo
     * @return el identificador único del enemigo
     */
    public int getIdEnemigo() {
        return idEnemigo;
    }

    /**
     * Comprueba si la posición de este enemigo coincide con la de otro dado
     * @param otro Enemigo con el que comparar la posición
     * @return true si coinciden, false si no
     */
    public boolean coincide(Enemigo otro) {
        return otro.getPosicionX() == posicionX && otro.getPosicionY() == posicionY;
    }

    /**
     * Comprueba si la posición de este enemigo coincide con una dada
     * @param x Posición x dada
     * @param y Posición y dada
     * @return true si coinciden, false si no
     */
    public boolean coincide(int x, int y) {
        return x == posicionX && y == posicionY;
    }

    /**
     * Devuelve la posición x del enemigo
     * @return La posición x del enemigo
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * Devuelve la posición y del enemigo
     * @return La posición y del enemigo
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * Establece la posición X del enemigo
     * @param posicionX La posición X
     */
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * Establece la posición Y del enemigo
     * @param posicionY La posición Y
     */
    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    /**
     * Establece la dirección del enemigo
     * @param direccion La dirección
     */
    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve la dirección actual del enemigo
     * @return La dirección actual del enemigo
     */
    public int getDireccion() {
        return direccion;
    }
}
