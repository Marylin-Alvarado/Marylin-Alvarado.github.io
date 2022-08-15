/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.util.LinkedList;
import java.util.List;

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
    private Float iva;
    private Float montoTotal;
    
    
    private Float subTotal;
    private Float total;
    private Float valorIva;
    
    private List<Descripcion> descripcionList;
    
     

    public Facturacion() {
     
        subTotal = 0f;
        valorIva = 0f;
        total = 0f;
    }
    
    
    public Facturacion(String nombre, String cedula, String telefono, String ciudad, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Facturacion(Float montoArticulo, Float iva, Float montoTotal) {
        this.montoArticulo = montoArticulo;
        this.iva = iva;
        this.montoTotal = montoTotal;
    }

    public Facturacion(Float subTotal, Float total, Float valorIva, List<Producto> ItemList) {
        this.subTotal = subTotal;
        this.total = total;
        this.valorIva = valorIva;
      
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getValorIva() {
        return valorIva;
    }

    public void setValorIva(Float valorIva) {
        this.valorIva = valorIva;
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

    public List<Descripcion> getDescripcionList() {
        return descripcionList;
    }

    public void setDescripcionList(List<Descripcion> descripcionList) {
        this.descripcionList = descripcionList;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Facturacion{" + "nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }

    void setEmpresa(Empresa empresa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void agregarProducto(Producto pastel, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
