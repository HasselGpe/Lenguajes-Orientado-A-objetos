
package ejemplo.de.pkginterface;

public class Carro implements Rueda{ 
    public void avanzar() {
        System.out.println("El carro avanza");
    }
    public void detenerse() {
        System.out.println("El carro se detiene");
        
    }
//Lo que estamos diciendo es que esta clase tiene que implementar todo lo 
    // las funcionalidades de la rueda, por que el carro la es implementando 

    public Carro() {
        
    }
    
}
