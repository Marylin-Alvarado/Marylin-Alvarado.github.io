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
public final class Usuario extends Persona{
    protected final String gmail;
    protected final String contrasenia;

    public Usuario(String gmail, String contraseña) {
        this.gmail = gmail;
        this.contrasenia = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Gmail:" + gmail + ", Contraseña:" + contrasenia + '}';
    }
    
    
}
