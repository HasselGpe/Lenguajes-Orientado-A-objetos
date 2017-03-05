
package ejemplo.de.pkginterface;

public class Bicicleta implements Rueda, Silla{


    public void sentarse() {
        System.out.println("La bicicleta tiene sillas");
        
    }

    public Bicicleta() {
    }

    
    public void avanzar() {
        System.out.println("La bicicleta avanza");
        
    }

   
    public void detenerse() {
        System.out.println("La bicicleta se detiene");
        
    }
    
    
    
}
