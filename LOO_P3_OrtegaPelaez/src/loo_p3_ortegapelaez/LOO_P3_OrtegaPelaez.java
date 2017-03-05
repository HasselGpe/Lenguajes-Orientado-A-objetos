package loo_p3_ortegapelaez;
import static java.lang.System.*;
import java.util.Scanner;
public class LOO_P3_OrtegaPelaez {

    public static void main(String[] args) {
        Calculos objeto = new Calculos(nombre ,días);
        //Variables bandera
        int tuboFaltas;
        //Variable del objeto
        int segirPreguntando;
        Boolean salir;
       //Variables de recuperación 
        String nombre;
        int días;
        int faltas;
        //Bucle del menu
       do
      {
        //Solicitar y recuperar el nombre del empleado usando la variable nombre
          System.out.println("Ingresa tu nombre");
          Scanner sc = new Scanner(in);
          nombre = sc.nextLine();
        //Solicitar y recuperar los días del mes usando la variable días 
          System.out.println("Ingresa los dias totales laborados del mes :");
          días = sc.nextInt();
        //Preguntar y recuperar si el empleado tubo faltas (1:Si, 2:No) usando la variable tuboFaltas 
          System.out.println("Haz tenido faltas?  (1° SI O 2° NO ");
          tuboFaltas = sc.nextInt();
          if (tuboFaltas == 1)
          {
            //Solicitar y recuperar los días faltados usando la variable faltas
              System.out.println("Cuantos dias haz faltado? ");
              faltas = sc.nextInt();
            //Construir el objeto usando el Constructor2
            //Imprimir los atributos del objeto (nombreEmpleado y salarioMensual)
          }
          else if (tuboFaltas == 2)
          {
          //Construir el objeto usando el Constructor1 
          //Imprimir los atributos del objeto (nombreEmpleado y salarioMensual)
          }
          else { out.println("Opcion Invalida"); }

        //Preguntar y recuperar si se quiere salir (1:Si) usando la variable segirPreguntando
          System.out.println("Quieres salir? Presiona 1 SI o 2 NO :");
          segirPreguntando = sc.nextInt();
          if (segirPreguntando == 1) { salir = true; }
          else if (segirPreguntando == 2) { salir = false; }
          else { salir = false; out.println("Opcion Invalida"); }

      } while (salir);
   }    
   class Calculos
{
       //Atrubutos
       public String nombreEmpleado;
       public Double salarioMensual;
       //Constructor uno
       public Calculos(String _nombreE, int _días)
       {
           int calculoSalario;
          //Inicializacion del atributo nombreEmpleado 
           this.nombreEmpleado = _nombreE;
          //Implementación del calculo del salarioMensual 
           this.salarioMensual = calculoSalario;
       }
        //Constructor dos
       public Calculos(String nombre, int días, int faltas)
       {
           int calculoSalario;
           //Inicializacion del atributo nombreEmpleado 
           this.nombreEmpleado = _nombreE;
           //Implementación del cálculo del salarioMensual 
           this.salarioMensual = calculoSalario;
       }
    } 
}
