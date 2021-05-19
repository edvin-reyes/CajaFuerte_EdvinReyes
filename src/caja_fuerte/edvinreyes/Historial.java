/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja_fuerte.edvinreyes;

/**
 *
 * @author Usuario
 */
public class Historial {
   
   public String dia,mes,hora,minutos;
   public int año;
   

   
    public String getDia() {
        return dia;
    }

    public String getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getHora() {
        return hora;
    }

    public String getMin() {
        return minutos;
    }

    public Historial( String dia, String mes, int año, String hora, String minutos) {
        this.dia = dia;
        this.mes = mes;
        this.año = 2021;
        this.hora = hora;
        this.minutos = minutos;
    }
    
}
