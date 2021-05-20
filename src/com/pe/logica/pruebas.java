/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.logica;

/**
 *
 * @author User
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        operacion ob1 = new operacion("operacion","monto","s","a");
        operacion ob2 = new operacion("retiro","monto","s","a");
        operacion ob3 = new operacion("operacion","t","s","a");
        
        logica banco = new logica();
        
        banco.addRow(ob1);
    }
    
}
