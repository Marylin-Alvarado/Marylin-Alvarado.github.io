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
    private String telefono;
    private String direccion;

    public Cliente(String telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
    
}
