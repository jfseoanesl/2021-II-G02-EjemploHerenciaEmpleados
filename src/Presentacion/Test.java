/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import modelo.*;

/**
 *
 * @author jairo
 */
public class Test {
    public static void main(String[] args) {
        
        EmpleadoBasico eb = new EmpleadoBasico(300, 50);
        System.out.println("Sueldo mensual empleado basico: " + eb.calcularSueldo());
        
        EmpleadoPorComision ec = new EmpleadoPorComision(5000, 0.01, 300, 50);
        System.out.println("Sueldo mensual empleado por comision: " + ec.calcularSueldo());
        
        
    }
}
