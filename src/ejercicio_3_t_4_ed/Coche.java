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
public class Coche extends VehiculoTransporte
{

    /**
     * Constructor por defecto
     */

    public Coche() 
    {
        super();
    }

    /**
     * Constructor con parametros
     *
     * @param matricula del coche
     * @param dias alquilado
     * @param numero_plazas_vehiculo numero del plazas del vehiculo
     */

    public Coche(String matricula, int dias, int numero_plazas_vehiculo) 
    {
        super(matricula, dias, numero_plazas_vehiculo);
    }

    /**
     * Ponermos el @Override para sobreescrbir el metodo
     */

    @Override
    /**
     * Sobreescribimos el metodo Nos devolvera el recibo del coche
     */
    public void recibo() 
    {

        System.out.println("-------------------- COCHE\n"
                + "-------------------- ");
        System.out.println("Informacion: ");
        super.recibo();
    }

    /**
     * Utilizamos @Override para sobreescribir el metodo
     *
     * @return nos devolvera el importe calculado
     */
    @Override
    public double importeAlquiler() 
    {
        double importe;

        importe = 50 * this.getDias() + (1.50 * this.getNumero_plazas_vehiculo() * this.getDias());
        return importe;
    }

}
