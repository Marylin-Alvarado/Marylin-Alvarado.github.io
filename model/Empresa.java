/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Empresa {
    
    private String autorizacion;
    private String nombre;
    private String ruc;
    private Integer porcentajeIVA;
    
    private List<Facturacion> facturacionList;
    private List<Producto> productoList;
    private Direccion direccion;

    public Empresa() {
        facturacionList = new LinkedList<>();
    }
    
    public Empresa(String autoriazacion, String nombre, String ruc) {
        this();
        this.autorizacion = autoriazacion;
        this.nombre = nombre;
        this.ruc = ruc;
    }

    public Empresa(String autoriazacion, String nombre, String ruc, Integer porcentajeIVA) {
        this(autoriazacion, nombre, ruc);
        this.porcentajeIVA = porcentajeIVA;
    }
    

    public String getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(String autoriazacion) {
        this.autorizacion = autoriazacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public List<Facturacion> getFacturaList() {
        return facturacionList;
    }

    public void setFacturaList(List<Facturacion> facturaList) {
        this.facturacionList = facturaList;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Integer getPorcentajeIVA() {
        return porcentajeIVA;
    }

    public void setPorcentajeIVA(Integer porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }

    public Iterable<gui.Facturacion> getFacturacionList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Direccion {

        public Direccion() {
        }
    }
    
    
    
}
