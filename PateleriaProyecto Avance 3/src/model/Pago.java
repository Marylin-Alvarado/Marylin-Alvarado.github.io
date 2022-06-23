/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.time.Clock.system;

/**
 *
 * @author Edison
 */
public class Pago {
    //public  MetodoPago metodoDePago;
    public Float total;

    public Pago(Float total) {
        this.total = total;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    
    public void sumarDescuentoMonto (){
        System.out.println("");
    }
    
}

