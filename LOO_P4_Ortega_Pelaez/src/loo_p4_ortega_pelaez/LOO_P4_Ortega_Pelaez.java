package loo_p4_ortega_pelaez;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author HasselOrtega
 */
public class LOO_P4_Ortega_Pelaez {
    public static void main(String[] args) {
        ArrayList<Computadora> computadoras;
        computadoras = new ArrayList<>();
        //computadoras=ArrayList<Computadora>();
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
            out.println("Agrega la velocidad del CPU");
            cpuRecuperar = entrada.nextDouble();
            out.println("Inserta la cantidad de memoria RAM");
            ramRecuperar = entrada.nextDouble();
            out.println("Inserta la cantidad de memoria SSD");
            ssdRecuperar = entrada.nextDouble();
            /* Preguntar y recuperar si se desea agregar una computadora o una laptop (1:Comp, 2:Lap) 
            usando la variable tipoDispositivo */
            out.println("Deseas agregar una (1) = computadora o una (2) = Laptop ");
            tipoDispositivo = entrada.nextInt();
            if (tipoDispositivo == 1){
                //Computadora objeto;
                //objeto = new Computadora(objeto.cpu, objeto.ram, objeto.ssd);
                /* Agregar a la lista el objeto */
                Computadora objeto = new Computadora(cpuRecuperar, ramRecuperar, ssdRecuperar);
                //[Agregación a la lista
                computadoras.add(objeto);
            }
            else if (tipoDispositivo == 2){
                /* Solicitar y recuperar el dato faltante usando la variable bateriaRecuperar */
                out.println("Inserta el tiempo de Bateria");
                bateriaRecuperar = entrada.nextInt();
                /* Construir el objeto usando la clase Laptop */
                //[Instanciación]
                Laptop objeto = new Laptop( cpuRecuperar, ramRecuperar, ssdRecuperar, bateriaRecuperar);
                /* Agregar a la lista el objeto */
                //[Agregación a la lista
                computadoras.add(objeto);          
            }else{out.println("Error");}
            /* Preguntar y recuperar si se quiere salir (1:Si, 2:No) usando la variable seguirPreguntando */
            out.println("¿Deseas salir? (1:Si, 2:No) ");
            seguirPreguntando = entrada.nextInt();
            if (seguirPreguntando == 1){salir = false;}
            else if (seguirPreguntando == 2){salir = true;}
            else{salir = true;
            out.println("Error");}
        } while (salir);
        /* Iterar la lista imprimiendo la información de los discos agregados */
        int i = 0;
        for (Computadora e : computadoras)
        {
            i++;
            String r;
            /* Invocar la función ValoresAtributos y recuperar el valor retornado */
            //*/*/[Invocación y recuperación]
            r = e.ValoresAtributos();
            System.out.println("                  Datos Recuperados             ");
            System.out.println("  ");
            out.println("PC" + i + "= " + r);}
          
    }    
}
