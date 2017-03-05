
package ejemplos;

public class Computadora {
    
/* Atrubutos */
public Double cpu;
public Double ram;
public Double ssd;
/* Constructor */
public Computadora(Double cpu, Double ram, Double ssd)
{
this.cpu = cpu;
this.ram = ram;
this.ssd = ssd;
}
/* Método */
public String ValoresAtributos()
{
    return "CPU:" + this.cpu + "MHz, RAM:" + this.ram + "GB, SSD:" + this.ssd + "GB";
}
}
