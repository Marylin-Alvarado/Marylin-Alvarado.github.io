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
public class Envio extends Pago{
    
    private String id;
    private String direccion;
    private String vehiculo;

    public Envio() {
    }

    public Envio(String id, String direccion, String vehiculo) {
        this.id = id;
        this.direccion = direccion;
        this.vehiculo = vehiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Envio{" + "id=" + id + ", direccion=" + direccion + ", vehiculo=" + vehiculo + '}';
    }
    
    
}
