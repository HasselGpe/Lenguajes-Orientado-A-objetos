/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loo_p1_ortegapelaez;
import java.io.Console;
import static java.lang.System.*;
import java.util.Date;
import java.util.Scanner;
 import java.math.*;

public class LOO_P1_OrtegaPelaez {
    public static String _paterno = " Ortega ", _materno =" Pelaez ", _nombre = "Hassel Guadalupe";
    public static int _cuenta = 11267864;
    public static float _numero1;
    public static int _numero_de_Practica = 1;
    public static void main(String[] args) {
        // TODO code application logic here
        MostrarInformacion();
        ResolverProblema();
        
    }
    //Metodos
    public static void  MostrarInformacion() {
            out.println("Nombre De Alumno" + _paterno + _materno + _nombre);
            out.println("Numero de Cuenta:" + _cuenta);
            out.println("Numero de Practica:" +_numero_de_Practica);
            java.util.Date fecha = new Date();
            out.println (fecha);
    }
    public static void ResolverProblema() {
        
        
    }
  

    
}

