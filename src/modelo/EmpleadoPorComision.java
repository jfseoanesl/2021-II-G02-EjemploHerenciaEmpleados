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
public class EmpleadoPorComision extends EmpleadoBasico {
    private double ventasDelMes;
    private double pComision;

    public EmpleadoPorComision() {
        super();
    }

    public EmpleadoPorComision(double ventasDelMes, double pComision, double horasTrabajadas, double pagoPorHora) {
        super(horasTrabajadas, pagoPorHora);
        this.ventasDelMes = ventasDelMes;
        this.pComision = pComision;
    }

    /**
     * @return the ventasDelMes
     */
    public double getVentasDelMes() {
        return ventasDelMes;
    }

    /**
     * @param ventasDelMes the ventasDelMes to set
     */
    public void setVentasDelMes(double ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }

    /**
     * @return the pComision
     */
    public double getpComision() {
        return pComision;
    }

    /**
     * @param pComision the pComision to set
     */
    public void setpComision(double pComision) {
        this.pComision = pComision;
    }
    
    @Override
    public double calcularSueldo(){
        //double sueldoBasico = this.getHorasTrabajadas() * this.getPagoPorHora();
        double comision = this.pComision * this.ventasDelMes;
        return super.calcularSueldo() + comision;
    }
    
    
    
}
