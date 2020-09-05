/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.iteratorp;

/**
 *
 * @author User
 */
public class IteratorEmpleado implements IteratorI{
    private String[] empleados;
    private int _posicion;

    public IteratorEmpleado(AgregadoEmpleado empleados) {
        this.empleados = empleados.empleados;
        this._posicion = 0;
    }
    
    
    @Override
    public Object siguiente() {
        if(haymas()){
            String valor = empleados[_posicion];
            _posicion++;
            System.out.println("empleado: "+valor);
            return valor;
        }else{
            return null;
        }
        
    }

    @Override
    public boolean haymas() {
        if(_posicion<empleados.length){
            System.out.println("si hay mas");
            return true;
        }else{
            System.out.println("no hay mas");
            return false;
        }
    }
    
}
