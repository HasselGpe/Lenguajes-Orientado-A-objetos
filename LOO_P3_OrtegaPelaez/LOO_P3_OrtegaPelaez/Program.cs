using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LOO_P3_OrtegaPelaez
{
    class Program
    {
        static void Main(string[] args)
        {

            //Variable del objeto
            Calculos objeto = new Calculos();

            //Variables bandera
            int tuboFaltas;
            int segirPreguntando;
            bool salir;

            //Variables de recuperación 
            String nombre;
            int días;
            int faltas;

            //Bucle del menu
            do
            {   //Solicitar y recuperar el nombre del empleado usando la variable nombre
                Console.WriteLine("Ingresa Tu Nombre");
                nombre  = Console.ReadLine();
                //Solicitar y recuperar los días del mes usando la variable días 
                Console.WriteLine("Ingresa los dias laborados");
                días = Convert.ToInt32(Console.ReadLine());
                //Preguntar y recuperar si el empleado tubo faltas (1:Si, 2:No) usando la variable tuboFaltas
                Console.WriteLine("Tuviste alguna falta");
                tuboFaltas = Convert.ToInt32(Console.ReadLine());

                if (tuboFaltas == 1)
                {
                    //Solicitar y recuperar los días faltados usando la variable faltas
                    Console.WriteLine("Ingresa los dias faltados");
                    faltas = Convert.ToInt32(Console.ReadLine());
                    //Construir el objeto usando el Constructor2
                    //Imprimir los atributos del objeto (nombreEmpleado y salarioMensual)
                }
                else if (tuboFaltas == 2)
                {
                    //Construir el objeto usando el Constructor1 
                    //Imprimir los atributos del objeto (nombreEmpleado y salarioMensual)
                }
                else { Console.WriteLine("Opcion Invalida"); }

                //Preguntar y recuperar si se quiere salir (1:Si) usando la variable segirPreguntando
                if (segirPreguntando == 1) { salir = true; }
                else if (segirPreguntando == 2) { salir = false; }
                else { salir = false; Console.WriteLine("Opcion Invalida"); }

            } while (salir);
        }
    }
    class Calculos
    {
        //Atrubutos
        public String nombreEmpleado;
        public double salarioMensual;

        //Constructor uno
        public void Empleado  (String nombreEmpleado)
  {
    int calculoSalario;
    //Inicializacion del atributo nombreEmpleado 
    //Implementación del calculo del salarioMensual 
    this.salarioMensual = calculoSalario;
  }

    //Constructor dos
    public int Salario ()
  {
    int calculoSalario;
    //Inicializacion del atributo nombreEmpleado 
    //Implementación del cálculo del salarioMensual 
    this.salarioMensual = calculoSalario;
  }
}

}
                       