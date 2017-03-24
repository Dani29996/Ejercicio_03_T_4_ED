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
public abstract class VehiculoTransporte extends Vehiculo
{
    /**
     * Esta clase extiende de vehiculo
     * variable de tipo entereo
     */
    int numero_plazas_vehiculo;

    /**
     * Constructor por defecto
     */
    public VehiculoTransporte() 
    {
        super();
        numero_plazas_vehiculo = 0;
    }
    /**
     * Constructor con parametros
     * @param matricula del vehiculo
     * @param dias de alquiler
     * @param numero_plazas_vehiculo numero de plazas
     */

    public VehiculoTransporte(String matricula, int dias, int numero_plazas_vehiculo) 
    {
        super(matricula, dias);
        numero_plazas_vehiculo = numero_plazas_vehiculo;
    }

    /**
     * Metodos get y set 
     * @return 
     */
    public int getNumero_plazas_vehiculo() 
    {
        return numero_plazas_vehiculo;
    }

    public void setNumero_plazas_vehiculo(int numero_plazas_vehiculo) 
    {
        this.numero_plazas_vehiculo = numero_plazas_vehiculo;
    }
    /**
     * Metodo abstracto
     * @return 
     */
    @Override
     public abstract  double importeAlquiler();
     /**
      * El metodo recibo muestra los parametros
      */
     
     public void recibo ()
     {
         System.out.println("Matricula: "+ this.getMatricula());
         System.out.println("Duración: "+ this.getDias());
         System.out.println("Plazas: "+ this.getNumero_plazas_vehiculo());
         System.out.println("Importe: "+ this.importeAlquiler());
     }
     
     
    
    
    
    
}
