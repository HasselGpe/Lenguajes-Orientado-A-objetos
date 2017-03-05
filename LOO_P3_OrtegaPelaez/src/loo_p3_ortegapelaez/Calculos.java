package loo_p3_ortegapelaez;
 class Calculos 
{
       //Atrubutos
       public String nombreEmpleado;
       public float salarioMensual;
       //Constructor uno
       public Calculos(String nombre, int días)
       {
           float calculoSalario ;
          //Inicializacion del atributo nombreEmpleado 
           this.nombreEmpleado = nombre;
          //Implementación del calculo del salarioMensual 
           calculoSalario = días * 650;
           this.salarioMensual = calculoSalario;    
           System.out.println(nombreEmpleado);
           System.out.println(salarioMensual);
       }
        //Constructor dos
       public Calculos(String nombre, int días, int faltas)
       {
           float calculoSalario;
           //Inicializacion del atributo nombreEmpleado 
           this.nombreEmpleado = nombre;
           //Implementación del cálculo del salarioMensual 
            calculoSalario = ((días * 650) - (faltas * 200));
           this.salarioMensual = calculoSalario;
           System.out.println(nombreEmpleado);
           System.out.println(salarioMensual);
       }
    } 
    

