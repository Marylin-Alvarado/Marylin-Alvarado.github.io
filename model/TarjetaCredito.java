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
    
    protected Long numTarjeta;
    protected Integer codigoTarjeta;
    protected String fechaVencimiento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(Long numTarjeta, Integer codigoTarjeta, String fechaVencimiento) {
        this.numTarjeta = numTarjeta;
        this.codigoTarjeta = codigoTarjeta;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(Long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Integer getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(Integer codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public MetodoPago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoPago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "numTarjeta=" + numTarjeta + ", codigoTarjeta=" + codigoTarjeta + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    
    
}
