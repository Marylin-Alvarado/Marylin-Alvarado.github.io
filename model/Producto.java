/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.util.List;

/**
 *
 * @author Edison
 */
public class Producto {
    
    private String nombreItem;
    private Integer unidad;
    private Double precio;
    
    
    
   
    public  Producto() {
    }

    public Producto(String nombre) {
        this.nombreItem = nombre;
    }

    public Producto(Integer unidad) {
        this.unidad = unidad;
    }

    public Producto(Double precio) {
        this.precio = precio;
    }

    Producto(String pastel, float f, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombre) {
        this.nombreItem = nombre;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombreItem + ", unidad=" + unidad + ", precio=" + precio + '}';
    }

    
}
