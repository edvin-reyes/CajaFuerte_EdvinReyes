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
public class mes {
    private String mes;

    public mes(String dia) {
        this.mes = mes;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("[a-z]{4,9}");
        Matcher mat= pat.matcher(mes);
        return (mat.matches());
    }

    public String getCelular() {
        return mes;
    }
    
}
