
package ejemploexcepciones;
import java.util.Scanner;
public class EjemploExcepciones {
    // Siempre va a ver errores no trato del programa si no de la ejecucion 

    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in); 
       int x; //Variable numerica 
       // Si le agregamos una variable que no sea numerica cuando pide los datos nos va a dar una excepcion 
       //Entonces es prefereible que le metas una excepcion 
        System.out.println("Dame un valor numerico");
        try { // Esta ponemos la linea de codigo donde se puede ejecutar el error
             x = scanner.nextInt(); //Obtener un numero del teclado 
             System.out.println(x);
        } catch (Exception e) {// Aqui colocamos el tipo de excepcion que va a arrogar este codigo
            //e.printStackTrace(); // esta linea se utiliza par MOSTRAR  cual fue el error
            System.out.println(" no me diste un valor numerico");
        }
        finally { // Es para complementae el try y el catch  y es un codigo que siempre se va a estar ejecutando
            System.out.println("Proceso terminado");
        }
     
      
    }
    
}
