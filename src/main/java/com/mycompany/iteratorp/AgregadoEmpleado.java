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
public class AgregadoEmpleado implements Agregado{
    public String[] empleados = {"juan","pablo","luis"};

    public AgregadoEmpleado() {
        System.out.println("creo lista de empleados");
    }
    
    @Override
    public IteratorEmpleado getIterador() {
        return new IteratorEmpleado(this);
    }
    
}
