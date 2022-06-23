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
public class CarritoCompra extends Cliente{
    private date fechaPedido;
    
    private static class date {

        public date() {
        }
    }
    public CarritoCompra(String telefono, String direccion) {
        super(telefono, direccion);
    }

    @Override
    public String toString() {
        return "CarritoCompra{" + "fechaPedido=" + fechaPedido + '}';
    }
    
    
}
