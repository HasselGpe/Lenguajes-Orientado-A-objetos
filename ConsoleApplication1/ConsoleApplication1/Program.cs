using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Lista de objetos */
            /* [Lista] */
             List<Disco> discos = new List<Disco>();

            /* Variables bandera */
            int seguirPreguntando;
            Boolean salir;

            /* Variables de recuperación */
            String titulo;
            int numCanciones;
            Double precio;

            do
            {
                /* Solicitar y recuperar los datos del disco */
                Console.WriteLine("Capture el título del disco");
                título = Console.ReadLine();
                Console.WriteLine("Capture el número de las canciones");
                numCanciones = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Capture el precio");
                precio = Convert.ToDouble(Console.ReadLine());

                /* Instanciar un objeto pasando los valores capturados al constructor */
                /* [Objeto] */
                /* Agregar a la lista el objeto instanciado */
                /* [Agregación] */

                /* Preguntar y recuperar si se quiere salir (1:Si) usando la variable seguirPreguntando */
                Console.WriteLine("¿Quieres capturar otro disco? (1:Si, 2:No)");
                seguirPreguntando = Convert.ToInt32(Console.ReadLine());

                if (seguirPreguntando == 1) { salir = true; }
                else if (seguirPreguntando == 2) { salir = false; }
                else { salir = false; Console.WriteLine("Opción Invalida"); }

            } while (salir);

            /* Iterar la lista imprimiendo la información de los discos agregados */
            foreach (var i in discos)
            {
                String r;
                /* Invocar la función "GenerarInformacion" y recuperar el valor retornado */
                /* [Invocación] */
                Console.WriteLine(r);
            }
        }
    }
    class Disco
    {
        public String titulo;
        public int numCanciones;
        public Double precio;

        public Disco(String titulo, int numCanciones, Double precio)
        {
            this.titulo = titulo;
            this.numCanciones = numCanciones;
            this.precio = precio;
        }

        public String GenerarInformacion()
        {
            return "Título: " + this.titulo + ", número de canciones: " + this.numCanciones + ", precio: $" + this.precio;
        }
    }
}
