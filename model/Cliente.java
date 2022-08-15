/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Edison
 */
public class Cliente extends Persona{
    private String gmail;
    private String contrasenia;

    public Cliente(String gmail, String contrasenia) {
        this.gmail = gmail;
        this.contrasenia = contrasenia;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "gmail=" + gmail + ", contrasenia=" + contrasenia + '}';
    }

    
    
    
    
    
    
    
}
