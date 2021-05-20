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
public class dia {
    private String dia;

    public dia(String dia) {
        this.dia = dia;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("[\\d]{2}");
        Matcher mat= pat.matcher(dia);
        return (mat.matches());
    }

    public String getCelular() {
        return dia;
    }
}
