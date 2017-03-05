/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 * Clase: Tablero
 * Descripción: Esta clase representa un tablero para el juego comecocos
 * Creada por: hassel 
 */
public class Tablero {
    

/** Casillas del tablero */
    private Casilla[][] casillas;

    /** Lista de enemigos */
    private Enemigo[] enemigos;

    /** Protagonista */
    private Protagonista prota;

    /** Ancho del tablero */
    private int ancho;

    /** Alto del tablero */
    private int alto;

    /** Puntos acumulados */
    private int puntos;

    /** Vidas */
    private int vidas;

    /** Posición de partida del protagonista */
    private int protaXInicial, protaYInicial, protaDireccionInicial;

    /** Posición de partida de los enemigos */
    private int[] enemigosXInicial, enemigosYInicial, enemigosDireccionInicial;

    /** Constante para el incremento de puntos cada vez que se come uno */
    private static final int INCREMENTO_PUNTOS = 10;

    /** Constante para el número de vidas inicial */
    private static final int VIDAS_INICIALES = 3;

    /** Constante para el alto y ancho por defecto del tablero */
    private static final int ALTO  = 17;
    private static final int ANCHO = 19;


    /**
     * Constructor del tablero dados su ancho, su alto, sus casillas, los enemigos y el protagonista
     */
    public Tablero() {
        /* Tablero por defecto */
        /*
         *       ###################
         *       #@.......#........#
         *       #.##.###.#.###.##.#
         *       #.................#
         *       #.##.#.#####.#.##.#
         *       #....#%..#...#...%#
         *       ####.###.#.###.####
         *       ####.#.......#.####
         *       ####...#####...####
         *       ####.#.......#.####
         *       ####.###.#.###.####
         *       #....#...#...#....#
         *       #.##.#.#####.#.##.#
         *       #.................#
         *       #.##.###.#.###.##.#
         *       #.....%..#........#
         *       ###################
         */

        // Asigna las variables del tablero
        this.alto  = ALTO;
        this.ancho = ANCHO;
        int muro = Casilla.TIPO_MURO;
        int pnto = Casilla.TIPO_PUNTO;
        int[][] tmp = new int[][] {
                {muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro},
                {muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro},
                {muro,pnto,muro,muro,pnto,muro,muro,muro,pnto,muro,pnto,muro,muro,muro,pnto,muro,muro,pnto,muro},
                {muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro},
                {muro,pnto,muro,muro,pnto,muro,pnto,muro,muro,muro,muro,muro,pnto,muro,pnto,muro,muro,pnto,muro},
                {muro,pnto,pnto,pnto,pnto,muro,pnto,pnto,pnto,muro,pnto,pnto,pnto,muro,pnto,pnto,pnto,pnto,muro},
                {muro,muro,muro,muro,pnto,muro,muro,muro,pnto,muro,pnto,muro,muro,muro,pnto,muro,muro,muro,muro},
                {muro,muro,muro,muro,pnto,muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro,pnto,muro,muro,muro,muro},
                {muro,muro,muro,muro,pnto,pnto,pnto,muro,muro,muro,muro,muro,pnto,pnto,pnto,muro,muro,muro,muro},
                {muro,muro,muro,muro,pnto,muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro,pnto,muro,muro,muro,muro},
                {muro,muro,muro,muro,pnto,muro,muro,muro,pnto,muro,pnto,muro,muro,muro,pnto,muro,muro,muro,muro},
                {muro,pnto,pnto,pnto,pnto,muro,pnto,pnto,pnto,muro,pnto,pnto,pnto,muro,pnto,pnto,pnto,pnto,muro},
                {muro,pnto,muro,muro,pnto,muro,pnto,muro,muro,muro,muro,muro,pnto,muro,pnto,muro,muro,pnto,muro},
                {muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro},
                {muro,pnto,muro,muro,pnto,muro,muro,muro,pnto,muro,pnto,muro,muro,muro,pnto,muro,muro,pnto,muro},
                {muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro,pnto,pnto,pnto,pnto,pnto,pnto,pnto,pnto,muro},
                {muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro,muro}
        };

        // Crea las casillas
        this.casillas = new Casilla[this.alto][this.ancho];
        for(int i=0; i<this.alto; i++) {
            casillas[i] = new Casilla[this.ancho];
            for(int j=0; j<this.ancho; j++) {
                casillas[i][j] = new Casilla(tmp[i][j]);
            }
        }

        // Crea los enemigos
        this.enemigos = new Enemigo[3];
        enemigos[0] = new Enemigo(6,  5, Enemigo.DIRECCION_ABAJO);
        enemigos[1] = new Enemigo(17, 5, Enemigo.DIRECCION_ARRIBA);
        enemigos[2] = new Enemigo(6, 15, Enemigo.DIRECCION_ARRIBA);

        // Crea el protagonista
        this.prota = new Protagonista(1, 1, Protagonista.DIRECCION_DERECHA);

        // Inicialmente los puntos son cero
        this.puntos = 0;

        // Inicializa el número de vidas
        this.vidas = VIDAS_INICIALES;

        // Guarda las posiciones de inicio por si matan al protagonista
        protaXInicial = prota.getPosicionX();
        protaYInicial = prota.getPosicionY();
        protaDireccionInicial = prota.getDireccion();
        enemigosXInicial = new int[enemigos.length];
        enemigosYInicial = new int[enemigos.length];
        enemigosDireccionInicial = new int[enemigos.length];
        for(int i=0; i<enemigos.length; i++) {
            enemigosXInicial[i] = enemigos[i].getPosicionX();
            enemigosYInicial[i] = enemigos[i].getPosicionY();
            enemigosDireccionInicial[i] = enemigos[i].getDireccion();
        }
    }


