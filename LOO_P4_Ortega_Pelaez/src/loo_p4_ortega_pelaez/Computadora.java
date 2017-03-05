package loo_p4_ortega_pelaez;
/**
 *
 * @author HasselOrtega
 */
   class Computadora {

   
    //Atributos
    public Double cpu;
    public Double ram;
    public Double ssd;
    
    //Constructor
    public Computadora(Double cpu, Double ram, Double ssd)
    {
        this.cpu =cpu;
        this.ram = ram;
        this.ssd = ssd;
    }
    //METODO
    public String ValoresAtributos()
    {
       return "CPU:" + this.cpu + "MHz, RAM:" + this.ram + "GB, SSD:" + this.ssd + "GB";
    }
}
