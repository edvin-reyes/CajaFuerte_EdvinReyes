/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gt.validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class minuto {
    private String minuto;

    public minuto(String dia) {
        this.minuto = dia;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("[\\d]{2}");
        Matcher mat= pat.matcher(minuto);
        return (mat.matches());
    }

    public String getCelular() {
        return minuto;
    }
    
}
