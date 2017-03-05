package loo_p4_ortega_pelaez;
/**
 * @author HasselOrtega
 */
class Laptop extends Computadora
{
    //Atributos
    public int bateria;

    //Constructor
    public Laptop(Double cpu, Double ram, Double ssd, int bateria) {
        //[Invocación del constructor de la clase base (super)]
        super(cpu, ram, ssd);
        this.bateria = bateria;
    }
    /* Método sobrescrito */
  //[Sobrescribir el método ValoresAtributos]
    @Override
    public String ValoresAtributos()
    {
       return super.ValoresAtributos()+ ", "+ "Bateria:" + this.bateria + " Hours";
    }
}
