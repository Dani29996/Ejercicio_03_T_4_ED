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
public class Bus extends VehiculoTransporte 
{

    public Bus() 
    {
        super();
    }

    public Bus(String matricula, int dias, int numero_plazas_vehiculo) 
    {
        super(matricula, dias, numero_plazas_vehiculo);
    }

    @Override
    public void recibo() 
    {
        System.out.println("-------------------- BUS\n"
                + "--------------------");
        System.out.println("Información: ");
        super.recibo();
    }

    @Override
    public double importeAlquiler() 
    {
        double importe;
        importe = 50 * this.getDias() + (1.50 * this.getNumero_plazas_vehiculo() * this.getDias() + 2 * this.numero_plazas_vehiculo);
        return importe;

    }

}
