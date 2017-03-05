/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author HasselOrtega
 */
public class Protagonista {
     /** Variables propias del protagonista para la posición y la dirección */
    protected int posicionX;
    protected int posicionY;
    protected int direccion;

    /** Constantes para las 4 direcciones posibles */
    protected static final int DIRECCION_ARRIBA = 0;
    protected static final int DIRECCION_ABAJO = 1;
    protected static final int DIRECCION_IZQUIERDA = 2;
    protected static final int DIRECCION_DERECHA = 3;

    /**
     * Constructor que recibe toda la información sobre el protagonista
     * @param posicionX Posición X inicial del protagonista
     * @param posicionY Posición Y inicial del protagonista
     * @param direccion Dirección inicial del protagonista 
     */
    public Protagonista(int posicionX, int posicionY, int direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }

    /**
     * Método que indica al protagonista que se mueva. Para ello se le pasan como
     * parámetro las casillas del tablero
     * @param casillas Las casillas del tablero
     * @param teclaPulsada Tecla pulsada por el usuario final
     */
    public void muevete(Casilla[][] casillas, String teclaPulsada) {

        // Modifica la dirección si se ha pulsado una de las teclas de cambio de dirección
        if(teclaPulsada.equals("W") || teclaPulsada.equals("w")) {
            direccion = DIRECCION_ARRIBA;
        }
        else if(teclaPulsada.equals("S") || teclaPulsada.equals("s")) {
            direccion = DIRECCION_ABAJO;
        }
        else if(teclaPulsada.equals("A") || teclaPulsada.equals("a")) {
            direccion = DIRECCION_IZQUIERDA;
        }
        else if(teclaPulsada.equals("D") || teclaPulsada.equals("d")) {
            direccion = DIRECCION_DERECHA;
        }
        // Si se ha pulsado la tecla Q, sale de la partida
        else if(teclaPulsada.equals("Q") || teclaPulsada.equals("q")) {
            System.exit(-1);
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
     * Comprueba si la posición del protagonista coincide con la de otro dado
     * @param otro Protagonista con el que comparar la posición
     * @return true si coinciden, false si no
     */
    public boolean coincide(Protagonista otro) {
        return otro.getPosicionX() == posicionX && otro.getPosicionY() == posicionY;
    }

    /**
     * Comprueba si la posición de este protagonista coincide con una dada
     * @param x Posición x dada
     * @param y Posición y dada
     * @return true si coinciden, false si no
     */
    public boolean coincide(int x, int y) {
        return x == posicionX && y == posicionY;
    }

    /**
     * Devuelve la posición x del protagonista
     * @return La posición x del protagonista
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * Devuelve la posición y del protagonista
     * @return La posición y del protagonista
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * Establece la posición X del protagonista
     * @param posicionX La posición X
     */
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * Establece la posición Y del protagonista
     * @param posicionY La posición Y
     */
    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    /**
     * Establece la dirección del protagonista
     * @param direccion La dirección
     */
    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve la dirección actual del protagonista
     * @return La dirección actual del protagonista
     */
    public int getDireccion() {
        return direccion;
    }
}
