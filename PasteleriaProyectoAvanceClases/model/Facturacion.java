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
public class Facturacion extends Pago{
    private String nombre;
    private String cedula;
    private String telefono;
    private String ciudad;
    private String direccion;
    private Float montoArticulo;
    private Float descuento;
    private Float iva;
    private Float montoTotal;

    public Facturacion(String nombre, String cedula, String telefono, String ciudad, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Facturacion(Float montoArticulo, Float descuento, Float iva, Float montoTotal) {
        this.montoArticulo = montoArticulo;
        this.descuento = descuento;
        this.iva = iva;
        this.montoTotal = montoTotal;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Float getMontoArticulo() {
        return montoArticulo;
    }

    public void setMontoArticulo(Float montoArticulo) {
        this.montoArticulo = montoArticulo;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    
    @Override
    public String toString() {
        return "Facturacion{" + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
}
