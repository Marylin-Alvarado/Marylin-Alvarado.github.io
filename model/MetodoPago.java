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
public class MetodoPago extends Pago{
    
    private Transferencia tranferencia;
    private TarjetaCredito tarjetaCredito;
    private Float efectivo;

    public MetodoPago() {
    }

    public MetodoPago(Transferencia tranferencia, TarjetaCredito tarjetaCredito, Float efectivo) {
        this.tranferencia = tranferencia;
        this.tarjetaCredito = tarjetaCredito;
        this.efectivo = efectivo;
    }

    public Transferencia getTranferencia() {
        return tranferencia;
    }

    public void setTranferencia(Transferencia tranferencia) {
        this.tranferencia = tranferencia;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Float getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Float efectivo) {
        this.efectivo = efectivo;
    }

    public MetodoPago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoPago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "tranferencia=" + tranferencia + ", tarjetaCredito=" + tarjetaCredito + ", efectivo=" + efectivo + '}';
    }
    
    
    
}
