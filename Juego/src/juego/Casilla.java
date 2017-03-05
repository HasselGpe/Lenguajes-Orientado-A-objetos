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
public class Casilla {
    public static final int TIPO_VACIA = 1;
    public static final int TIPO_MURO = 2;
    public static final int TIPO_PUNTO = 3;
    public static final int TIPO_PUNTO_ESPECIAL = 4;

    // Variable que representa el tipo de una casilla
    private int tipo;

    /**
     * Constructor de una casilla, que recibe su tipo
     * @param tipo El tipo de la casilla a crear
     */
    public Casilla(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Comprueba si una casilla es pisable
     * @return true si es pisable, false si no lo es
     */
    public boolean esPisable() {
        return tipo != TIPO_MURO;
    }

    /**
     * Comprueba si una casilla es un muro
     * @return true si es un muro, false si no lo es
     */
    public boolean esMuro() {
        return tipo == TIPO_MURO;
    }

    /**
     * Comprueba si una casilla está vacía
     * @return true si está vacía, false si no lo está
     */
    public boolean esVacia() {
        return tipo == TIPO_VACIA;
    }

    /**
     * Comprueba si una casilla es un punto
     * @return true si es un punto, false si no lo es
     */
    public boolean esPunto() {
        return tipo == TIPO_PUNTO;
    }

    /**
     * Comprueba si una casilla es un punto especial
     * @return true si es un punto, false si no lo es
     */
    public boolean esPuntoEspecial() {
        return tipo == TIPO_PUNTO_ESPECIAL;
    }

    /**
     * Selecciona el tipo de una casilla
     * @param tipo El nuevo tipo de la casilla
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    /**
     * Devuelve el tipo de la casilla
     * @return El tipo de la casilla
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Devuelve la casilla representada en forma de cadena de texto
     * @return La casilla representada en forma de cadena de texto
     */
    public String toString() {
        switch(tipo) {
            case TIPO_VACIA:
                return " ";
            case TIPO_MURO:
                return "*";
            case TIPO_PUNTO:
                return ".";
            case TIPO_PUNTO_ESPECIAL:
                return "o";
            default:
                return "";
        }
    }
}
