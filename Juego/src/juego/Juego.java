package juego;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Clase: Practica1
 * Descripción: Esta clase representa la solución a la práctica 1 de Programación
 * Creada por: hassel Guadalupe
 */


public class Juego {

    public static void main(String[] args) {
         // Crea el tablero
	Tablero t = new Tablero();

        while(!t.juegoGanado()) {
            System.out.println(t.toString());

            // Pide al usuario por pantalla el movimiento
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Introduce el movimiento (W/S/A/D - q para salir): ");

            String teclaPulsada = null;
            try {
                teclaPulsada = br.readLine();
            } catch(IOException ioe) {
                System.out.println("Excepción al leer de teclado");
                System.exit(-1);
            }

            t.siguienteMovimiento(teclaPulsada);

            if(t.juegoPerdido()) {
                if(t.getVidas() == 0) {
                    System.out.println("\nHas perdido!\n");
                    System.exit(-1);
                }
                else {
                    System.out.println("\nHas perdido una vida!\n");
                    t.pierdeVida();
                }
            }
        }
        System.out.println("Has ganado!");
        System.exit(0);
    }
 }    
