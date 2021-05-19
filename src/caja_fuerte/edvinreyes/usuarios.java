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
public class usuarios {
    public int pin;
    public String nombre;
    public String apellido;
    public int edad;
    public String dpi;

    public int getPin() {
        return pin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDpi() {
        return dpi;
    }

    public usuarios(int pin, String nombre, String apellido, int edad, String dpi) {
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dpi = dpi;
    }
    
    
}
