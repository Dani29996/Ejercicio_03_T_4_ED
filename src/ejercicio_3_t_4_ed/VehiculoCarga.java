/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_t_4_ed;

/**
 *
 * @author poniente
 */
public abstract class  VehiculoCarga extends Vehiculo
{

    /**
     * Variable de tipo double
     */
    private double tara;

    /**
     * Constructor por defecto
     */
    public VehiculoCarga() 
    {
        tara = 0.0;
    }

    /**
     * Constructor con parametros
     *
     * @param tara del vehiculo
     * @param matricula del vehiculo
     * @param dias alquilados
     */
    public VehiculoCarga(double tara, String matricula, int dias) 
    {
        super(matricula, dias);
        this.tara = tara;
    }

    /**
     * Metodos get y set
     *
     * @return
     */
    public double getTara() 
    {
        return tara;
    }

    public void setTara(double tara) 
    {
        this.tara = tara;
    }

    /**
     * Metodo abstracto
     *
     * @return
     */
    @Override
    public abstract double importeAlquiler();
    /**
     * Metodo recibo que nos devuelve los valores como en la clase anterior 
     * Pero en esta quitemoa el numero_plazas_vehiculo y ponemos tara
     */

    public void recibo() 
    {
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Duración: " + this.getDias());
        System.out.println("Tara: " + this.getTara());
        System.out.println("Importe: " + this.importeAlquiler());
    }

}
