/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author edisoncor
 */
public class Descripcion {
    
    private Integer cantidad;
    private Float precioUnitario;
    private Float valorTotal;
    
    
    private Facturacion factura;
    private Producto producto;
    
     private List<Producto> productoList;
    

    public Descripcion(Integer cantidad, Facturacion factura, Producto producto) {
        this.cantidad = cantidad;
        this.factura = factura;
        this.producto = producto;
        this.calcularValorTotal();
    }
    
    public void calcularValorTotal(){
        this.precioUnitario = this.producto.getUnidad()* 1.25f;
        this.valorTotal = this.cantidad * this.precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Facturacion getFactura() {
        return factura;
    }

    public void setFactura(Facturacion factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public String toString() {
        return "Descripcion{" + "cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", valorTotal=" + valorTotal + ", factura=" + factura + ", producto=" + producto + ", productoList=" + productoList + '}';
    }
    
    
    
}
