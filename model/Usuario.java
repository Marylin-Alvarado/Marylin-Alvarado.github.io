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
public class Usuario extends Persona{
    
    private String cliente;
    private String personal;

    public Usuario() {
    }

    public Usuario(String cliente, String personal) {
        this.cliente = cliente;
        this.personal = personal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cliente=" + cliente + ", personal=" + personal + '}';
    }

    
    
    
    
}
