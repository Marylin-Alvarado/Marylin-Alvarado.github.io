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
public class TarjetaCredito extends MetodoPago{
    protected final Long numTarjeta;
    protected final Integer codigoTarjeta;
    protected final String fechaVencimiento;

    public TarjetaCredito(Long numTarjeta, Integer codigoTarjeta, String fechaVencimiento) {
        this.numTarjeta = numTarjeta;
        this.codigoTarjeta = codigoTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "Numero de Tarjeta:" + numTarjeta + ", Codigo de la tarjeta: " + codigoTarjeta + ", Fecha de Vencimiento:" + fechaVencimiento + '}';
    }
   
}
