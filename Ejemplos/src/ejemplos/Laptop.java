
package ejemplos;
public class Laptop extends Computadora {
    /* Atributos */
    public int bateria;
    /* Constructor */
    public Laptop(Double cpu, Double ram, Double ssd, int bateria){
        /* Invocación del constructor de la clase base (super) */
       // [Constructor]
        super(cpu,ram,ssd);
        this.bateria = bateria;
    }
    /* Método sobrescrito */
    
    @Override
    public String ValoresAtributos()//[Sobrescribir método]
    {
        return  super.ValoresAtributos() + this.bateria;//[Valor retornado];
    }

}
