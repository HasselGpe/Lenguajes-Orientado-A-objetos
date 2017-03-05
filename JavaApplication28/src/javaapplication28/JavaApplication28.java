/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;
import static java.lang.System.out;
/**
 *
 * @author HasselOrtega
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculos operacion1 = new Calculos();
        int mayor = operacion1.CalcularMayor(9, 55, 3);
        String tipo = operacion1.DetectarTipoTriangulo(5, 4, 5);
        out.println(mayor);
        out.println(tipo);
    }
    
}
class Calculos
{
    public int CalcularMayor(int n1, int n2, int n3)
    {
        if((n1 > n2) && (n1 >n3))
        {
            int mayor = n1;
            return mayor;
        }
        else if((n2 > n1) && (n2 > n3))
        {
            int mayor = n2;
            return mayor;
        }
        else
        {
            int mayor = n3;
            return mayor;
        }
    }
    public String DetectarTipoTriangulo(int a, int b, int c)
    {
        if(a == b && c == b)
        {
            return "Equilatero";
        }
        else if(a == c && a != b && c != b)
        {
            return "Isoceles";
        }
        else if(a != b && b != c && a != c)
        {
            return "Escaleno";
        }
        return "";
    }
}