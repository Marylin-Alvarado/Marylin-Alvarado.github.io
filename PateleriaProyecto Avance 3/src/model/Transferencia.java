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

    public Transferencia(Long cuentaBeneficiario, Long numCedulaDest) {
        this.cuentaBeneficiario = cuentaBeneficiario;
        this.numCedulaDest = numCedulaDest;
    }

    public Transferencia(String entidadBancaria, String correoElectronico) {
        this.entidadBancaria = entidadBancaria;
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


    
    
}
