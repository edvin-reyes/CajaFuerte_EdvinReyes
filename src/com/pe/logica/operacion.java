/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.logica;

/**
 *
 * @author prantony
 */
public class operacion {


    private String tipo;
    private String monto;
    private String fecha;
    private String hora;
    

    
    public operacion(String tipo, String monto, String fecha, String hora) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.hora = hora;
    }
    public String[] getAll(){
        String[] all ={tipo,monto,fecha,hora};
        return all;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
}
