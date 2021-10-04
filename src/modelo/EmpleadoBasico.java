/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jairo
 */
public  class EmpleadoBasico {
    private double  horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoBasico() {
    }

    public EmpleadoBasico(double horasTrabajadas, double pagoPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    /**
     * @return the horasTrabajadas
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * @param horasTrabajadas the horasTrabajadas to set
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * @return the pagoPorHora
     */
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    /**
     * @param pagoPorHora the pagoPorHora to set
     */
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    
    
    public double calcularSueldo(){
        return this.horasTrabajadas * this.pagoPorHora;
    }
    
}
