/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class logica{

    ArrayList <operacion> historial = new ArrayList();
 
    public void addRow(operacion op1){
        
       historial.add(op1);
    }
    public void crearTabla(JTable tabla){
        String[] encabezados = {"Operacion","Monto","Fecha","Hora"};
        
        DefaultTableModel modelo = new DefaultTableModel(null,encabezados);
        Iterator <operacion>iterador =  historial.iterator(); 
        while (iterador.hasNext()){
            //System.out.println(iterador.next());
            modelo.addRow(iterador.next().getAll());

        }
        tabla.setModel(modelo);

    }
    
}
