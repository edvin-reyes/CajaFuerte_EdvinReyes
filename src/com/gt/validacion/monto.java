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
public class monto {
    private String monto;

    public monto(String dia) {
        this.monto = dia;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("[\\d]*[\\.]+[\\d]*");
        Matcher mat= pat.matcher(monto);
        return (mat.matches());
    }

    public String getCelular() {
        return monto;
    }
    
}
