package ejemplos;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplos {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      /* Lista de objetos */
      //[Lista de computadoras]
        ArrayList<Computadora> lista = new ArrayList <>();
        /* Escaner de teclado */
      Scanner entrada = new Scanner(in);
      /* Variables bandera */
int tipoDispositivo;
int seguirPreguntando;
Boolean salir;

/* Variables de recuperación */
 Double cpuRecuperar;
 Double ramRecuperar;
 Double ssdRecuperar;
 int bateriaRecuperar;

           /* Menú */
do
{
 /* Solicitar y recuperar los datos del disco */
    System.out.println("CPU");
    cpuRecuperar = entrada.nextDouble();
    System.out.println("RAM");
    ramRecuperar = entrada.nextDouble();
    System.out.println("SSD ");
    ssdRecuperar = entrada.nextDouble();
/* Preguntar y recuperar si se desea agregar una computadora o una laptop (1:Comp, 2:Lap) usando la variable tipoDispositivo */
    System.out.println("COMPUTADORA 1 O LAPTOP 2");
     tipoDispositivo = entrada.nextInt();
if (tipoDispositivo == 1)
{
    /* Construir el objeto usando la clase Computadora */
//[Instanciación]
    Computadora objeto = new Computadora(cpuRecuperar, ramRecuperar, ssdRecuperar);
/* Agregar a la lista el objeto */
//[Agregación a la lista]
    lista.add(objeto);
}
    else if (tipoDispositivo == 2)
    {
         /* Solicitar y recuperar el dato faltante usando la variable bateriaRecuperar */
        System.out.println("Bateria");
        bateriaRecuperar = entrada.nextInt();
/* Construir el objeto usando la clase Laptop */
        //[Instanciación]
        Laptop objeto = new Laptop(cpuRecuperar, ramRecuperar, ssdRecuperar, bateriaRecuperar);
/* Agregar a la lista el objeto */
        //[Agregación a la lista]
        lista.add(objeto);
       
    }
    else 
    {
    System.out.println("Error");
    }
/* Preguntar y recuperar si se quiere salir (1:Si, 2:No) usando la variable seguirPreguntando */
    System.out.println("Salir 1 si o no 2");
    seguirPreguntando = entrada.nextInt();
    if (seguirPreguntando == 1)
    { salir = false;} else if (seguirPreguntando == 2){
        salir = true;}
    else {salir = true;
    System.out.println("Error");}
} while (salir);
/* Iterar la lista imprimiendo la información de los discos agregados */
int i = 0;
for (Computadora e : lista)
{
    i++;
    String r;
    // Invocar la función ValoresAtributos y recuperar el valor retornado */ [Invocación y recuperación]
    r = e.ValoresAtributos();
    System.out.println("PC" + i + "= " + r);
 }
    }
}