    /**
     * Constructor del tablero dados su ancho, su alto, sus casillas, los enemigos y el protagonista
     * @param ancho Ancho del tablero
     * @param alto Alto del tablero
     * @param casillas Casillas de juego
     * @param enemigos Enemigos
     * @param prota Protagonista
     */
    public Tablero(int ancho, int alto, Casilla[][] casillas,
                   Enemigo[] enemigos, Protagonista prota) {
        // Asigna las variables del tablero
        this.alto = alto;
        this.ancho = ancho;
        this.casillas = casillas;
        this.enemigos = enemigos;
        this.prota = prota;

        // Inicialmente los puntos son cero
        this.puntos = 0;

        // Inicializa el número de vidas
        this.vidas = VIDAS_INICIALES;

        // Guarda las posiciones de inicio por si matan al protagonista
        protaXInicial = prota.getPosicionX();
        protaYInicial = prota.getPosicionY();
        protaDireccionInicial = prota.getDireccion();
        enemigosXInicial = new int[enemigos.length];
        enemigosYInicial = new int[enemigos.length];
        enemigosDireccionInicial = new int[enemigos.length];
        for(int i=0; i<enemigos.length; i++) {
            enemigosXInicial[i] = enemigos[i].getPosicionX();
            enemigosYInicial[i] = enemigos[i].getPosicionY();
            enemigosDireccionInicial[i] = enemigos[i].getDireccion();
        }
    }


    /**
     * Realiza el siguiente movimiento del tablero, moviendo tanto a los
     * enemigos como al protagonista. Devuelve false si se ha perdido porque algún
     * enemigo ha alcanzado al protagonista
     * @param teclaPulsada Tecla pulsada por el usuario
     */
    public void siguienteMovimiento(String teclaPulsada) {
        // Primero mueve al protagonista
        prota.muevete(casillas, teclaPulsada);

        // Suma puntos al marcador si es necesario
        if(casillas[prota.getPosicionY()][prota.getPosicionX()].esPunto()) {
            puntos += INCREMENTO_PUNTOS;
            casillas[prota.getPosicionY()][prota.getPosicionX()].setTipo(Casilla.TIPO_VACIA);
        }

        // Luego mueve a los enemigos
        for(int i=0; i<enemigos.length; i++) {
            enemigos[i].muevete(casillas, enemigos, prota);
        }
    }

    /**
     * Comprueba si se ha perdido el juego, viendo si algún enemigo está en la misma
     * casilla que el protagonista
     * @return true si se ha perdido, false si no
     */
    public boolean juegoPerdido() {
        // Comprueba si algún enemigo ha alcanzado al protagonista
        for (Enemigo enemigo : enemigos) {
            if (enemigo.coincide(prota.getPosicionX(), prota.getPosicionY())) {
                // Decrementar el número de vidas
                vidas=vidas-1;
                return true;
            }
        }
        return false;
    }

    /**
     * Comprueba si se ha ganado el juego, viendo que no quede ninguna casilla con puntos
     * @return true si se ha ganado, false si no
     */
    public boolean juegoGanado() {
        for(int i=0; i<alto; i++) {
            for(int j=0; j<ancho; j++) {
                if(casillas[i][j].esPunto() || casillas[i][j].esPuntoEspecial()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Devuelve el número de vidas del protagonista
     * @return El número de vidas del protagonista
     */
    public int getVidas() {
        return vidas;
    }

    /**
     * El protagonista pierde una vida
     */
    public void pierdeVida() {

        // Vuelve al protagonista y los enemigos a la posición inicial
        prota.setPosicionX(protaXInicial);
        prota.setPosicionY(protaYInicial);
        prota.setDireccion(protaDireccionInicial);
        for(int i=0; i<enemigos.length; i++) {
            enemigos[i].setPosicionX(enemigosXInicial[i]);
            enemigos[i].setPosicionY(enemigosYInicial[i]);
            enemigos[i].setDireccion(enemigosDireccionInicial[i]);
        }
    }

    /**
     * Devuelve la representación del tablero en forma de cadena de texto
     * @return La representación del tablero en forma de cadena de texto
     */
    public String toString() {
        String ret = "";
        for(int i=0; i<alto; i++) {
            for(int j=0; j<ancho; j++) {
                // Si está el protagonista lo imprime
                if(prota.coincide(j, i)) {
                    ret += "@";
                }
                else {
                    boolean tmp = true;
                    // Si hay algún enemigo en esa casilla, lo imprime
                    for (Enemigo enemigo : enemigos) {
                        if (enemigo.coincide(j, i)) {
                            ret += "%";
                            tmp = false;
                        }
                    }
                    // Si no, imprime la casilla
                    if(tmp) {
                        ret += casillas[i][j].toString();
                    }
                }
            }
            ret += "\n";
        }
        ret += "PUNTOS: " + puntos + "\n";
	ret += "VIDAS:  " + vidas  + "\n";
        return ret;
    }

    /**
     * Devuelve las casillas del juego
     * @return Las casillas del juego
     */
    public Casilla[][] getCasillas() {
        return casillas;
    }

    /**
     * Devuelve los enemigos del juego
     * @return Los enemigos del juego
     */
    public Enemigo[] getEnemigos() {
        return enemigos;
    }

    /**
     * Devuelve el protagonista del juego
     * @return El protagonista del juego
     */
    public Protagonista getProta() {
        return prota;
    }

    /**
     * Devuelve el ancho del tablero
     * @return El ancho del tablero
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Devuelve el alto del tablero
     * @return El alto del tablero
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Devuelve los puntos actuales del juego
     * @return Los puntos actuales del juego
     */
    public int getPuntos() {
        return puntos;
    }
}

