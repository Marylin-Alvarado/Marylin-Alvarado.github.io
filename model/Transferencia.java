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
public class Transferencia extends MetodoPago{
  
    protected Long cuentaBeneficiario;
    private String entidadBancaria;
    protected  Long numCedulaDest;
    protected  String correoElectronico;

    public Transferencia() {
    }

    public Transferencia(Long cuentaBeneficiario, String entidadBancaria, Long numCedulaDest, String correoElectronico) {
        this.cuentaBeneficiario = cuentaBeneficiario;
        this.entidadBancaria = entidadBancaria;
        this.numCedulaDest = numCedulaDest;
        this.correoElectronico = correoElectronico;
    }

    public Long getCuentaBeneficiario() {
        return cuentaBeneficiario;
    }

    public void setCuentaBeneficiario(Long cuentaBeneficiario) {
        this.cuentaBeneficiario = cuentaBeneficiario;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public Long getNumCedulaDest() {
        return numCedulaDest;
    }

    public void setNumCedulaDest(Long numCedulaDest) {
        this.numCedulaDest = numCedulaDest;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     *
     * @return
     */
    @Override
    public MetodoPago getMetodoDePago() {
        return metodoDePago;
    }

    @Override
    public void setMetodoDePago(MetodoPago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "cuentaBeneficiario=" + cuentaBeneficiario + ", entidadBancaria=" + entidadBancaria + ", numCedulaDest=" + numCedulaDest + ", correoElectronico=" + correoElectronico + '}';
    }
    
    
    
}
