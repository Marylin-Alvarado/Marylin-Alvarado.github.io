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
public class Personal extends Persona{
    private String telefono;
    private String direccion;
    private String ocupacion;
    private Float sueldo;
    
    public void marcarAsistencia(){
        System.out.println("Marcar Asistencia");
    }

    public Personal() {
        
    }

    public Personal(String telefono, String direccion, String ocupacion) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
    }

    public Personal(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal{" + "telefono=" + telefono + ", direccion=" + direccion + ", ocupacion=" + ocupacion + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
