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
public class Pago {
    public  MetodoPago metodoDePago;

    public Pago() {
    }

    public Pago(MetodoPago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public MetodoPago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoPago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "Pago{" + "metodoDePago=" + metodoDePago + '}';
    }
    
    
    
    
}
