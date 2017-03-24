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
public abstract class Vehiculo 
{
    /**
     *  Variables de tipo String e Int
     */
     private String matricula;
     private int dias;
    

    /**
     * Constructor por defecto
     */
    public Vehiculo() 
    {
      matricula = "";
      dias = 0;
      
    }

    /**
     * Constructor con parametros 
     * @param matricula
     * @param dias 
     */
    public Vehiculo(String matricula, int dias) 
    {
        this.matricula = matricula;
        this.dias = dias;
        
    }

      /**
     * Metodos get y set
     * @return 
     */

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public int getDias() 
    {
        return dias;
    }

    public void setDias(int dias) 
    {
        this.dias = dias;
    }
    /**
     * Metodo abstracto que devolvera un double
     * @return 
     */
     public abstract  double importeAlquiler();
     /**
      * Metodo abstracto que devolvera un double 
      * @return 
      */
     
     public abstract void recibo();
     
     
     
    
        
    
    
    
    
    
    
}
