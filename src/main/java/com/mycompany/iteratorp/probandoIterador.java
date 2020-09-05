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
public class probandoIterador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AgregadoEmpleado empleados = new AgregadoEmpleado();
        IteratorI iterador = empleados.getIterador();
        iterador.haymas();
        iterador.siguiente();
        iterador.siguiente();
        
    }
    
}
