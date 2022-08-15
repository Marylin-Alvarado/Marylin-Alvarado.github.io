/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author Edison
 */
public class CarritoCompra extends Cliente{
    private date fechaPedido;
    
    private static class date {

        public date() {
            
        }
    }
    public CarritoCompra(String telefono, String direccion) {
        super(telefono, direccion);
    }

    public date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "CarritoCompra{" + "fechaPedido=" + fechaPedido + '}';
    }
    
    
}
