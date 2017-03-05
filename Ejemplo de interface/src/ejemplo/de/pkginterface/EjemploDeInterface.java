
package ejemplo.de.pkginterface;

public class EjemploDeInterface {

    public static void main(String[] args) {
        // Una interfaz no es una clase cuando hablamos de la programación orientada a objetos, es una especie
        // de guia o de forma en la que obligamos a otros objetos de diferentes tipos a implementar ciertos 
        // metodos 
          Carro c = new Carro();
          Bicicleta b = new Bicicleta();
          Bicicleta b1 = new Bicicleta();
         
          
          c.avanzar();
          b.avanzar();
          b1.sentarse();
          // Es muy parecido a el polimorfismo pero son clases que no estan relacionados y no heredan uno de otros
          // simplemente implementan la misma interfaz que los obliga a implementar codigo para esos metodos en especifico
          // Ademas se pueden implementar diferentes interfaces al mismo tiempo 
    }
    
}
